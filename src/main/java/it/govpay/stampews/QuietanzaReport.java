/*
 *   This file is part of stampe-pagopa-ws.
 *   
 *   stampe-pagopa-ws is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *   
 *   stampe-pagopa-ws is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *   
 *   You should have received a copy of the GNU General Public License
 *   along with Nome-Programma.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.govpay.stampews;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.govpay.stampe.pdf.avviso.AvvisoPagamentoProperties;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JsonDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import static org.apache.commons.lang3.StringUtils.trimToEmpty;
// TODO: Auto-generated Javadoc

/**
 * The Class QuietanzaReport.
 */
@Component
public class QuietanzaReport {
	
	/** The json. */
	@Autowired
	ObjectMapper json;
	
	/**
	 * Export to stream.
	 *
	 * @param input the input
	 * @param outputStream the output stream
	 * @throws Exception the exception
	 */
	public void exportToStream(StampaQuietanza input, OutputStream outputStream)
			throws Exception {
		InputStream jasperTemplateInputStream = this.getClass().getResourceAsStream("/Quietanza.jasper");// new
																												// FileInputStream("/home/pintori/Downloads/Jasper_1/AvvisoPagamento.jasper");
		

		// converte l'oggetto in xml
		JRDataSource dataSource = createDataSource(input);
		final Map<String, Object> parameters = new HashMap<>();
		
		// caricaLoghiAvvisoFromProps(parameters, propertiesAvvisoPerDominio);
		parameters.put("ente_logo", AvvisoPagamentoProperties.getImmagineEnte(input.getEnteIndentificativo()));
		parameters.put("ente_area",StringUtils.trimToEmpty( input.getEnteArea()));
		parameters.put("ente_denominazione",StringUtils.trimToEmpty( input.getEnteDenominazione()));
		parameters.put("totale", input.getTotale() != null ? input.getTotale() : BigDecimal.ZERO);
		
		parameters.put("avviso_iuv",trimToEmpty(input.getIuv()) );
		parameters.put("avviso_numero",trimToEmpty(input.getCodiceAvviso()) );
		parameters.put("avviso_data_pagamento",trimToEmpty(input.getDataPagamento()) );
		parameters.put("avviso_data_emissione",trimToEmpty(input.getDataEmissione()) );
		
		parameters.put("ente_identificativo", trimToEmpty(input.getEnteIndentificativo()));
		parameters.put("intestatario_denominazione",trimToEmpty( input.getIntestatarioDenominazione()));
		parameters.put("intestatario_identificativo",trimToEmpty( input.getIntestatarioIdentificativo()));
		parameters.put("intestatario_indirizzo_1",trimToEmpty( input.getIntestatarioIndirizzo()));
		parameters.put("intestatario_indirizzo_2",trimToEmpty(  input.getIntestatarioArea()));
		// inserisce il logo di defaul(Rep. Italiana)
		JasperPrint jasperPrint = creaJasperPrintAvviso(jasperTemplateInputStream, dataSource, parameters);
		JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
	}
	
	/**
	 * Crea jasper print avviso.
	 *
	 * @param jasperTemplateInputStream the jasper template input stream
	 * @param dataSource the data source
	 * @param parameters the parameters
	 * @return the jasper print
	 * @throws Exception the exception
	 */
	public JasperPrint creaJasperPrintAvviso(InputStream jasperTemplateInputStream, JRDataSource dataSource,
			Map<String, Object> parameters) throws Exception {
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperTemplateInputStream);
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		return jasperPrint;
	}
	
	/**
	 * Creates the data source.
	 *
	 * @param input the input
	 * @return the JR data source
	 * @throws JRException the JR exception
	 * @throws JsonProcessingException the json processing exception
	 */
	protected JRDataSource createDataSource(StampaQuietanza input) throws JRException, JsonProcessingException {
		String bytes = json.writeValueAsString(input);
		ByteArrayInputStream io = new ByteArrayInputStream(bytes.getBytes());
		
		JsonDataSource dataSource=  new JsonDataSource(io, "causali");
		return dataSource;
	}
}
