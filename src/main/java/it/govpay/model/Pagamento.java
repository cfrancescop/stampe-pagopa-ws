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

import java.math.BigDecimal;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Pagamento.
 */
public class Pagamento {

	

	/**
	 * The Enum TipoAllegato.
	 */
	public enum TipoAllegato {
		
		/** The es. */
		ES, 
 /** The bd. */
 BD
	}
	
	/**
	 * The Enum Stato.
	 */
	public enum Stato {
		
		/** The pagato. */
		PAGATO, 
 /** The incassato. */
 INCASSATO, 
 /** The pagato senza rpt. */
 PAGATO_SENZA_RPT
	}

	/** The id. */
	private Long id;
	
	/** The cod dominio. */
	private String codDominio;
	
	/** The iuv. */
	private String iuv;
	
	/** The iur. */
	private String iur;
	
	/** The indice dati. */
	private int indiceDati;
	
	/** The stato. */
	private Stato stato;
	
	/** The importo pagato. */
	private BigDecimal importoPagato;
	
	/** The data acquisizione. */
	private Date dataAcquisizione;
	
	/** The data pagamento. */
	private Date dataPagamento;
	
	/** The commissioni psp. */
	private BigDecimal commissioniPsp;
	
	/** The tipo allegato. */
	private TipoAllegato tipoAllegato;
	
	/** The allegato. */
	private byte[] allegato;
	
	/** The iban accredito. */
	private String ibanAccredito;
	
	/** The id rpt. */
	private Long idRpt;
	
	/** The id singolo versamento. */
	private Long idSingoloVersamento;
	
	/** The id rr. */
	private Long idRr;
	
	/** The id incasso. */
	private Long idIncasso;
	
	/** The data acquisizione revoca. */
	private Date dataAcquisizioneRevoca;
	
	/** The causale revoca. */
	private String causaleRevoca;
	
	/** The dati revoca. */
	private String datiRevoca;
	
	/** The esito revoca. */
	private String esitoRevoca;
	
	/** The dati esito revoca. */
	private String datiEsitoRevoca;
	
	/** The importo revocato. */
	private BigDecimal importoRevocato;

	/**
	 * Instantiates a new pagamento.
	 */
	public Pagamento() {
		super();
		this.dataAcquisizione = new Date();
		this.stato = Stato.PAGATO;
	}

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
	 * Gets the id rpt.
	 *
	 * @return the id rpt
	 */
	public Long getIdRpt() {
		return idRpt;
	}

	/**
	 * Sets the id rpt.
	 *
	 * @param idRpt the new id rpt
	 */
	public void setIdRpt(long idRpt) {
		this.idRpt = idRpt;
	}

	/**
	 * Gets the id singolo versamento.
	 *
	 * @return the id singolo versamento
	 */
	public Long getIdSingoloVersamento() {
		return idSingoloVersamento;
	}

	/**
	 * Sets the id singolo versamento.
	 *
	 * @param idSingoloVersamento the new id singolo versamento
	 */
	public void setIdSingoloVersamento(Long idSingoloVersamento) {
		this.idSingoloVersamento = idSingoloVersamento;
	}

	/**
	 * Gets the importo pagato.
	 *
	 * @return the importo pagato
	 */
	public BigDecimal getImportoPagato() {
		return importoPagato;
	}

	/**
	 * Sets the importo pagato.
	 *
	 * @param importoPagato the new importo pagato
	 */
	public void setImportoPagato(BigDecimal importoPagato) {
		this.importoPagato = importoPagato;
	}

	/**
	 * Gets the iur.
	 *
	 * @return the iur
	 */
	public String getIur() {
		return iur;
	}

	/**
	 * Sets the iur.
	 *
	 * @param iur the new iur
	 */
	public void setIur(String iur) {
		this.iur = iur;
	}

	/**
	 * Gets the data pagamento.
	 *
	 * @return the data pagamento
	 */
	public Date getDataPagamento() {
		return dataPagamento;
	}

	/**
	 * Sets the data pagamento.
	 *
	 * @param dataPagamento the new data pagamento
	 */
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	/**
	 * Gets the tipo allegato.
	 *
	 * @return the tipo allegato
	 */
	public TipoAllegato getTipoAllegato() {
		return tipoAllegato;
	}

	/**
	 * Sets the tipo allegato.
	 *
	 * @param tipoAllegato the new tipo allegato
	 */
	public void setTipoAllegato(TipoAllegato tipoAllegato) {
		this.tipoAllegato = tipoAllegato;
	}

	/**
	 * Gets the allegato.
	 *
	 * @return the allegato
	 */
	public byte[] getAllegato() {
		return allegato;
	}

	/**
	 * Sets the allegato.
	 *
	 * @param allegato the new allegato
	 */
	public void setAllegato(byte[] allegato) {
		this.allegato = allegato;
	}

	/**
	 * Gets the commissioni psp.
	 *
	 * @return the commissioni psp
	 */
	public BigDecimal getCommissioniPsp() {
		return commissioniPsp;
	}

