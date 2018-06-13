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
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class StampaQuietanza.
 */
public class StampaQuietanza {
	
	/**
	 * The Class VoceQuietanza.
	 */
	public static class VoceQuietanza {
		
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
		 * Gets the descrizione.
		 *
		 * @return the descrizione
		 */
		public String getDescrizione() {
			return descrizione;
		}

		/**
		 * Sets the descrizione.
		 *
		 * @param descrizione the new descrizione
		 */
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}

		/**
		 * Gets the importo.
		 *
		 * @return the importo
		 */
		public String getImporto() {
			return importo;
		}

		/**
		 * Sets the importo.
		 *
		 * @param importo the new importo
		 */
		public void setImporto(String importo) {
			this.importo = importo;
		}

		/** The causale. */
		private String causale;
		
		/** The descrizione. */
		private String descrizione;
		
		/** The importo. */
		private String importo;
	}

	/** The totale. */
	@NotNull
	private BigDecimal totale;
	
	/** NOME E COGNOME. */
	private String intestatarioDenominazione;
	
	/** CODICE FISCALE. */
	private String intestatarioIdentificativo;
	
	/** INDIRIZZO CIVICO. */
	private String intestatarioIndirizzo;
	
	/** CAP CITTA (PROVINCIA). */
	private String intestatarioArea;
	
	/** RAGIONE SOCIALE ENTE. */
	private String enteDenominazione;
	
	/** RAGIONE SOCIALE COMUNE. */
	private String enteArea;
	
	/** CODICE DOMINIO. */
	private String enteIndentificativo;
	
	/** The codice avviso. */
	private String codiceAvviso;
	
	/** The iuv. */
	private String iuv;
	
	/** The data pagamento. */
	private String dataPagamento;
	
	/** The data emissione. */
	private String dataEmissione;

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
	 * Gets the data pagamento.
	 *
	 * @return the data pagamento
	 */
	public String getDataPagamento() {
		return dataPagamento;
	}

	/**
	 * Sets the data pagamento.
	 *
	 * @param dataPagamento the new data pagamento
	 */
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	/**
	 * Gets the data emissione.
	 *
	 * @return the data emissione
	 */
	public String getDataEmissione() {
		return dataEmissione;
	}

	/**
	 * Sets the data emissione.
	 *
	 * @param dataEmissione the new data emissione
	 */
	public void setDataEmissione(String dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	/**
	 * Gets the totale.
	 *
	 * @return the totale
	 */
	public BigDecimal getTotale() {
		return totale;
	}

	/**
	 * Sets the totale.
	 *
	 * @param importo the new totale
	 */
	public void setTotale(BigDecimal importo) {
		this.totale = importo;
	}

	/**
	 * Gets the intestatario denominazione.
	 *
	 * @return the intestatario denominazione
	 */
	public String getIntestatarioDenominazione() {
		return intestatarioDenominazione;
	}

	/**
	 * Sets the intestatario denominazione.
	 *
	 * @param intestatarioDenominazione the new intestatario denominazione
	 */
	public void setIntestatarioDenominazione(String intestatarioDenominazione) {
		this.intestatarioDenominazione = intestatarioDenominazione;
	}

	/**
	 * Gets the intestatario identificativo.
	 *
	 * @return the intestatario identificativo
	 */
	public String getIntestatarioIdentificativo() {
		return intestatarioIdentificativo;
	}

	/**
	 * Sets the intestatario identificativo.
	 *
	 * @param intestatarioIdentificativo the new intestatario identificativo
	 */
	public void setIntestatarioIdentificativo(String intestatarioIdentificativo) {
		this.intestatarioIdentificativo = intestatarioIdentificativo;
	}

	/**
	 * Gets the intestatario indirizzo.
	 *
	 * @return the intestatario indirizzo
	 */
	public String getIntestatarioIndirizzo() {
		return intestatarioIndirizzo;
	}

	/**
	 * Sets the intestatario indirizzo.
	 *
	 * @param intestatarioIndirizzo the new intestatario indirizzo
	 */
	public void setIntestatarioIndirizzo(String intestatarioIndirizzo) {
		this.intestatarioIndirizzo = intestatarioIndirizzo;
	}

	/**
	 * Gets the ente denominazione.
	 *
	 * @return the ente denominazione
	 */
	public String getEnteDenominazione() {
		return enteDenominazione;
	}

	/**
	 * Sets the ente denominazione.
	 *
	 * @param enteDenominazione the new ente denominazione
	 */
	public void setEnteDenominazione(String enteDenominazione) {
		this.enteDenominazione = enteDenominazione;
	}

	/**
	 * Gets the ente area.
	 *
	 * @return the ente area
	 */
	public String getEnteArea() {
		return enteArea;
	}

	/**
	 * Sets the ente area.
	 *
	 * @param enteArea the new ente area
	 */
	public void setEnteArea(String enteArea) {
		this.enteArea = enteArea;
	}

	/**
	 * Gets the ente indentificativo.
	 *
	 * @return the ente indentificativo
	 */
	public String getEnteIndentificativo() {
		return enteIndentificativo;
	}

	/**
	 * Sets the ente indentificativo.
	 *
	 * @param enteIndentificativo the new ente indentificativo
	 */
	public void setEnteIndentificativo(String enteIndentificativo) {
		this.enteIndentificativo = enteIndentificativo;
	}

	/**
	 * Gets the causali.
	 *
	 * @return the causali
	 */
	public List<VoceQuietanza> getCausali() {
		return causali;
	}

	/**
	 * Sets the causali.
	 *
	 * @param causali the new causali
	 */
	public void setCausali(List<VoceQuietanza> causali) {
		this.causali = causali;
	}

	/**
	 * Gets the intestatario area.
	 *
	 * @return the intestatario area
	 */
	public String getIntestatarioArea() {
		return intestatarioArea;
	}

	/**
	 * Sets the intestatario area.
	 *
	 * @param intestatarioArea the new intestatario area
	 */
	public void setIntestatarioArea(String intestatarioArea) {
		this.intestatarioArea = intestatarioArea;
	}

	/** The causali. */
	/*
	 * <parameter name="intestatario_denominazione" class="java.lang.String"/>
	 * <parameter name="intestatario_identificativo" class="java.lang.String"/>
	 * <parameter name="intestatario_indirizzo_1" class="java.lang.String"/>
	 * <parameter name="intestatario_indirizzo_2" class="java.lang.String"/>
	 * <parameter name="ente_denominazione" class="java.lang.String"/> <parameter
	 * name="ente_area" class="java.lang.String"/> <parameter
	 * name="ente_identificativo" class="java.lang.String"/>
	 */
	List<VoceQuietanza> causali = new ArrayList<>();
}
