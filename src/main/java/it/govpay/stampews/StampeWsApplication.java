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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.govpay.model.RicevutaPagamento;
import it.govpay.stampe.pdf.avviso.AvvisoPagamentoInput;
import it.govpay.stampe.pdf.avviso.AvvisoPagamentoPdf;
import it.govpay.stampe.pdf.rt.IRicevutaPagamento;
import it.govpay.stampe.pdf.rt.RicevutaPagamentoProperties;
import it.govpay.stampe.pdf.rt.RicevutaPagamentoUtils;



// TODO: Auto-generated Javadoc
/**
 * The Class StampeWsApplication.
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses=StampeWsApplication.class)
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,FreeMarkerAutoConfiguration.class})
//@SpringBootApplication
@RestController

public class StampeWsApplication {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(StampeWsApplication.class);
	
	/** The avviso pagamento pdf. */
	@Autowired AvvisoPagamentoPdf avvisoPagamentoPdf;
	
	/** The i ricevuta pagamento. */
	@Autowired
	IRicevutaPagamento iRicevutaPagamento;
	
	/** The ricevuta pagamento properties. */
	@Autowired
	RicevutaPagamentoProperties ricevutaPagamentoProperties;
	
	/** The quietanza report. */
	@Autowired
	QuietanzaReport quietanzaReport;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(StampeWsApplication.class, args);
		} catch (RuntimeException e) {
			log.error("Errror during start application", e);
		}

	}

	

	/**
	 * Prints the pdf avviso.
	 *
	 * @param request the request
	 * @return the byte[]
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws Exception the exception
	 */
	@PostMapping(path = "/avviso/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
	public byte[] printPdfAvviso(@RequestBody PrintAvviso request) throws IOException, Exception {
		log.info("Print avviso di pagamento");
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		AvvisoPagamentoInput input = PrintAvviso.toAvviso(request);
		avvisoPagamentoPdf.exportToStream(input, request.dominioCreditore.codDominio, outputStream);
		return outputStream.toByteArray();
	}

	/**
	 * Prints the pdf rt.
	 *
	 * @param ricevuta the ricevuta
	 * @return the byte[]
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws Exception the exception
	 */
	@PostMapping(path = "/rt/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
	public byte[] printPdfRt(@RequestBody RicevutaPagamento ricevuta) throws IOException, Exception {
		log.info("Print RT");
		ByteArrayOutputStream os = new ByteArrayOutputStream();

		Properties propertiesAvvisoPagamentoDominioTributo = RicevutaPagamentoUtils.getRicevutaPagamentoPropertiesPerDominioTributo(ricevutaPagamentoProperties, ricevuta.getCodDominio());
		iRicevutaPagamento.getPdfRicevutaPagamento(ricevuta, propertiesAvvisoPagamentoDominioTributo, os);
		return os.toByteArray();
	}
	
	/**
	 * Prints the pdf quietanza.
	 *
	 * @param quietanza the quietanza
	 * @return the byte[]
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws Exception the exception
	 */
	@PostMapping(path = "/quietanza/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
	public byte[] printPdfQuietanza(@RequestBody StampaQuietanza quietanza) throws IOException, Exception {
		log.info("Print Quietanza");
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		quietanzaReport.exportToStream(quietanza, os);
		return os.toByteArray();
	}

	
}