	/**
	 * Sets the commissioni psp.
	 *
	 * @param commissioniPsp the new commissioni psp
	 */
	public void setCommissioniPsp(BigDecimal commissioniPsp) {
		this.commissioniPsp = commissioniPsp;
	}

	/**
	 * Gets the id rr.
	 *
	 * @return the id rr
	 */
	public Long getIdRr() {
		return idRr;
	}

	/**
	 * Sets the id rr.
	 *
	 * @param idRr the new id rr
	 */
	public void setIdRr(Long idRr) {
		this.idRr = idRr;
	}

	/**
	 * Gets the causale revoca.
	 *
	 * @return the causale revoca
	 */
	public String getCausaleRevoca() {
		return causaleRevoca;
	}

	/**
	 * Sets the causale revoca.
	 *
	 * @param causaleRevoca the new causale revoca
	 */
	public void setCausaleRevoca(String causaleRevoca) {
		this.causaleRevoca = causaleRevoca;
	}

	/**
	 * Gets the dati revoca.
	 *
	 * @return the dati revoca
	 */
	public String getDatiRevoca() {
		return datiRevoca;
	}

	/**
	 * Sets the dati revoca.
	 *
	 * @param datiRevoca the new dati revoca
	 */
	public void setDatiRevoca(String datiRevoca) {
		this.datiRevoca = datiRevoca;
	}

	/**
	 * Gets the esito revoca.
	 *
	 * @return the esito revoca
	 */
	public String getEsitoRevoca() {
		return esitoRevoca;
	}

	/**
	 * Sets the esito revoca.
	 *
	 * @param esitoRevoca the new esito revoca
	 */
	public void setEsitoRevoca(String esitoRevoca) {
		this.esitoRevoca = esitoRevoca;
	}

	/**
	 * Gets the dati esito revoca.
	 *
	 * @return the dati esito revoca
	 */
	public String getDatiEsitoRevoca() {
		return datiEsitoRevoca;
	}

	/**
	 * Sets the dati esito revoca.
	 *
	 * @param datiEsitoRevoca the new dati esito revoca
	 */
	public void setDatiEsitoRevoca(String datiEsitoRevoca) {
		this.datiEsitoRevoca = datiEsitoRevoca;
	}

	/**
	 * Gets the importo revocato.
	 *
	 * @return the importo revocato
	 */
	public BigDecimal getImportoRevocato() {
		return importoRevocato;
	}

	/**
	 * Sets the importo revocato.
	 *
	 * @param importoRevocato the new importo revocato
	 */
	public void setImportoRevocato(BigDecimal importoRevocato) {
		this.importoRevocato = importoRevocato;
	}

	/**
	 * Gets the data acquisizione.
	 *
	 * @return the data acquisizione
	 */
	public Date getDataAcquisizione() {
		return dataAcquisizione;
	}

	/**
	 * Sets the data acquisizione.
	 *
	 * @param dataAcquisizione the new data acquisizione
	 */
	public void setDataAcquisizione(Date dataAcquisizione) {
		this.dataAcquisizione = dataAcquisizione;
	}

	/**
	 * Gets the data acquisizione revoca.
	 *
	 * @return the data acquisizione revoca
	 */
	public Date getDataAcquisizioneRevoca() {
		return dataAcquisizioneRevoca;
	}

	/**
	 * Sets the data acquisizione revoca.
	 *
	 * @param dataAcquisizioneRevoca the new data acquisizione revoca
	 */
	public void setDataAcquisizioneRevoca(Date dataAcquisizioneRevoca) {
		this.dataAcquisizioneRevoca = dataAcquisizioneRevoca;
	}

	/**
	 * Gets the iban accredito.
	 *
	 * @return the iban accredito
	 */
	public String getIbanAccredito() {
		return ibanAccredito;
	}

	/**
	 * Sets the iban accredito.
	 *
	 * @param ibanAccredito the new iban accredito
	 */
	public void setIbanAccredito(String ibanAccredito) {
		this.ibanAccredito = ibanAccredito;
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
	 * Gets the stato.
	 *
	 * @return the stato
	 */
	public Stato getStato() {
		return stato;
	}

	/**
	 * Sets the stato.
	 *
	 * @param stato the new stato
	 */
	public void setStato(Stato stato) {
		this.stato = stato;
	}

	/**
	 * Gets the id incasso.
	 *
	 * @return the id incasso
	 */
	public Long getIdIncasso() {
		return idIncasso;
	}

	/**
	 * Sets the id incasso.
	 *
	 * @param idIncasso the new id incasso
	 */
	public void setIdIncasso(Long idIncasso) {
		this.idIncasso = idIncasso;
	}

	/**
	 * Gets the indice dati.
	 *
	 * @return the indice dati
	 */
	public int getIndiceDati() {
		return indiceDati;
	}

	/**
	 * Sets the indice dati.
	 *
	 * @param indiceDati the new indice dati
	 */
	public void setIndiceDati(int indiceDati) {
		this.indiceDati = indiceDati;
	}
}

