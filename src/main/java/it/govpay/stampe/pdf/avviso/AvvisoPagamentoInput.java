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

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 *  <p>Java class for AvvisoPagamentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvvisoPagamentoInput">
 * 		&lt;sequence>
 * 			&lt;element name="ente_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="agid_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="pagopa_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="pagopa90_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="app_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="place_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="importo_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="scadenza_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 *  		&lt;element name="taglio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 *  		&lt;element name="taglio1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_denominazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_identificativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_identificativo_split" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_cbill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_peo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_pec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="ente_partner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="intestatario_denominazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="intestatario_identificativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="intestatario_indirizzo_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="intestatario_indirizzo_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_causale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_mav" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_importo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_scadenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_numero_split" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_iuv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_iuv_split" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 			&lt;element name="avviso_qrcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="1" maxOccurs="1"/>
 * 		&lt;/sequence>
 * &lt;/complexType>
 * </pre>
 *
 * @author Giovanni Bussu (bussu@link.it)
 * @author Lorenzo Nardi (nardi@link.it)
 * @author $Author$
 * @version $Rev$, $Date$
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvvisoPagamentoInput", 
  propOrder = {
  	"enteLogo",
  	"agidLogo",
  	"pagopaLogo",
  	"pagopa90Logo",
  	"appLogo",
  	"placeLogo",
  	"importoLogo",
  	"scadenzaLogo",
  	"taglio",
  	"taglio1",
  	"enteDenominazione",
  	"enteArea",
  	"enteIdentificativo",
  	"enteIdentificativoSplit",
  	"enteCbill",
  	"enteUrl",
  	"entePeo",
  	"entePec",
  	"entePartner",
  	"intestatarioDenominazione",
  	"intestatarioIdentificativo",
  	"intestatarioIndirizzo1",
  	"intestatarioIndirizzo2",
  	"avvisoCausale",
  	"avvisoMav",
  	"avvisoImporto",
  	"avvisoScadenza",
  	"avvisoNumero",
  	"avvisoNumeroSplit",
  	"avvisoIuv",
  	"avvisoIuvSplit",
  	"avvisoBarcode",
  	"avvisoQrcode"
  }
, namespace=""
)

@XmlRootElement(name = "input", namespace="")

