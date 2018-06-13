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

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Dominio.
 */
public class Dominio  {
	
	
	/** The Constant EC. */
	public static final String EC = "EC"; 
	
	/** The id. */
	private Long id; 
	
	/** The id stazione. */
	private long idStazione; 
	
	/** The id applicazione default. */
	private Long idApplicazioneDefault; 
	
	/** The cod dominio. */
	private String codDominio;
	
	/** The ragione sociale. */
	private String ragioneSociale;
	
	/** The gln. */
	private String gln;
	
	/** The riuso iuv. */
	private boolean riusoIuv;
	
	/** The custom iuv. */
	private boolean customIuv;
	
	/** The abilitato. */
	private boolean abilitato;
	
	/** The conti accredito. */
	private transient byte[] contiAccredito;
	
	/** The tabella controparti. */
	private transient byte[] tabellaControparti;
	
	/** The aux digit. */
	private int auxDigit;
	
	/** The segregation code. */
	private Integer segregationCode;
	
	/** The ndp stato. */
	private transient Integer ndpStato;
	
	/** The ndp operazione. */
	private transient String ndpOperazione;
	
	/** The ndp descrizione. */
	private transient String ndpDescrizione;
	
	/** The ndp data. */
	private transient Date ndpData;
	
	/** The iuv prefix. */
	private String iuvPrefix;
	
	/** The iuv prefix strict. */
	private boolean iuvPrefixStrict;
	
	/** The logo. */
	private byte[] logo;
	
	/** The cbill. */
	private String cbill;
	
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

	/**
	 * Gets the gln.
	 *
	 * @return the gln
	 */
	public String getGln() {
		return gln;
	}

