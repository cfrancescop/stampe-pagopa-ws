/*
 * GovPay - Porta di Accesso al Nodo dei Pagamenti SPC 
 * http://www.gov4j.it/govpay
 * 
 * Copyright (c) 2014-2017 Link.it srl (http://www.link.it).
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3, as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package it.govpay.model;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;



// TODO: Auto-generated Javadoc
/**
 * The Class Versamento.
 */
public class Versamento {

	/**
	 * The Enum StatoVersamento.
	 */
	public enum StatoVersamento {
		
		/** The non eseguito. */
		NON_ESEGUITO,
		
		/** The eseguito. */
		ESEGUITO,
		
		/** The parzialmente eseguito. */
		PARZIALMENTE_ESEGUITO,
		
		/** The annullato. */
		ANNULLATO,
		
		/** The anomalo. */
		ANOMALO,
		
		/** The eseguito senza rpt. */
		ESEGUITO_SENZA_RPT;
	}
	

	
	/** The id. */
	private Long id;
	
	/** The id uo. */
	private long idUo;
	
	/** The id applicazione. */
	private long idApplicazione;
	
	/** The cod versamento ente. */
	private String codVersamentoEnte; 
	
	/** The stato versamento. */
	private StatoVersamento statoVersamento;
	
	/** The descrizione stato. */
	private String descrizioneStato;
	
	/** The importo totale. */
	private BigDecimal importoTotale;
	
	/** The aggiornabile. */
	private boolean aggiornabile;
	
	/** The data creazione. */
	private Date dataCreazione;
	
	/** The data scadenza. */
	private Date dataScadenza;
	
	/** The data ultimo aggiornamento. */
	private Date dataUltimoAggiornamento;
	
	/** The causale versamento. */
	private Causale causaleVersamento;
	
	/** The anagrafica debitore. */
	private Anagrafica anagraficaDebitore;
	
	/** The iuv proposto. */
	private String iuvProposto;
	
	/** The cod lotto. */
	private String codLotto;
	
	/** The cod versamento lotto. */
	private String codVersamentoLotto;
	
	/** The cod anno tributario. */
	private Integer codAnnoTributario;
	
	/** The cod bundlekey. */
	private String codBundlekey;
	
	/** The bollo telematico. */
	private boolean bolloTelematico;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the id uo.
	 *
	 * @return the id uo
	 */
	public long getIdUo() {
		return idUo;
	}

	/**
	 * Sets the id uo.
	 *
	 * @param idUo the new id uo
	 */
	public void setIdUo(long idUo) {
		this.idUo = idUo;
	}

	/**
	 * Gets the id applicazione.
	 *
	 * @return the id applicazione
	 */
	public long getIdApplicazione() {
		return idApplicazione;
	}

	/**
	 * Sets the id applicazione.
	 *
	 * @param idApplicazione the new id applicazione
	 */
	public void setIdApplicazione(long idApplicazione) {
		this.idApplicazione = idApplicazione;
	}

	/**
	 * Gets the cod versamento ente.
	 *
	 * @return the cod versamento ente
	 */
	public String getCodVersamentoEnte() {
		return codVersamentoEnte;
	}

	/**
	 * Sets the cod versamento ente.
	 *
	 * @param codVersamentoEnte the new cod versamento ente
	 */
	public void setCodVersamentoEnte(String codVersamentoEnte) {
		this.codVersamentoEnte = codVersamentoEnte;
	}

	/**
	 * Gets the stato versamento.
	 *
	 * @return the stato versamento
	 */
	public StatoVersamento getStatoVersamento() {
		return statoVersamento;
	}

	/**
	 * Sets the stato versamento.
	 *
	 * @param statoVersamento the new stato versamento
	 */
	public void setStatoVersamento(StatoVersamento statoVersamento) {
		this.statoVersamento = statoVersamento;
	}

	/**
	 * Gets the descrizione stato.
	 *
	 * @return the descrizione stato
	 */
	public String getDescrizioneStato() {
		return descrizioneStato;
	}

