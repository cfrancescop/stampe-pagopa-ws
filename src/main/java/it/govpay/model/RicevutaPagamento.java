package it.govpay.model;

import java.math.BigDecimal;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class RicevutaPagamento.
 */
public class RicevutaPagamento {
	
	/** The esito. */
	private String esito;
	
	/** The dominio creditore. */
	private Dominio dominioCreditore;
	
	/** The anagrafica creditore. */
	private Anagrafica anagraficaCreditore;
	
	/** The anagrafica versante. */
	private Anagrafica anagraficaVersante;
	
	/** The anagrafica attestante. */
	private Anagrafica anagraficaAttestante;
	
	/** The data scadenza. */
	private Date dataScadenza;
	
	/** The data pagamento. */
	private Date dataPagamento;
	
	/** The iuv. */
	private String iuv;
	
	/** The importo dovuto. */
	private BigDecimal importoDovuto;
	
	/** The importo pagato. */
	private BigDecimal importoPagato;
	
	/** The commissioni. */
	private BigDecimal commissioni;
	
	/** The anagrafica debitore. */
	private Anagrafica anagraficaDebitore;
	
	/** The causale. */
	private String causale;
	
	/** The descrizione causale. */
	private String descrizioneCausale;
	
	/** The cod versamento. */
	private String codVersamento;
	
	/** The cod avviso. */
	private String codAvviso;
	
	/** The ccp. */
	private String ccp;
	
	/** The psp. */
	private String psp;
	
	/** The canale. */
	private String canale;
	
	/** The id riscossione. */
	private String idRiscossione;
	
	/** The cod dominio. */
	private String codDominio;
	
	/** The logo dominio creditore. */
	private byte[] logoDominioCreditore=null;
	
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
	 * Gets the importo dovuto.
	 *
	 * @return the importo dovuto
	 */
	public BigDecimal getImportoDovuto() {
		return importoDovuto;
	}
	
	/**
	 * Sets the importo dovuto.
	 *
	 * @param importoDovuto the new importo dovuto
	 */
	public void setImportoDovuto(BigDecimal importoDovuto) {
		this.importoDovuto = importoDovuto;
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
	 * Gets the cod avviso.
	 *
	 * @return the cod avviso
	 */
	public String getCodAvviso() {
		return codAvviso;
	}
	
	/**
	 * Sets the cod avviso.
	 *
	 * @param codAvviso the new cod avviso
	 */
	public void setCodAvviso(String codAvviso) {
		this.codAvviso = codAvviso;
	}
	
	/**
	 * Gets the ccp.
	 *
	 * @return the ccp
	 */
	public String getCcp() {
		return ccp;
	}
	
	/**
	 * Sets the ccp.
	 *
	 * @param ccp the new ccp
	 */
	public void setCcp(String ccp) {
		this.ccp = ccp;
	}
	
	/**
	 * Gets the psp.
	 *
	 * @return the psp
	 */
	public String getPsp() {
		return psp;
	}
	
	/**
	 * Sets the psp.
	 *
	 * @param psp the new psp
	 */
	public void setPsp(String psp) {
		this.psp = psp;
	}
	
	/**
	 * Gets the canale.
	 *
	 * @return the canale
	 */
	public String getCanale() {
		return canale;
	}
	
	/**
	 * Sets the canale.
	 *
	 * @param canale the new canale
	 */
	public void setCanale(String canale) {
		this.canale = canale;
	}
	
	/**
	 * Gets the id riscossione.
	 *
	 * @return the id riscossione
	 */
	public String getIdRiscossione() {
		return idRiscossione;
	}
	
	/**
	 * Sets the id riscossione.
	 *
	 * @param idRiscossione the new id riscossione
	 */
	public void setIdRiscossione(String idRiscossione) {
		this.idRiscossione = idRiscossione;
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
	 * Gets the anagrafica versante.
	 *
	 * @return the anagrafica versante
	 */
	public Anagrafica getAnagraficaVersante() {
		return anagraficaVersante;
	}
	
	/**
	 * Sets the anagrafica versante.
	 *
	 * @param anagraficaVersante the new anagrafica versante
	 */
	public void setAnagraficaVersante(Anagrafica anagraficaVersante) {
		this.anagraficaVersante = anagraficaVersante;
	}
	
	/**
	 * Gets the anagrafica attestante.
	 *
	 * @return the anagrafica attestante
	 */
	public Anagrafica getAnagraficaAttestante() {
		return anagraficaAttestante;
	}
	
	/**
	 * Sets the anagrafica attestante.
	 *
	 * @param anagraficaAttestante the new anagrafica attestante
	 */
	public void setAnagraficaAttestante(Anagrafica anagraficaAttestante) {
		this.anagraficaAttestante = anagraficaAttestante;
	}
	
	/**
	 * Gets the commissioni.
	 *
	 * @return the commissioni
	 */
	public BigDecimal getCommissioni() {
		return commissioni;
	}
	
	/**
	 * Sets the commissioni.
	 *
	 * @param commissioni the new commissioni
	 */
	public void setCommissioni(BigDecimal commissioni) {
		this.commissioni = commissioni;
	}
	
	/**
	 * Gets the descrizione causale.
	 *
	 * @return the descrizione causale
	 */
	public String getDescrizioneCausale() {
		return descrizioneCausale;
	}
	
	/**
	 * Sets the descrizione causale.
	 *
	 * @param descrizioneCausale the new descrizione causale
	 */
	public void setDescrizioneCausale(String descrizioneCausale) {
		this.descrizioneCausale = descrizioneCausale;
	}
	
	/**
	 * Gets the logo dominio creditore.
	 *
	 * @return the logo dominio creditore
	 */
	public byte[] getLogoDominioCreditore() {
		return logoDominioCreditore;
	}
	
	/**
	 * Sets the logo dominio creditore.
	 *
	 * @param logoDominioCreditore the new logo dominio creditore
	 */
	public void setLogoDominioCreditore(byte[] logoDominioCreditore) {
		this.logoDominioCreditore = logoDominioCreditore;
	}
	
	/**
	 * Gets the esito.
	 *
	 * @return the esito
	 */
	public String getEsito() {
		return esito;
	}
	
	/**
	 * Sets the esito.
	 *
	 * @param esito the new esito
	 */
	public void setEsito(String esito) {
		this.esito = esito;
	}
	
}