	/**
	 * Sets the gln.
	 *
	 * @param gln the new gln
	 */
	public void setGln(String gln) {
		this.gln = gln;
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
	 * Checks if is abilitato.
	 *
	 * @return true, if is abilitato
	 */
	public boolean isAbilitato() {
		return abilitato;
	}

	/**
	 * Sets the abilitato.
	 *
	 * @param abilitato the new abilitato
	 */
	public void setAbilitato(boolean abilitato) {
		this.abilitato = abilitato;
	}

	/**
	 * Gets the id stazione.
	 *
	 * @return the id stazione
	 */
	public long getIdStazione() {
		return idStazione;
	}

	/**
	 * Sets the id stazione.
	 *
	 * @param idStazione the new id stazione
	 */
	public void setIdStazione(long idStazione) {
		this.idStazione = idStazione;
	}

	/**
	 * Gets the conti accredito.
	 *
	 * @return the conti accredito
	 */
	public byte[] getContiAccredito() {
		return contiAccredito;
	}

	/**
	 * Sets the conti accredito.
	 *
	 * @param contiAccredito the new conti accredito
	 */
	public void setContiAccredito(byte[] contiAccredito) {
		this.contiAccredito = contiAccredito;
	}

	/**
	 * Gets the tabella controparti.
	 *
	 * @return the tabella controparti
	 */
	public byte[] getTabellaControparti() {
		return tabellaControparti;
	}

	/**
	 * Sets the tabella controparti.
	 *
	 * @param tabellaControparti the new tabella controparti
	 */
	public void setTabellaControparti(byte[] tabellaControparti) {
		this.tabellaControparti = tabellaControparti;
	}
	
	/**
	 * Gets the id applicazione default.
	 *
	 * @return the id applicazione default
	 */
	public Long getIdApplicazioneDefault() {
		return idApplicazioneDefault;
	}

	/**
	 * Sets the id applicazione default.
	 *
	 * @param idApplicazioneDefault the new id applicazione default
	 */
	public void setIdApplicazioneDefault(Long idApplicazioneDefault) {
		this.idApplicazioneDefault = idApplicazioneDefault;
	}

	/**
	 * Checks if is riuso iuv.
	 *
	 * @return true, if is riuso iuv
	 */
	public boolean isRiusoIuv() {
		return riusoIuv;
	}

	/**
	 * Sets the riuso iuv.
	 *
	 * @param riusoIuv the new riuso iuv
	 */
	public void setRiusoIuv(boolean riusoIuv) {
		this.riusoIuv = riusoIuv;
	}

	/**
	 * Checks if is custom iuv.
	 *
	 * @return true, if is custom iuv
	 */
	public boolean isCustomIuv() {
		return customIuv;
	}

	/**
	 * Sets the custom iuv.
	 *
	 * @param customIuv the new custom iuv
	 */
	public void setCustomIuv(boolean customIuv) {
		this.customIuv = customIuv;
	}

	/**
	 * Gets the aux digit.
	 *
	 * @return the aux digit
	 */
	public int getAuxDigit() {
		return auxDigit;
	}

	/**
	 * Sets the aux digit.
	 *
	 * @param auxDigit the new aux digit
	 */
	public void setAuxDigit(int auxDigit) {
		this.auxDigit = auxDigit;
	}

	/**
	 * Gets the iuv prefix.
	 *
	 * @return the iuv prefix
	 */
	public String getIuvPrefix() {
		return iuvPrefix;
	}

	/**
	 * Sets the iuv prefix.
	 *
	 * @param iuvPrefix the new iuv prefix
	 */
	public void setIuvPrefix(String iuvPrefix) {
		this.iuvPrefix = iuvPrefix;
	}

	/**
	 * Checks if is iuv prefix strict.
	 *
	 * @return true, if is iuv prefix strict
	 */
	public boolean isIuvPrefixStrict() {
		return iuvPrefixStrict;
	}

	/**
	 * Sets the iuv prefix strict.
	 *
	 * @param iuvPrefixStrict the new iuv prefix strict
	 */
	public void setIuvPrefixStrict(boolean iuvPrefixStrict) {
		this.iuvPrefixStrict = iuvPrefixStrict;
	}

	/**
	 * Gets the segregation code.
	 *
	 * @return the segregation code
	 */
	public Integer getSegregationCode() {
		return segregationCode;
	}

	/**
	 * Sets the segregation code.
	 *
	 * @param segregationCode the new segregation code
	 */
	public void setSegregationCode(Integer segregationCode) {
		this.segregationCode = segregationCode;
	}
	
	/**
	 * Gets the ndp stato.
	 *
	 * @return the ndp stato
	 */
	public Integer getNdpStato() {
		return ndpStato;
	}

	/**
	 * Sets the ndp stato.
	 *
	 * @param ndpStato the new ndp stato
	 */
	public void setNdpStato(Integer ndpStato) {
		this.ndpStato = ndpStato;
	}

	/**
	 * Gets the ndp operazione.
	 *
	 * @return the ndp operazione
	 */
	public String getNdpOperazione() {
		return ndpOperazione;
	}

	/**
	 * Sets the ndp operazione.
	 *
	 * @param ndpOperazione the new ndp operazione
	 */
	public void setNdpOperazione(String ndpOperazione) {
		this.ndpOperazione = ndpOperazione;
	}

	/**
	 * Gets the ndp descrizione.
	 *
	 * @return the ndp descrizione
	 */
	public String getNdpDescrizione() {
		return ndpDescrizione;
	}

	/**
	 * Sets the ndp descrizione.
	 *
	 * @param ndpDescrizione the new ndp descrizione
	 */
	public void setNdpDescrizione(String ndpDescrizione) {
		this.ndpDescrizione = ndpDescrizione;
	}

	/**
	 * Gets the ndp data.
	 *
	 * @return the ndp data
	 */
	public Date getNdpData() {
		return ndpData;
	}

	/**
	 * Sets the ndp data.
	 *
	 * @param ndpData the new ndp data
	 */
	public void setNdpData(Date ndpData) {
		this.ndpData = ndpData;
	}

	/**
	 * Gets the logo.
	 *
	 * @return the logo
	 */
	public byte[] getLogo() {
		return logo;
	}

	/**
	 * Sets the logo.
	 *
	 * @param logo the new logo
	 */
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	/**
	 * Gets the cbill.
	 *
	 * @return the cbill
	 */
	public String getCbill() {
		return cbill;
	}

	/**
	 * Sets the cbill.
	 *
	 * @param cbill the new cbill
	 */
	public void setCbill(String cbill) {
		this.cbill = cbill;
	}
	
}

