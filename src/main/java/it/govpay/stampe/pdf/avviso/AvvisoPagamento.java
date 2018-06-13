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
package it.govpay.stampe.pdf.avviso;

// TODO: Auto-generated Javadoc
/**
 * The Class AvvisoPagamento.
 */
public class AvvisoPagamento{
	
	/**
	 * The Enum StatoAvviso.
	 */
	public enum StatoAvviso {
		
		/** The da stampare. */
		DA_STAMPARE, 
 /** The stampato. */
 STAMPATO
	}
	
	/** The id. */
	private Long id;
	
	/** The cod dominio. */
	private java.lang.String codDominio;
	
	/** The iuv. */
	private java.lang.String iuv;
	
	/** The data creazione. */
	private java.util.Date dataCreazione;
	
	/** The stato. */
	private StatoAvviso stato;
	
	/** The pdf. */
	private byte[] pdf;
	
	
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
	public java.lang.String getCodDominio() {
		return codDominio;
	}
	
	/**
	 * Sets the cod dominio.
	 *
	 * @param codDominio the new cod dominio
	 */
	public void setCodDominio(java.lang.String codDominio) {
		this.codDominio = codDominio;
	}
	
	/**
	 * Gets the iuv.
	 *
	 * @return the iuv
	 */
	public java.lang.String getIuv() {
		return iuv;
	}
	
	/**
	 * Sets the iuv.
	 *
	 * @param iuv the new iuv
	 */
	public void setIuv(java.lang.String iuv) {
		this.iuv = iuv;
	}
	
	/**
	 * Gets the data creazione.
	 *
	 * @return the data creazione
	 */
	public java.util.Date getDataCreazione() {
		return dataCreazione;
	}
	
	/**
	 * Sets the data creazione.
	 *
	 * @param dataCreazione the new data creazione
	 */
	public void setDataCreazione(java.util.Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	
	/**
	 * Gets the stato.
	 *
	 * @return the stato
	 */
	public StatoAvviso getStato() {
		return stato;
	}
	
	/**
	 * Sets the stato.
	 *
	 * @param stato the new stato
	 */
	public void setStato(StatoAvviso stato) {
		this.stato = stato;
	}
	
	/**
	 * Gets the pdf.
	 *
	 * @return the pdf
	 */
	public byte[] getPdf() {
		return pdf;
	}
	
	/**
	 * Sets the pdf.
	 *
	 * @param pdf the new pdf
	 */
	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}
	
}
