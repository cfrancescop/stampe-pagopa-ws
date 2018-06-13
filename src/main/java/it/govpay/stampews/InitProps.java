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

import it.govpay.stampe.pdf.rt.RicevutaPagamentoProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class InitProps.
 */
@Configuration
public class InitProps {
	
	/**
	 * Ricevuta pagamento properties.
	 *
	 * @return the ricevuta pagamento properties
	 * @throws Exception the exception
	 */
	@Bean
	public RicevutaPagamentoProperties ricevutaPagamentoProperties() throws Exception {
		return RicevutaPagamentoProperties.newInstance("");
	}
}
