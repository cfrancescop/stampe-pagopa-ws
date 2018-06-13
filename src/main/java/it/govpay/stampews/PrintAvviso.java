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

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

import it.govpay.stampe.pdf.avviso.AvvisoPagamentoInput;


/**
 * The Class PrintAvviso.
 */
public class PrintAvviso {
	
	/** The bar code. */
	@NotNull
	String barCode;
	
	/** The qr code. */
	@NotNull
	String qrCode;
	
	/** The dominio creditore. */
	@NotNull
	Dominio dominioCreditore;
	
	/** The anagrafica creditore. */
	@NotNull
	Anagrafica anagraficaCreditore;
	
	/** The codice avviso. */
	String codiceAvviso;
	
	/** The data scadenza. */
	String dataScadenza;
	
	/** The iuv. */
	@NotNull
	String iuv;
	
	/** The importo. */
	@NotNull
	BigDecimal importo;
	
	/** The anagrafica debitore. */
	@NotNull
	Anagrafica anagraficaDebitore;
	
	/** The causale. */
	String causale;
	
	/** The cod versamento. */
	String codVersamento;
	
	/** The numero avviso. */
	String numeroAvviso;

	/**
	 * Gets the bar code.
	 *
	 * @return the bar code
	 */
	public String getBarCode() {
		return barCode;
	}

	/**
	 * Sets the bar code.
	 *
	 * @param barCode the new bar code
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	/**
	 * Gets the qr code.
	 *
	 * @return the qr code
	 */
	public String getQrCode() {
		return qrCode;
	}

	/**
	 * Sets the qr code.
	 *
	 * @param qrCode the new qr code
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	/**
	 * Gets the numero avviso.
	 *
	 * @return the numero avviso
	 */
	public String getNumeroAvviso() {
		return numeroAvviso;
	}

	/**
	 * Sets the numero avviso.
	 *
	 * @param numeroAvviso the new numero avviso
	 */
	public void setNumeroAvviso(String numeroAvviso) {
		this.numeroAvviso = numeroAvviso;
	}

	/**
	 * Gets the dominio creditore.
	 *
	 * @return the dominio creditore
	 */
	public Dominio getDominioCreditore() {
		return dominioCreditore;
	}

	/**
	 * Sets the dominio creditore.
	 *
	 * @param dominioCreditore the new dominio creditore
	 */
	public void setDominioCreditore(Dominio dominioCreditore) {
		this.dominioCreditore = dominioCreditore;
	}

	/**
	 * Gets the anagrafica creditore.
	 *
	 * @return the anagrafica creditore
	 */
	public Anagrafica getAnagraficaCreditore() {
		return anagraficaCreditore;
	}

	/**
	 * Sets the anagrafica creditore.
	 *
	 * @param anagraficaCreditore the new anagrafica creditore
	 */
	public void setAnagraficaCreditore(Anagrafica anagraficaCreditore) {
		this.anagraficaCreditore = anagraficaCreditore;
	}

	/**
	 * Gets the codice avviso.
	 *
	 * @return the codice avviso
	 */
	public String getCodiceAvviso() {
		return codiceAvviso;
	}

	/**
	 * Sets the codice avviso.
	 *
	 * @param codiceAvviso the new codice avviso
	 */
	public void setCodiceAvviso(String codiceAvviso) {
		this.codiceAvviso = codiceAvviso;
	}

	/**
	 * Gets the data scadenza.
	 *
	 * @return the data scadenza
	 */
	public String getDataScadenza() {
		return dataScadenza;
	}

	/**
	 * Sets the data scadenza.
	 *
	 * @param dataScadenza the new data scadenza
	 */
	public void setDataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	/**
	 * Gets the iuv.
	 *
	 * @return the iuv
	 */
	public String getIuv() {
		return iuv;
	}

	/**
	 * Sets the iuv.
	 *
	 * @param iuv the new iuv
	 */
	public void setIuv(String iuv) {
		this.iuv = iuv;
	}

	/**
	 * Gets the importo.
	 *
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}

	/**
	 * Sets the importo.
	 *
	 * @param importo the new importo
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	/**
	 * Gets the anagrafica debitore.
	 *
	 * @return the anagrafica debitore
	 */
	public Anagrafica getAnagraficaDebitore() {
		return anagraficaDebitore;
	}

	/**
	 * Sets the anagrafica debitore.
	 *
	 * @param anagraficaDebitore the new anagrafica debitore
	 */
	public void setAnagraficaDebitore(Anagrafica anagraficaDebitore) {
		this.anagraficaDebitore = anagraficaDebitore;
	}

	/**
	 * Gets the causale.
	 *
	 * @return the causale
	 */
	public String getCausale() {
		return causale;
	}

	/**
	 * Sets the causale.
	 *
	 * @param causale the new causale
	 */
	public void setCausale(String causale) {
		this.causale = causale;
	}

	/**
	 * Gets the cod versamento.
	 *
	 * @return the cod versamento
	 */
	public String getCodVersamento() {
		return codVersamento;
	}

	/**
	 * Sets the cod versamento.
	 *
	 * @param codVersamento the new cod versamento
	 */
	public void setCodVersamento(String codVersamento) {
		this.codVersamento = codVersamento;
	}