	/**
	 * Sets the descrizione stato.
	 *
	 * @param descrizioneStato the new descrizione stato
	 */
	public void setDescrizioneStato(String descrizioneStato) {
		this.descrizioneStato = descrizioneStato;
	}

	/**
	 * Gets the importo totale.
	 *
	 * @return the importo totale
	 */
	public BigDecimal getImportoTotale() {
		return importoTotale;
	}

	/**
	 * Sets the importo totale.
	 *
	 * @param importoTotale the new importo totale
	 */
	public void setImportoTotale(BigDecimal importoTotale) {
		this.importoTotale = importoTotale;
	}

	/**
	 * Checks if is aggiornabile.
	 *
	 * @return true, if is aggiornabile
	 */
	public boolean isAggiornabile() {
		return aggiornabile;
	}

	/**
	 * Sets the aggiornabile.
	 *
	 * @param aggiornabile the new aggiornabile
	 */
	public void setAggiornabile(boolean aggiornabile) {
		this.aggiornabile = aggiornabile;
	}

	/**
	 * Gets the data creazione.
	 *
	 * @return the data creazione
	 */
	public Date getDataCreazione() {
		return dataCreazione;
	}

	/**
	 * Sets the data creazione.
	 *
	 * @param dataCreazione the new data creazione
	 */
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	/**
	 * Gets the data scadenza.
	 *
	 * @return the data scadenza
	 */
	public Date getDataScadenza() {
		return dataScadenza;
	}

	/**
	 * Sets the data scadenza.
	 *
	 * @param dataScadenza the new data scadenza
	 */
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	/**
	 * Gets the data ultimo aggiornamento.
	 *
	 * @return the data ultimo aggiornamento
	 */
	public Date getDataUltimoAggiornamento() {
		return dataUltimoAggiornamento;
	}

