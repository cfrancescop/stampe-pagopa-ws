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
package it.govpay.stampe.pdf.avviso;

import static org.junit.Assert.assertNotNull;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;
import org.junit.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class AvvisoPagamentoTest.
 */
public class AvvisoPagamentoTest {

	
	/** The av properties. */
	static AvvisoPagamentoProperties avProperties;

	/** The instance. */
	static AvvisoPagamentoPdf instance;

	/**
	 * Setup.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setup() throws Exception {
		avProperties = AvvisoPagamentoProperties.newInstance("/var/govpay");

		instance = AvvisoPagamentoPdf.getInstance();
	}

	/**
	 * Write a test pdf under /tmp/avvisoPagoPA.pdf
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testStampaAvviso() throws Exception {
		try (FileOutputStream outputStream = new FileOutputStream("/tmp/avvisoPagoPA.pdf")) {
			instance.exportToStream(createInput(), "00463030650", outputStream);
		}

	}

	/**
	 * Test logi image.
	 *
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws MissingConfigurationException the missing configuration exception
	 */
	@Test
	public void testLogiImage() throws UnsupportedEncodingException, MissingConfigurationException {
		Map<String,Object> parameters = new HashMap<>();
		InputStream immagineEnte = AvvisoPagamentoProperties.getImmagineEnte("00463030650");
		assertNotNull(immagineEnte);
//		instance.caricaLoghiAvvisoFromProps(parameters, avProperties.getPropertiesPerDominio(null));
//		parameters.entrySet().forEach(entry -> {
//			InputStream is = (InputStream) entry.getValue();
//			String name = entry.getKey();
//			try {
//				Files.copy(is, Paths.get("/tmp",name+".png"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
	}
	

	/**
	 * Creates the input.
	 *
	 * @return the avviso pagamento input
	 */
	private AvvisoPagamentoInput createInput() {
		AvvisoPagamentoInput input = new AvvisoPagamentoInput();
		// AvvisoPagamentoPdf.getInstance().caricaLoghiAvviso(input,
		// propertiesAvvisoPerDominio);

		input.setEnteDenominazione("Comune di San Valentino in Abruzzo Citeriore");
		input.setEnteArea("Area di sviluppo per le politiche agricole e forestali");
		input.setEnteIdentificativo("00463030650");
		input.setEnteCbill("AAAAAAA");
		input.setEnteUrl("www.comune.sanciprianopicentino.sa.it/");
		input.setEntePeo("info@comune.sancipriano.sa.it");
		input.setEntePec("protocollo@pec.comune.sanciprianopicentino.sa.it");
		input.setEntePartner("Link.it Srl");
		input.setIntestatarioDenominazione("Lorenzo Nardi");
		input.setIntestatarioIdentificativo("NRDLNA80P19D612M");
		input.setIntestatarioIndirizzo1("Via di Corniola 119A");
		input.setIntestatarioIndirizzo2("50053 Empoli (FI)");
		input.setAvvisoCausale(
				"Pagamento diritti di segreteria per il rilascio in duplice copia della documentazione richiesta.");
		input.setAvvisoImporto(new BigDecimal("9999.99"));
		input.setAvvisoScadenza("31/12/2020");
		input.setAvvisoNumero("399000012345678900");
		input.setAvvisoIuv("99000012345678900");
		input.setAvvisoBarcode("415808888880094580203990000123456789003902222250");
		input.setAvvisoQrcode("PAGOPA|002|399000012345678900|83000390019|222250");
		return input;
	}
}
