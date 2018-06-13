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

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.SAXException;

import it.govpay.model.RicevutaPagamento;
import it.govpay.stampews.PrintAvviso.Anagrafica;
import it.govpay.stampews.PrintAvviso.Dominio;
import it.govpay.stampews.StampaQuietanza.VoceQuietanza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Date;

import javax.xml.bind.JAXBException;

// TODO: Auto-generated Javadoc
/**
 * The Class StampeWsApplicationTests.
 *
 * @author Marcin Grzejszczak
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StampeWsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class StampeWsApplicationTests {
	

	/** The port. */
	@LocalServerPort
	private int port;

	/** The test rest template. */
	@Autowired
	private TestRestTemplate testRestTemplate;

	/**
	 * Should write pdf RT.
	 *
	 * @throws InterruptedException the interrupted exception
	 * @throws JAXBException the JAXB exception
	 * @throws SAXException the SAX exception
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws URISyntaxException the URI syntax exception
	 */
	@Test
	public void shouldWritePdfRT() throws InterruptedException, JAXBException, SAXException, FileNotFoundException,
			IOException, URISyntaxException {
		// registration has to take place...
	
		RicevutaPagamento ricevuta = new RicevutaPagamento();
		ricevuta.setImportoPagato(BigDecimal.TEN);

		it.govpay.model.Anagrafica cred = new it.govpay.model.Anagrafica();
		cred.setCodUnivoco("Comune di Torino (00514490010)");
		ricevuta.setAnagraficaCreditore(cred);
		it.govpay.model.Anagrafica deb = new it.govpay.model.Anagrafica();
		ricevuta.setAnagraficaDebitore(deb);
		deb.setCodUnivoco("PIRRONE FRANCESCO (CODICE FISCALE)");
		ricevuta.setDataPagamento(new Date());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<RicevutaPagamento> request = new HttpEntity<>(ricevuta, headers);
		ResponseEntity<byte[]> response = this.testRestTemplate
				.postForEntity("http://localhost:" + this.port + "/rt/pdf", request, byte[].class);

		then(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		try (FileOutputStream out = new FileOutputStream("/tmp/test-rt-2.pdf")) {
			assertNotNull("NULL BODY", response.getBody());
			out.write(response.getBody());
		}
	}

	/**
	 * Should write avviso pdf.
	 *
	 * @throws InterruptedException the interrupted exception
	 * @throws JAXBException the JAXB exception
	 * @throws SAXException the SAX exception
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws URISyntaxException the URI syntax exception
	 */
	@Test
	public void shouldWriteAvvisoPdf() throws InterruptedException, JAXBException, SAXException, FileNotFoundException,
			IOException, URISyntaxException {
		// registration has to take place...
		
		PrintAvviso print = new PrintAvviso();
		print.setQrCode("1");
		print.setBarCode("2");
		print.setImporto(BigDecimal.TEN);
		print.setIuv("IUVXXX");
		print.setDataScadenza("28/11/2017");
		Anagrafica anagraficaCreditore = new Anagrafica();
		anagraficaCreditore.setLocalita("LOCALITA CREDITORE");
		anagraficaCreditore.setIndirizzo("VIA CREDITORE");
		anagraficaCreditore.setCap("CAP CREDITORE");
		anagraficaCreditore.setRagioneSociale("RAGIONE SOCIALE CRED");
		anagraficaCreditore.setCodUnivoco("CODICE UNIVOCO CRED");
		print.setAnagraficaCreditore(anagraficaCreditore);

		Anagrafica anagraficaDebitore = new Anagrafica();
		anagraficaDebitore.setLocalita("TORINO");
		anagraficaDebitore.setRagioneSociale("RAGIONE SOCIALE DEB");
		anagraficaDebitore.setCodUnivoco("CODICE UNIVOCO DEB");
		anagraficaDebitore.setIndirizzo("Via Alfieri 17");
		anagraficaDebitore.setCap("10121 ");
		print.setAnagraficaDebitore(anagraficaDebitore);

		Dominio dominioCreditore = new Dominio();
		dominioCreditore.setRagioneSociale("Comune di Torino");
		dominioCreditore.setCodDominio("00514490010");

		print.setDominioCreditore(dominioCreditore);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<PrintAvviso> request = new HttpEntity<>(print, headers);
		String url = "http://localhost:" + this.port + "/avviso/pdf";
		ResponseEntity<byte[]> response = this.testRestTemplate.postForEntity(url, request, byte[].class);

		then(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		try (FileOutputStream out = new FileOutputStream("/tmp/test-avviso.pdf")) {
			assertNotNull("NULL BODY", response.getBody());
			out.write(response.getBody());
		}
	}

	/**
	 * Test should write quietanza.
	 *
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void testShouldWriteQuietanza() throws FileNotFoundException, IOException {
		StampaQuietanza request = new StampaQuietanza();
		request.setCodiceAvviso("AVVISO");
		request.setIuv("IUV");
		request.setDataEmissione(LocalDate.now().toString());
		request.setDataPagamento(LocalDate.now().toString());
		request.setEnteArea("Comune di Torino");
		
		request.setEnteDenominazione("Anagrafe Centrale");
		request.setEnteIndentificativo("00514490010");
		request.setTotale(BigDecimal.TEN);
		request.setIntestatarioDenominazione("NOME INTESTATARIO");
		request.setIntestatarioIdentificativo("CODICE_FISCALE");
		request.setIntestatarioIndirizzo("VIA ....");
		VoceQuietanza a = new VoceQuietanza();
		a.setCausale("Causale 1");
		a.setDescrizione("Descrizione Esempio 1");
		a.setImporto("12.10");
		request.getCausali().add(a);
		request.getCausali().add(a);
		request.getCausali().add(a);
		request.getCausali().add(a);
		ResponseEntity<byte[]> response = this.testRestTemplate
				.postForEntity("http://localhost:" + this.port + "/quietanza/pdf", request, byte[].class);

		then(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		try (FileOutputStream out = new FileOutputStream("/tmp/test-quietanza.pdf")) {
			assertNotNull("NULL BODY", response.getBody());
			out.write(response.getBody());
		}
	}
	@Test
	public void testExtReport() throws FileNotFoundException, IOException {
		byte[] request;

		request = "{ \"a\":1 }".getBytes();
		ResponseEntity<byte[]> response = this.testRestTemplate
				.postForEntity("http://localhost:" + this.port + "/Blank/pdf", request, byte[].class);
		Assume.assumeFalse(response.getStatusCodeValue() == 406);
		then(response.getStatusCodeValue()).isEqualTo(200);
		try (FileOutputStream out = new FileOutputStream("/tmp/ext.pdf")) {
			assertNotNull("NULL BODY", response.getBody());
			out.write(response.getBody());
		}
	}

}