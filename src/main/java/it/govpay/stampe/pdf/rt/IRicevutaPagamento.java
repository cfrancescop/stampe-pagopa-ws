package it.govpay.stampe.pdf.rt;

import java.io.OutputStream;
import java.util.Properties;

import it.govpay.model.RicevutaPagamento;



// TODO: Auto-generated Javadoc
/**
 * The Interface IRicevutaPagamento.
 */
public interface IRicevutaPagamento {

	/**
	 * **.
	 *
	 * @param ricevuta the ricevuta
	 * @param properties the properties
	 * @param os outputStream dove scrivere il pdf
	 * @return eventuale messaggio di errore/warnig da visualizzare;
	 */
	public String getPdfRicevutaPagamento(RicevutaPagamento ricevuta, Properties properties, OutputStream os);
		
}
