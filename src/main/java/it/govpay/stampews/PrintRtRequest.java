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

import it.gov.digitpa.schemas._2011.pagamenti.CtRicevutaTelematica;

// TODO: Auto-generated Javadoc
/**
 * The Class PrintRtRequest.
 */
public class PrintRtRequest {
	
	/** The rt. */
	private CtRicevutaTelematica rt;
	
	/** The causale. */
	String causale;
	
	/** The aux digit. */
	String auxDigit;
	
	/** The application code. */
	String applicationCode;
	
	/** The esito. */
	private String esito;
	
	
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
	 * Gets the aux digit.
	 *
	 * @return the aux digit
	 */
	public String getAuxDigit() {
		return auxDigit;
	}
	
	/**
	 * Sets the aux digit.
	 *
	 * @param auxDigit the new aux digit
	 */
	public void setAuxDigit(String auxDigit) {
		this.auxDigit = auxDigit;
	}
	
	/**
	 * Gets the application code.
	 *
	 * @return the application code
	 */
	public String getApplicationCode() {
		return applicationCode;
	}
	
	/**
	 * Sets the application code.
	 *
	 * @param applicationCode the new application code
	 */
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	
	/**
	 * Gets the rt.
	 *
	 * @return the rt
	 */
	public CtRicevutaTelematica getRt() {
		return rt;
	}
	
	/**
	 * Sets the rt.
	 *
	 * @param rt the new rt
	 */
	public void setRt(CtRicevutaTelematica rt) {
		this.rt = rt;
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