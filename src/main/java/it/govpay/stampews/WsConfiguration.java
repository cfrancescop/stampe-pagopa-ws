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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.govpay.stampe.pdf.avviso.AvvisoPagamentoProperties;
import it.govpay.stampe.pdf.rt.IRicevutaPagamento;
import it.govpay.stampe.pdf.rt.RicevutaPagamentoPdf;
import it.govpay.stampe.pdf.rt.RicevutaPagamentoProperties;
import it.govpay.stampe.pdf.avviso.AvvisoPagamentoPdf;
// TODO: Auto-generated Javadoc

/**
 * The Class WsConfiguration.
 */
@Configuration
public class WsConfiguration {
	
	/** The Constant GOVPAY_DIR. */
	private static final String GOVPAY_DIR =System.getProperty("GOVPAY_DIR",  "/var/govpay");

	/**
	 * Avviso pdf.
	 *
	 * @return the avviso pagamento pdf
	 */
	@Bean
	public AvvisoPagamentoPdf avvisoPdf() {
		return AvvisoPagamentoPdf.getInstance();
	}
	
	/**
	 * Avviso pagamento properties.
	 *
	 * @return the avviso pagamento properties
	 * @throws Exception the exception
	 */
	@Bean
	public AvvisoPagamentoProperties avvisoPagamentoProperties() throws Exception {
		return AvvisoPagamentoProperties.newInstance(GOVPAY_DIR);
	}
	
	/**
	 * Ricevuta pagamento properties.
	 *
	 * @return the ricevuta pagamento properties
	 * @throws Exception the exception
	 */
	@Bean
	public RicevutaPagamentoProperties ricevutaPagamentoProperties() throws Exception {
		return RicevutaPagamentoProperties.newInstance(GOVPAY_DIR);
	}
	
	/**
	 * I ricevuta pagamento.
	 *
	 * @return the i ricevuta pagamento
	 */
	@Bean
	public IRicevutaPagamento iRicevutaPagamento() {
		return new RicevutaPagamentoPdf();
	}
}
