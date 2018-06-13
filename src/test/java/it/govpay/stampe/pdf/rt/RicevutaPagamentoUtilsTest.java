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



import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import it.govpay.model.Anagrafica;
import it.govpay.model.Dominio;
import it.govpay.model.RicevutaPagamento;

// TODO: Auto-generated Javadoc
/**
 * The Class RicevutaPagamentoUtilsTest.
 */
public class RicevutaPagamentoUtilsTest {
	
	/**
	 * Setup.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setup() throws Exception {

		RicevutaPagamentoProperties.newInstance("");
	}
	
	/**
	 * Write a test pdf under /tmp/testUtils.pdf
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testRicevutaPagamento() throws Exception {
		try(OutputStream osAPPdf = new FileOutputStream("/tmp/testUtils.pdf")){
			RicevutaPagamento ricevuta=new RicevutaPagamento();
			ricevuta.setImportoPagato(BigDecimal.TEN);
			Dominio dominioCreditore=new Dominio();
			dominioCreditore.setCodDominio("0");
			ricevuta.setDominioCreditore(dominioCreditore);
			RicevutaPagamentoUtils.getPdfRicevutaPagamento(ricevuta, osAPPdf);
		}
	}
	
	/**
	 * Write a test pdf under /tmp/testRt.pdf
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testRt() throws Exception {
		//logo dominio
		//causale
		//rt grezzo
		
		
		
		
		RicevutaPagamento input=new RicevutaPagamento();
		Anagrafica anagraficaDebitore=new Anagrafica();
		anagraficaDebitore.setCodUnivoco("CFDEBITORE");
		anagraficaDebitore.setRagioneSociale("MARIO ROSSI");
		anagraficaDebitore.setIndirizzo("VIA ...");

		
		Anagrafica anagraficaCreditore=new Anagrafica();
		anagraficaCreditore.setCodUnivoco("00514490010");
		anagraficaCreditore.setRagioneSociale("AREA FINANZE E ONERI TRIBUTI");
		anagraficaCreditore.setCap("10129");
		//anagraficaCreditore.setIndirizzo("VIA XX YY");
		anagraficaCreditore.setCivico("13");
		anagraficaCreditore.setCellulare("CEL");
		anagraficaCreditore.setNazione("Italia");
		anagraficaCreditore.setLocalita("Collegno");
		anagraficaCreditore.setTelefono("123456789");
		
		
		
		Dominio dominioCreditore=new Dominio();
		
		dominioCreditore.setAbilitato(true);
		dominioCreditore.setAuxDigit(1);
		dominioCreditore.setCodDominio("00514490010");
		dominioCreditore.setContiAccredito("TEST".getBytes());
		dominioCreditore.setRagioneSociale("Comune di Torino");
		input.setDominioCreditore(dominioCreditore);
		input.setCodDominio("00514490010");
//		String barCode = "415808888835606080203017300000000075173902078";
//		input.setBarCode(barCode);
		
//		String qrCode="PAGOPA|002|301730000000007517|00514490010|078";
//		input.setQrCode(qrCode);
		input.setImportoPagato(BigDecimal.TEN);
		
		input.setAnagraficaCreditore(anagraficaCreditore);
		input.setAnagraficaDebitore(anagraficaDebitore);
		//input.setImporto(BigDecimal.TEN);
		input.setIuv("011011001100110011");
		input.setCausale("Causale particolarmente lunga per vedere l'effetto che fa sul pdf generato");
		//input.setCodiceAvviso("CODICE AVVISO");
		input.setCodVersamento("CODICE VERSAMENTO");
		input.setDataScadenza(new Date());
		try(OutputStream osAPPdf=new FileOutputStream("/tmp/testRt.pdf")){
			//RicevutaPagamentoUtils.getPdfRicevutaPagamento(logoDominio, causale, rt, auxDigit, applicationCode, osAPPdf, log);
			
			RicevutaPagamentoUtils.getPdfRicevutaPagamento(input, osAPPdf);
		}
	}
}