	/**
	 * Sets the data ultimo aggiornamento.
	 *
	 * @param dataUltimoAggiornamento the new data ultimo aggiornamento
	 */
	public void setDataUltimoAggiornamento(Date dataUltimoAggiornamento) {
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
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
	 * Gets the cod bundlekey.
	 *
	 * @return the cod bundlekey
	 */
	public String getCodBundlekey() {
		return codBundlekey;
	}

	/**
	 * Sets the cod bundlekey.
	 *
	 * @param codBundlekey the new cod bundlekey
	 */
	public void setCodBundlekey(String codBundlekey) {
		this.codBundlekey = codBundlekey;
	}

	/**
	 * Gets the causale versamento.
	 *
	 * @return the causale versamento
	 */
	public Causale getCausaleVersamento() {
		return causaleVersamento;
	}

	/**
	 * Sets the causale versamento.
	 *
	 * @param causaleVersamento the new causale versamento
	 */
	public void setCausaleVersamento(Causale causaleVersamento) {
		this.causaleVersamento = causaleVersamento;
	}
	
	/**
	 * Sets the causale versamento.
	 *
	 * @param causaleVersamentoEncoded the new causale versamento
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public void setCausaleVersamento(String causaleVersamentoEncoded) throws UnsupportedEncodingException {
		if(causaleVersamentoEncoded == null) 
			this.causaleVersamento = null;
		else
			this.causaleVersamento = Versamento.decode(causaleVersamentoEncoded);
	}
	
	/**
	 * The Interface Causale.
	 */
	public interface Causale {
		
		/**
		 * Encode.
		 *
		 * @return the string
		 * @throws UnsupportedEncodingException the unsupported encoding exception
		 */
		public String encode() throws UnsupportedEncodingException;
		
		/**
		 * Gets the simple.
		 *
		 * @return the simple
		 * @throws UnsupportedEncodingException the unsupported encoding exception
		 */
		public String getSimple() throws UnsupportedEncodingException;
	}
	
	/**
	 * The Class CausaleSemplice.
	 */
	public class CausaleSemplice implements Causale {
		
		/** The causale. */
		private String causale;
		
		@Override
		public String encode() throws UnsupportedEncodingException {
			if(causale == null) return null;
			return "01 " + Base64.encodeBase64String(causale.getBytes("UTF-8"));
		}
		
		@Override
		public String getSimple() throws UnsupportedEncodingException {
			return this.getCausale();
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
		 * Gets the causale.
		 *
		 * @return the causale
		 */
		public String getCausale() {
			return causale;
		}
		
		@Override
		public String toString() {
			return causale;
		}
		
	}
	
	/**
	 * The Class CausaleSpezzoni.
	 */
	public class CausaleSpezzoni implements Causale {
		
		/** The spezzoni. */
		private List<String> spezzoni;
		
		@Override
		public String encode() throws UnsupportedEncodingException {
			if(spezzoni == null) return null;
			String encoded = "02";
			for(String spezzone : spezzoni) {
				encoded += " " + Base64.encodeBase64String(spezzone.getBytes("UTF-8"));
			}
			return encoded;
		}
		
		@Override
		public String getSimple() throws UnsupportedEncodingException {
			if(this.spezzoni != null && !this.spezzoni.isEmpty())
				return this.spezzoni.get(0);
				
			return "";
		}
		
		/**
		 * Sets the spezzoni.
		 *
		 * @param spezzoni the new spezzoni
		 */
		public void setSpezzoni(List<String> spezzoni) {
			this.spezzoni = spezzoni;
		}
		
		/**
		 * Gets the spezzoni.
		 *
		 * @return the spezzoni
		 */
		public List<String> getSpezzoni() {
			return spezzoni;
		}
		
		@Override
		public String toString() {
			return StringUtils.join(spezzoni, "; ");
		}
	}
	
	/**
	 * The Class CausaleSpezzoniStrutturati.
	 */
	public class CausaleSpezzoniStrutturati implements Causale {
		
		/** The spezzoni. */
		private List<String> spezzoni;
		
		/** The importi. */
		private List<BigDecimal> importi;
		
		@Override
		public String encode() throws UnsupportedEncodingException {
			if(spezzoni == null) return null;
			String encoded = "03";
			for(int i=0; i<spezzoni.size(); i++) {
				encoded += " " + Base64.encodeBase64String(spezzoni.get(i).getBytes("UTF-8")) + " " + Base64.encodeBase64String(Double.toString(importi.get(i).doubleValue()).getBytes("UTF-8"));
			}
			return encoded;
		}
		
		@Override
		public String getSimple() throws UnsupportedEncodingException {
			if(this.spezzoni != null && !this.spezzoni.isEmpty()){
				StringBuffer sb = new StringBuffer();
				sb.append(importi.get(0).doubleValue() + ": " + spezzoni.get(0) );
				return sb.toString();
			}
				
			return "";
		}
		
		/**
		 * Instantiates a new causale spezzoni strutturati.
		 */
		public CausaleSpezzoniStrutturati() {
			spezzoni = new ArrayList<String>();
			importi = new ArrayList<BigDecimal>();
		}
		
		/**
		 * Sets the spezzoni.
		 *
		 * @param spezzoni the new spezzoni
		 */
		public void setSpezzoni(List<String> spezzoni) {
			this.spezzoni = spezzoni;
		}
		
		/**
		 * Gets the spezzoni.
		 *
		 * @return the spezzoni
		 */
		public List<String> getSpezzoni() {
			return spezzoni;
		}
		
		/**
		 * Sets the importi.
		 *
		 * @param importi the new importi
		 */
		public void setImporti(List<BigDecimal> importi) {
			this.importi = importi;
		}
		
		/**
		 * Gets the importi.
		 *
		 * @return the importi
		 */
		public List<BigDecimal> getImporti() {
			return importi;
		}
		
		/**
		 * Adds the spezzone strutturato.
		 *
		 * @param spezzone the spezzone
		 * @param importo the importo
		 */
		public void addSpezzoneStrutturato(String spezzone, BigDecimal importo){
			spezzoni.add(spezzone);
			importi.add(importo);
		}
		
		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<spezzoni.size(); i++) {
				sb.append(importi.get(i).doubleValue() + ": " + spezzoni.get(i) + "; ");
			}
			return sb.toString();
		}
	}
	
