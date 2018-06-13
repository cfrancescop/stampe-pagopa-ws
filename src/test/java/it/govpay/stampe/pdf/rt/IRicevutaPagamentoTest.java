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
package it.govpay.stampe.pdf.rt;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

import it.govpay.model.Anagrafica;
import it.govpay.model.RicevutaPagamento;
import it.govpay.stampe.pdf.avviso.AvvisoPagamentoProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class IRicevutaPagamentoTest.
 */
public class IRicevutaPagamentoTest {
	
	/** The i ricevuta pagamento. */
	IRicevutaPagamento iRicevutaPagamento;
	
	/**
	 * Setup.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setup() throws Exception {
		AvvisoPagamentoProperties.newInstance("/var/govpay");
		iRicevutaPagamento = new RicevutaPagamentoPdf();
		RicevutaPagamentoProperties.newInstance("/var/govpay");
	}
	
	/**
	 * Write a test pdf under /tmp/testRicevutaPagamento.pdf
	 * usando il dominio di torino.
	 * Nel pdf deve comparire il logo del comune e di pagopa
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStampa() throws Exception {
		
		RicevutaPagamentoProperties ricevutaPagamentoProperties = RicevutaPagamentoProperties.getInstance();
		assertNotNull(ricevutaPagamentoProperties);
		Properties propertiesAvvisoPagamentoDominioTributo = RicevutaPagamentoUtils.getRicevutaPagamentoPropertiesPerDominioTributo(ricevutaPagamentoProperties, "0");
		assertNotNull(propertiesAvvisoPagamentoDominioTributo);
		try(OutputStream os = new FileOutputStream("/tmp/testRicevutaPagamento.pdf")){
			
			RicevutaPagamento ricevuta=new RicevutaPagamento();
			ricevuta.setCodDominio("00514490010");
			ricevuta.setImportoPagato(BigDecimal.TEN);
			Anagrafica anagraficaDebitore=new Anagrafica();
			anagraficaDebitore.setCodUnivoco("PIRRONE FRANCESCO (CODICE FISCALE)");
			Anagrafica anagraficaCreditore=new Anagrafica();
			anagraficaCreditore.setCodUnivoco("Comune di Torino (00514490010)");
			ricevuta.setAnagraficaCreditore(anagraficaCreditore);
			ricevuta.setAnagraficaDebitore(anagraficaDebitore);
			ricevuta.setDataPagamento(new Date());
			iRicevutaPagamento.getPdfRicevutaPagamento(ricevuta, propertiesAvvisoPagamentoDominioTributo, os);
		}
	}
}