public class AvvisoPagamentoInput extends Serializer implements Serializable , Cloneable {
	
	
  /**
   * Instantiates a new avviso pagamento input.
   */
  public AvvisoPagamentoInput() {
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public Long getId() {
    if(this.id!=null)
		return this.id;
	else
		return new Long(-1);
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(Long id) {
    if(id!=null)
		this.id=id;
	else
		this.id=new Long(-1);
  }

  /**
   * Gets the ente logo.
   *
   * @return the ente logo
   */
  public java.lang.String getEnteLogo() {
    return this.enteLogo;
  }

  /**
   * Sets the ente logo.
   *
   * @param enteLogo the new ente logo
   */
  public void setEnteLogo(java.lang.String enteLogo) {
    this.enteLogo = enteLogo;
  }

  /**
   * Gets the agid logo.
   *
   * @return the agid logo
   */
  public java.lang.String getAgidLogo() {
    return this.agidLogo;
  }

  /**
   * Sets the agid logo.
   *
   * @param agidLogo the new agid logo
   */
  public void setAgidLogo(java.lang.String agidLogo) {
    this.agidLogo = agidLogo;
  }

  /**
   * Gets the pagopa logo.
   *
   * @return the pagopa logo
   */
  public java.lang.String getPagopaLogo() {
    return this.pagopaLogo;
  }

  /**
   * Sets the pagopa logo.
   *
   * @param pagopaLogo the new pagopa logo
   */
  public void setPagopaLogo(java.lang.String pagopaLogo) {
    this.pagopaLogo = pagopaLogo;
  }

  /**
   * Gets the pagopa 90 logo.
   *
   * @return the pagopa 90 logo
   */
  public java.lang.String getPagopa90Logo() {
    return this.pagopa90Logo;
  }

  /**
   * Sets the pagopa 90 logo.
   *
   * @param pagopa90Logo the new pagopa 90 logo
   */
  public void setPagopa90Logo(java.lang.String pagopa90Logo) {
    this.pagopa90Logo = pagopa90Logo;
  }

  /**
   * Gets the app logo.
   *
   * @return the app logo
   */
  public java.lang.String getAppLogo() {
    return this.appLogo;
  }

  /**
   * Sets the app logo.
   *
   * @param appLogo the new app logo
   */
  public void setAppLogo(java.lang.String appLogo) {
    this.appLogo = appLogo;
  }

  /**
   * Gets the place logo.
   *
   * @return the place logo
   */
  public java.lang.String getPlaceLogo() {
    return this.placeLogo;
  }

  /**
   * Sets the place logo.
   *
   * @param placeLogo the new place logo
   */
  public void setPlaceLogo(java.lang.String placeLogo) {
    this.placeLogo = placeLogo;
  }

  /**
   * Gets the importo logo.
   *
   * @return the importo logo
   */
  public java.lang.String getImportoLogo() {
    return this.importoLogo;
  }

  /**
   * Sets the importo logo.
   *
   * @param importoLogo the new importo logo
   */
  public void setImportoLogo(java.lang.String importoLogo) {
    this.importoLogo = importoLogo;
  }

  /**
   * Gets the scadenza logo.
   *
   * @return the scadenza logo
   */
  public java.lang.String getScadenzaLogo() {
    return this.scadenzaLogo;
  }

  /**
   * Sets the scadenza logo.
   *
   * @param scadenzaLogo the new scadenza logo
   */
  public void setScadenzaLogo(java.lang.String scadenzaLogo) {
    this.scadenzaLogo = scadenzaLogo;
  }

  /**
   * Gets the ente denominazione.
   *
   * @return the ente denominazione
   */
  public java.lang.String getEnteDenominazione() {
    return this.enteDenominazione;
  }

  /**
   * Sets the ente denominazione.
   *
   * @param enteDenominazione the new ente denominazione
   */
  public void setEnteDenominazione(java.lang.String enteDenominazione) {
    this.enteDenominazione = enteDenominazione;
  }

  /**
   * Gets the ente area.
   *
   * @return the ente area
   */
  public java.lang.String getEnteArea() {
    return this.enteArea;
  }

  /**
   * Sets the ente area.
   *
   * @param enteArea the new ente area
   */
  public void setEnteArea(java.lang.String enteArea) {
    this.enteArea = enteArea;
  }

  /**
   * Gets the ente identificativo.
   *
   * @return the ente identificativo
   */
  public java.lang.String getEnteIdentificativo() {
    return this.enteIdentificativo;
  }

  /**
   * Sets the ente identificativo.
   *
   * @param enteIdentificativo the new ente identificativo
   */
  public void setEnteIdentificativo(java.lang.String enteIdentificativo) {
    this.enteIdentificativo = enteIdentificativo;
  }

  /**
   * Gets the ente identificativo split.
   *
   * @return the ente identificativo split
   */
  public java.lang.String getEnteIdentificativoSplit() {
    return this.enteIdentificativoSplit;
  }

  /**
   * Sets the ente identificativo split.
   *
   * @param enteIdentificativoSplit the new ente identificativo split
   */
  public void setEnteIdentificativoSplit(java.lang.String enteIdentificativoSplit) {
    this.enteIdentificativoSplit = enteIdentificativoSplit;
  }

  /**
   * Gets the ente cbill.
   *
   * @return the ente cbill
   */
  public java.lang.String getEnteCbill() {
    return this.enteCbill;
  }

  /**
   * Sets the ente cbill.
   *
   * @param enteCbill the new ente cbill
   */
  public void setEnteCbill(java.lang.String enteCbill) {
    this.enteCbill = enteCbill;
  }

  /**
   * Gets the ente url.
   *
   * @return the ente url
   */
  public java.lang.String getEnteUrl() {
    return this.enteUrl;
  }

  /**
   * Sets the ente url.
   *
   * @param enteUrl the new ente url
   */
  public void setEnteUrl(java.lang.String enteUrl) {
    this.enteUrl = enteUrl;
  }

  /**
   * Gets the ente peo.
   *
   * @return the ente peo
   */
  public java.lang.String getEntePeo() {
    return this.entePeo;
  }

  /**
   * Sets the ente peo.
   *
   * @param entePeo the new ente peo
   */
  public void setEntePeo(java.lang.String entePeo) {
    this.entePeo = entePeo;
  }

  /**
   * Gets the ente pec.
   *
   * @return the ente pec
   */
  public java.lang.String getEntePec() {
    return this.entePec;
  }

  /**
   * Sets the ente pec.
   *
   * @param entePec the new ente pec
   */
  public void setEntePec(java.lang.String entePec) {
    this.entePec = entePec;
  }

  /**
   * Gets the ente partner.
   *
   * @return the ente partner
   */
  public java.lang.String getEntePartner() {
    return this.entePartner;
  }

  /**
   * Sets the ente partner.
   *
   * @param entePartner the new ente partner
   */
  public void setEntePartner(java.lang.String entePartner) {
    this.entePartner = entePartner;
  }

  /**
   * Gets the intestatario denominazione.
   *
   * @return the intestatario denominazione
   */
  public java.lang.String getIntestatarioDenominazione() {
    return this.intestatarioDenominazione;
  }

  /**
   * Sets the intestatario denominazione.
   *
   * @param intestatarioDenominazione the new intestatario denominazione
   */
  public void setIntestatarioDenominazione(java.lang.String intestatarioDenominazione) {
    this.intestatarioDenominazione = intestatarioDenominazione;
  }

  /**
   * Gets the intestatario identificativo.
   *
   * @return the intestatario identificativo
   */
  public java.lang.String getIntestatarioIdentificativo() {
    return this.intestatarioIdentificativo;
  }

  /**
   * Sets the intestatario identificativo.
   *
   * @param intestatarioIdentificativo the new intestatario identificativo
   */
  public void setIntestatarioIdentificativo(java.lang.String intestatarioIdentificativo) {
    this.intestatarioIdentificativo = intestatarioIdentificativo;
  }

  /**
   * Gets the intestatario indirizzo 1.
   *
   * @return the intestatario indirizzo 1
   */
  public java.lang.String getIntestatarioIndirizzo1() {
    return this.intestatarioIndirizzo1;
  }

  /**
   * Sets the intestatario indirizzo 1.
   *
   * @param intestatarioIndirizzo1 the new intestatario indirizzo 1
   */
  public void setIntestatarioIndirizzo1(java.lang.String intestatarioIndirizzo1) {
    this.intestatarioIndirizzo1 = intestatarioIndirizzo1;
  }

  /**
   * Gets the intestatario indirizzo 2.
   *
   * @return the intestatario indirizzo 2
   */
  public java.lang.String getIntestatarioIndirizzo2() {
    return this.intestatarioIndirizzo2;
  }

  /**
   * Sets the intestatario indirizzo 2.
   *
   * @param intestatarioIndirizzo2 the new intestatario indirizzo 2
   */
  public void setIntestatarioIndirizzo2(java.lang.String intestatarioIndirizzo2) {
    this.intestatarioIndirizzo2 = intestatarioIndirizzo2;
  }

  /**
   * Gets the avviso causale.
   *
   * @return the avviso causale
   */
  public java.lang.String getAvvisoCausale() {
    return this.avvisoCausale;
  }

  /**
   * Sets the avviso causale.
   *
   * @param avvisoCausale the new avviso causale
   */
  public void setAvvisoCausale(java.lang.String avvisoCausale) {
    this.avvisoCausale = avvisoCausale;
  }

  /**
   * Checks if is avviso mav.
   *
   * @return true, if is avviso mav
   */
  public boolean isAvvisoMav() {
    return this.avvisoMav;
  }

  /**
   * Gets the avviso mav.
   *
   * @return the avviso mav
   */
  public boolean getAvvisoMav() {
    return this.avvisoMav;
  }

  /**
   * Sets the avviso mav.
   *
   * @param avvisoMav the new avviso mav
   */
  public void setAvvisoMav(boolean avvisoMav) {
    this.avvisoMav = avvisoMav;
  }

  /**
   * Gets the avviso importo.
   *
   * @return the avviso importo
   */
  public BigDecimal getAvvisoImporto() {
    return this.avvisoImporto;
  }

  /**
   * Sets the avviso importo.
   *
   * @param avvisoImporto the new avviso importo
   */
  public void setAvvisoImporto(BigDecimal avvisoImporto) {
    this.avvisoImporto = avvisoImporto;
  }

  /**
   * Gets the avviso scadenza.
   *
   * @return the avviso scadenza
   */
  public java.lang.String getAvvisoScadenza() {
    return this.avvisoScadenza;
  }

  /**
   * Sets the avviso scadenza.
   *
   * @param avvisoScadenza the new avviso scadenza
   */
  public void setAvvisoScadenza(java.lang.String avvisoScadenza) {
    this.avvisoScadenza = avvisoScadenza;
  }

  /**
   * Gets the avviso numero.
   *
   * @return the avviso numero
   */
  public java.lang.String getAvvisoNumero() {
    return this.avvisoNumero;
  }

  /**
   * Sets the avviso numero.
   *
   * @param avvisoNumero the new avviso numero
   */
  public void setAvvisoNumero(java.lang.String avvisoNumero) {
    this.avvisoNumero = avvisoNumero;
  }

  /**
   * Gets the avviso numero split.
   *
   * @return the avviso numero split
   */
  public java.lang.String getAvvisoNumeroSplit() {
    return this.avvisoNumeroSplit;
  }

  /**
   * Sets the avviso numero split.
   *
   * @param avvisoNumeroSplit the new avviso numero split
   */
  public void setAvvisoNumeroSplit(java.lang.String avvisoNumeroSplit) {
    this.avvisoNumeroSplit = avvisoNumeroSplit;
  }

  /**
   * Gets the avviso iuv.
   *
   * @return the avviso iuv
   */
  public java.lang.String getAvvisoIuv() {
    return this.avvisoIuv;
  }

  /**
   * Sets the avviso iuv.
   *
   * @param avvisoIuv the new avviso iuv
   */
  public void setAvvisoIuv(java.lang.String avvisoIuv) {
    this.avvisoIuv = avvisoIuv;
  }

  /**
   * Gets the avviso iuv split.
   *
   * @return the avviso iuv split
   */
  public java.lang.String getAvvisoIuvSplit() {
    return this.avvisoIuvSplit;
  }

  /**
   * Sets the avviso iuv split.
   *
   * @param avvisoIuvSplit the new avviso iuv split
   */
  public void setAvvisoIuvSplit(java.lang.String avvisoIuvSplit) {
    this.avvisoIuvSplit = avvisoIuvSplit;
  }

  /**
   * Gets the avviso barcode.
   *
   * @return the avviso barcode
   */
  public java.lang.String getAvvisoBarcode() {
    return this.avvisoBarcode;
  }

  /**
   * Sets the avviso barcode.
   *
   * @param avvisoBarcode the new avviso barcode
   */
  public void setAvvisoBarcode(java.lang.String avvisoBarcode) {
    this.avvisoBarcode = avvisoBarcode;
  }
 
  /**
   * Gets the avviso qrcode.
   *
   * @return the avviso qrcode
   */
  public java.lang.String getAvvisoQrcode() {
    return this.avvisoQrcode;
  }

  /**
   * Sets the avviso qrcode.
   *
   * @param avvisoQrcode the new avviso qrcode
   */
  public void setAvvisoQrcode(java.lang.String avvisoQrcode) {
    this.avvisoQrcode = avvisoQrcode;
  }
  
	  /**
  	 * Gets the taglio.
  	 *
  	 * @return the taglio
  	 */
  	public java.lang.String getTaglio() {
		return taglio;
	}
	
	/**
	 * Sets the taglio.
	 *
	 * @param taglio the new taglio
	 */
	public void setTaglio(java.lang.String taglio) {
		this.taglio = taglio;
	}
	
	/**
	 * Gets the taglio 1.
	 *
	 * @return the taglio 1
	 */
	public java.lang.String getTaglio1() {
		return taglio1;
	}
	
	/**
	 * Sets the taglio 1.
	 *
	 * @param taglio1 the new taglio 1
	 */
	public void setTaglio1(java.lang.String taglio1) {
		this.taglio1 = taglio1;
	}


/** The Constant serialVersionUID. */
private static final long serialVersionUID = 1L;

  /** The id. */
  @XmlTransient
  private Long id;



  /** The ente logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_logo",required=true,nillable=false)
  protected java.lang.String enteLogo;

  /** The agid logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="agid_logo",required=true,nillable=false)
  protected java.lang.String agidLogo;

  /** The pagopa logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="pagopa_logo",required=true,nillable=false)
  protected java.lang.String pagopaLogo;

  /** The pagopa 90 logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="pagopa90_logo",required=true,nillable=false)
  protected java.lang.String pagopa90Logo;

  /** The app logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="app_logo",required=true,nillable=false)
  protected java.lang.String appLogo;

  /** The place logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="place_logo",required=true,nillable=false)
  protected java.lang.String placeLogo;

  /** The importo logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="importo_logo",required=true,nillable=false)
  protected java.lang.String importoLogo;

  /** The scadenza logo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="scadenza_logo",required=true,nillable=false)
  protected java.lang.String scadenzaLogo;
  
  /** The taglio. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="taglio",required=true,nillable=false)
  protected java.lang.String taglio;
  
  /** The taglio 1. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="taglio1",required=true,nillable=false)
  protected java.lang.String taglio1;

  /** The ente denominazione. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_denominazione",required=true,nillable=false)
  protected java.lang.String enteDenominazione;

  /** The ente area. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_area",required=true,nillable=false)
  protected java.lang.String enteArea;

  /** The ente identificativo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_identificativo",required=true,nillable=false)
  protected java.lang.String enteIdentificativo;

  /** The ente identificativo split. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_identificativo_split",required=true,nillable=false)
  protected java.lang.String enteIdentificativoSplit;

  /** The ente cbill. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_cbill",required=true,nillable=false)
  protected java.lang.String enteCbill;

  /** The ente url. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_url",required=true,nillable=false)
  protected java.lang.String enteUrl;

  /** The ente peo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_peo",required=true,nillable=false)
  protected java.lang.String entePeo;

  /** The ente pec. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_pec",required=true,nillable=false)
  protected java.lang.String entePec;

  /** The ente partner. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="ente_partner",required=true,nillable=false)
  protected java.lang.String entePartner;

  /** The intestatario denominazione. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="intestatario_denominazione",required=true,nillable=false)
  protected java.lang.String intestatarioDenominazione;

  /** The intestatario identificativo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="intestatario_identificativo",required=true,nillable=false)
  protected java.lang.String intestatarioIdentificativo;

  /** The intestatario indirizzo 1. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="intestatario_indirizzo_1",required=true,nillable=false)
  protected java.lang.String intestatarioIndirizzo1;

  /** The intestatario indirizzo 2. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="intestatario_indirizzo_2",required=true,nillable=false)
  protected java.lang.String intestatarioIndirizzo2;

  /** The avviso causale. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_causale",required=true,nillable=false)
  protected java.lang.String avvisoCausale;

  /** The avviso mav. */
  @javax.xml.bind.annotation.XmlSchemaType(name="boolean")
  @XmlElement(name="avviso_mav",required=true,nillable=false)
  protected boolean avvisoMav;

  /** The avviso importo. */
  @javax.xml.bind.annotation.XmlSchemaType(name="double")
  @XmlElement(name="avviso_importo",required=true,nillable=false)
  protected BigDecimal avvisoImporto;

  /** The avviso scadenza. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_scadenza",required=true,nillable=false)
  protected java.lang.String avvisoScadenza;

  /** The avviso numero. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_numero",required=true,nillable=false)
  protected java.lang.String avvisoNumero;

  /** The avviso numero split. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_numero_split",required=true,nillable=false)
  protected java.lang.String avvisoNumeroSplit;

  /** The avviso iuv. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_iuv",required=true,nillable=false)
  protected java.lang.String avvisoIuv;

  /** The avviso iuv split. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_iuv_split",required=true,nillable=false)
  protected java.lang.String avvisoIuvSplit;

  /** The avviso barcode. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_barcode",required=true,nillable=false)
  protected java.lang.String avvisoBarcode;

  /** The avviso qrcode. */
  @javax.xml.bind.annotation.XmlSchemaType(name="string")
  @XmlElement(name="avviso_qrcode",required=true,nillable=false)
  protected java.lang.String avvisoQrcode;

}