	/**
	 * Decode.
	 *
	 * @param encodedCausale the encoded causale
	 * @return the causale
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public static Causale decode(String encodedCausale) throws UnsupportedEncodingException {
		if(encodedCausale == null || encodedCausale.trim().isEmpty())
			return null;
		
		String[] causaleSplit = encodedCausale.split(" ");
		if(causaleSplit[0].equals("01")) {
			CausaleSemplice causale = new Versamento().new CausaleSemplice();
			if(causaleSplit.length > 1 && causaleSplit[1] != null) {
				causale.setCausale(new String(Base64.decodeBase64(causaleSplit[1].getBytes()), "UTF-8"));
				return causale;
			} else {
				return null;
			}
		}
		
		if(causaleSplit[0].equals("02")) {
			List<String> spezzoni = new ArrayList<String>();
			for(int i=1; i<causaleSplit.length; i++) {
				spezzoni.add(new String(Base64.decodeBase64(causaleSplit[i].getBytes()), "UTF-8"));
			}
			CausaleSpezzoni causale = new Versamento().new CausaleSpezzoni();
			causale.setSpezzoni(spezzoni);
			return causale;
		}
		
		if(causaleSplit[0].equals("03")) {
			List<String> spezzoni = new ArrayList<String>();
			List<BigDecimal> importi = new ArrayList<BigDecimal>();
			
			for(int i=1; i<causaleSplit.length; i=i+2) {
				spezzoni.add(new String(Base64.decodeBase64(causaleSplit[i].getBytes()), "UTF-8"));
				importi.add(BigDecimal.valueOf(Double.parseDouble(new String(Base64.decodeBase64(causaleSplit[i+1].getBytes()), "UTF-8"))));
			}
			CausaleSpezzoniStrutturati causale = new Versamento().new CausaleSpezzoniStrutturati();
			causale.setSpezzoni(spezzoni);
			causale.setImporti(importi);
			return causale;
		}
		throw new UnsupportedEncodingException();
	}
	
	/**
	 * Checks if is bollo telematico.
	 *
	 * @return true, if is bollo telematico
	 */
	public boolean isBolloTelematico() {
		return bolloTelematico;
	}

	/**
	 * Sets the bollo telematico.
	 *
	 * @param bolloTelematico the new bollo telematico
	 */
	public void setBolloTelematico(boolean bolloTelematico) {
		this.bolloTelematico = bolloTelematico;
	}
	
	/**
	 * Gets the iuv proposto.
	 *
	 * @return the iuv proposto
	 */
	public String getIuvProposto() {
		return iuvProposto;
	}

	/**
	 * Sets the iuv proposto.
	 *
	 * @param iuvProposto the new iuv proposto
	 */
	public void setIuvProposto(String iuvProposto) {
		this.iuvProposto = iuvProposto;
	}

	/**
	 * Gets the cod lotto.
	 *
	 * @return the cod lotto
	 */
	public String getCodLotto() {
		return codLotto;
	}

	/**
	 * Sets the cod lotto.
	 *
	 * @param codLotto the new cod lotto
	 */
	public void setCodLotto(String codLotto) {
		this.codLotto = codLotto;
	}

	/**
	 * Gets the cod versamento lotto.
	 *
	 * @return the cod versamento lotto
	 */
	public String getCodVersamentoLotto() {
		return codVersamentoLotto;
	}

	/**
	 * Sets the cod versamento lotto.
	 *
	 * @param codVersamentoLotto the new cod versamento lotto
	 */
	public void setCodVersamentoLotto(String codVersamentoLotto) {
		this.codVersamentoLotto = codVersamentoLotto;
	}

	/**
	 * Gets the cod anno tributario.
	 *
	 * @return the cod anno tributario
	 */
	public Integer getCodAnnoTributario() {
		return codAnnoTributario;
	}

	/**
	 * Sets the cod anno tributario.
	 *
	 * @param codAnnoTributario the new cod anno tributario
	 */
	public void setCodAnnoTributario(Integer codAnnoTributario) {
		this.codAnnoTributario = codAnnoTributario;
	}
	
	
	
}