	/**
	 * To avviso.
	 *
	 * @param r the r
	 * @return the avviso pagamento input
	 */
	public static AvvisoPagamentoInput toAvviso(PrintAvviso r) {
		AvvisoPagamentoInput a = new AvvisoPagamentoInput();
		// Comune di San Valentino in Abruzzo Citeriore
		a.setEnteDenominazione(r.getDominioCreditore().ragioneSociale);
		// Area di sviluppo per le politiche agricole e forestali
		a.setEnteArea(r.anagraficaCreditore.ragioneSociale);
		// 83000390019
		a.setEnteIdentificativo(r.dominioCreditore.codDominio);
		// TODO
		a.setEnteCbill(r.anagraficaCreditore.cbill);
		// TODO
		a.setEnteUrl(r.anagraficaCreditore.url);
		// TODO
		a.setEntePeo(r.anagraficaCreditore.email);
		// TODO
		a.setEntePec(r.anagraficaCreditore.pec);
		// TODO
		a.setEntePartner(r.anagraficaCreditore.partner);
		// Lorenzo Nardi
		a.setIntestatarioDenominazione(r.anagraficaDebitore.ragioneSociale);
		// CODICE FISCALE
		a.setIntestatarioIdentificativo(r.anagraficaDebitore.codUnivoco);
		a.setIntestatarioIndirizzo1(r.anagraficaDebitore.indirizzo);
		Anagrafica deb =  r.anagraficaDebitore;
		String indirizzo = "";
		if(deb.cap != null) {
			indirizzo += deb.cap+' ';
		}
		if(deb.localita!=null) {
			indirizzo += deb.localita +' ';
		}
		if(deb.provincia != null) {
			indirizzo += '('+deb.provincia+')';
		}
		a.setIntestatarioIndirizzo2(indirizzo);
		a.setAvvisoCausale(r.causale);
		a.setAvvisoImporto(r.importo);
		a.setAvvisoScadenza(r.dataScadenza);
		a.setAvvisoNumero(r.numeroAvviso);
		a.setAvvisoIuv(r.iuv);
		a.setAvvisoQrcode(r.qrCode);
		a.setAvvisoBarcode(r.barCode);
		return a;
	}

	/**
	 * The Class Dominio.
	 */
	public static class Dominio {

		/** The cod dominio. */
		@NotNull
		String codDominio;
		
		/** The ragione sociale. */
		@NotNull
		String ragioneSociale;

		/**
		 * Gets the ragione sociale.
		 *
		 * @return the ragione sociale
		 */
		public String getRagioneSociale() {
			return ragioneSociale;
		}

		/**
		 * Sets the ragione sociale.
		 *
		 * @param ragioneSociale the new ragione sociale
		 */
		public void setRagioneSociale(String ragioneSociale) {
			this.ragioneSociale = ragioneSociale;
		}

		/**
		 * Gets the cod dominio.
		 *
		 * @return the cod dominio
		 */
		public String getCodDominio() {
			return codDominio;
		}

		/**
		 * Sets the cod dominio.
		 *
		 * @param codDominio the new cod dominio
		 */
		public void setCodDominio(String codDominio) {
			this.codDominio = codDominio;
		}
	}

	/**
	 * The Class Anagrafica.
	 */
	public static class Anagrafica {
		
		/** The cod univoco. */
		@NotNull
		String codUnivoco;

		/** The ragione sociale. */
		@NotNull
		String ragioneSociale;
		
		/** The indirizzo. */
		String indirizzo;
		
		/** The cap. */
		String cap;
		
		/** The localita. */
		String localita;
		
		/** The url. */
		String url;
		
		/** The pec. */
		String pec;
		
		/** The email. */
		String email;
		
		/** The partner. */
		String partner;
		
		/** The cbill. */
		String cbill;
		
		/** The provincia. */
		String provincia;
		
		/**
		 * Gets the provincia.
		 *
		 * @return the provincia
		 */
		public String getProvincia() {
			return provincia;
		}

		/**
		 * Sets the provincia.
		 *
		 * @param provincia the new provincia
		 */
		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		/**
		 * Gets the cod univoco.
		 *
		 * @return the cod univoco
		 */
		public String getCodUnivoco() {
			return codUnivoco;
		}

		/**
		 * Sets the cod univoco.
		 *
		 * @param codUnivoco the new cod univoco
		 */
		public void setCodUnivoco(String codUnivoco) {
			this.codUnivoco = codUnivoco;
		}

		/**
		 * Gets the ragione sociale.
		 *
		 * @return the ragione sociale
		 */
		public String getRagioneSociale() {
			return ragioneSociale;
		}

		/**
		 * Sets the ragione sociale.
		 *
		 * @param ragioneSociale the new ragione sociale
		 */
		public void setRagioneSociale(String ragioneSociale) {
			this.ragioneSociale = ragioneSociale;
		}

		/**
		 * Gets the indirizzo.
		 *
		 * @return the indirizzo
		 */
		public String getIndirizzo() {
			return indirizzo;
		}

		/**
		 * Sets the indirizzo.
		 *
		 * @param indirizzo the new indirizzo
		 */
		public void setIndirizzo(String indirizzo) {
			this.indirizzo = indirizzo;
		}

		/**
		 * Gets the cap.
		 *
		 * @return the cap
		 */
		public String getCap() {
			return cap;
		}

		/**
		 * Sets the cap.
		 *
		 * @param cap the new cap
		 */
		public void setCap(String cap) {
			this.cap = cap;
		}

		/**
		 * Gets the localita.
		 *
		 * @return the localita
		 */
		public String getLocalita() {
			return localita;
		}

		/**
		 * Sets the localita.
		 *
		 * @param localita the new localita
		 */
		public void setLocalita(String localita) {
			this.localita = localita;
		}
	}

}
