package it.govpay.stampe.pdf.rt;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.gov.digitpa.schemas._2011.pagamenti.CtDatiSingoloPagamentoRT;
import it.gov.digitpa.schemas._2011.pagamenti.CtDatiVersamentoRT;
import it.gov.digitpa.schemas._2011.pagamenti.CtEnteBeneficiario;
import it.gov.digitpa.schemas._2011.pagamenti.CtIstitutoAttestante;
import it.gov.digitpa.schemas._2011.pagamenti.CtRicevutaTelematica;
import it.gov.digitpa.schemas._2011.pagamenti.CtSoggettoPagatore;
import it.gov.digitpa.schemas._2011.pagamenti.CtSoggettoVersante;
import it.govpay.model.Anagrafica;
import it.govpay.model.Dominio;
import it.govpay.model.Pagamento;
import it.govpay.model.RicevutaPagamento;
import it.govpay.model.Versamento;
import it.govpay.model.Versamento.Causale;

// TODO: Auto-generated Javadoc
/**
 * The Class RicevutaPagamentoUtils.
 */
public class RicevutaPagamentoUtils {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(RicevutaPagamentoUtils.class);
	
	/**
	 * Gets the pdf ricevuta pagamento.
	 *
	 * @param logoDominio the logo dominio
	 * @param rt the rt
	 * @param v the v
	 * @param auxDigit the aux digit
	 * @param applicationCode the application code
	 * @param osAPPdf the os AP pdf
	 * @return the pdf ricevuta pagamento
	 * @throws NoImplentationException the no implentation exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public static List<String> getPdfRicevutaPagamento(byte[] logoDominio, CtRicevutaTelematica rt,Versamento v,
			String auxDigit, String applicationCode, OutputStream osAPPdf) throws NoImplentationException, UnsupportedEncodingException {

		RicevutaPagamento ricevuta = new RicevutaPagamento();
		
		CtEnteBeneficiario enteBeneficiario = rt.getEnteBeneficiario();
		Dominio dominioCreditore = new Dominio();
		dominioCreditore.setCodDominio(enteBeneficiario.getIdentificativoUnivocoBeneficiario().getCodiceIdentificativoUnivoco());
		dominioCreditore.setRagioneSociale(enteBeneficiario.getDenominazioneBeneficiario());
		Anagrafica anagraficaCreditore = new Anagrafica();
		anagraficaCreditore.setCap(enteBeneficiario.getCapBeneficiario());
		anagraficaCreditore.setCivico(enteBeneficiario.getCivicoBeneficiario());
		anagraficaCreditore.setCodUnivoco(enteBeneficiario.getIdentificativoUnivocoBeneficiario().getCodiceIdentificativoUnivoco());
		anagraficaCreditore.setIndirizzo(enteBeneficiario.getIndirizzoBeneficiario());
		anagraficaCreditore.setLocalita(enteBeneficiario.getLocalitaBeneficiario());
		anagraficaCreditore.setNazione(enteBeneficiario.getNazioneBeneficiario());
		anagraficaCreditore.setProvincia(enteBeneficiario.getProvinciaBeneficiario());
		anagraficaCreditore.setRagioneSociale(enteBeneficiario.getDenominazioneBeneficiario());
		
		ricevuta.setDominioCreditore(dominioCreditore);
		ricevuta.setCodDominio(dominioCreditore.getCodDominio());
		
		ricevuta.setAnagraficaCreditore(anagraficaCreditore);
		
		CtDatiVersamentoRT datiPagamento = rt.getDatiPagamento();
		ricevuta.setCodAvviso(auxDigit+applicationCode+ datiPagamento.getIdentificativoUnivocoVersamento());
		ricevuta.setIuv(datiPagamento.getIdentificativoUnivocoVersamento());
		
		ricevuta.setCcp(datiPagamento.getCodiceContestoPagamento());
		ricevuta.setImportoPagato(datiPagamento.getImportoTotalePagato());
		
		List<CtDatiSingoloPagamentoRT> datiSingoloPagamento = datiPagamento.getDatiSingoloPagamento();
		if(datiSingoloPagamento!= null && datiSingoloPagamento.size() >0){
			CtDatiSingoloPagamentoRT ctDatiSingoloPagamentoRT = datiSingoloPagamento.get(0);
			ricevuta.setDataPagamento(ctDatiSingoloPagamentoRT.getDataEsitoSingoloPagamento());
			ricevuta.setIdRiscossione(ctDatiSingoloPagamentoRT.getIdentificativoUnivocoRiscossione()); 
			ricevuta.setCausale(ctDatiSingoloPagamentoRT.getCausaleVersamento()); 
			ricevuta.setCommissioni(ctDatiSingoloPagamentoRT.getCommissioniApplicatePSP());
		}
		
		ricevuta.setDataScadenza(v.getDataScadenza());
		ricevuta.setImportoDovuto(v.getImportoTotale());
		ricevuta.setDescrizioneCausale(v.getCausaleVersamento() != null ? v.getCausaleVersamento().getSimple() : ""); 
		
		if(rt.getIstitutoAttestante() != null){
			CtIstitutoAttestante istitutoAttestante = rt.getIstitutoAttestante();
			Anagrafica anagraficaArttestante = new Anagrafica();
			anagraficaArttestante.setCodUnivoco(istitutoAttestante.getIdentificativoUnivocoAttestante().getCodiceIdentificativoUnivoco());
			anagraficaArttestante.setRagioneSociale(istitutoAttestante.getDenominazioneAttestante());
			ricevuta.setAnagraficaAttestante(anagraficaArttestante);
			ricevuta.setPsp(istitutoAttestante.getDenominazioneAttestante());
		}
		
		CtSoggettoPagatore soggettoPagatore = rt.getSoggettoPagatore();
		Anagrafica anagraficaDebitore = new Anagrafica();
		anagraficaDebitore.setCodUnivoco(soggettoPagatore.getIdentificativoUnivocoPagatore().getCodiceIdentificativoUnivoco());
		anagraficaDebitore.setRagioneSociale(soggettoPagatore.getAnagraficaPagatore());
		ricevuta.setAnagraficaDebitore(anagraficaDebitore);
		
		if(rt.getSoggettoVersante() != null){
			CtSoggettoVersante soggettoVersante = rt.getSoggettoVersante();
			Anagrafica anagraficaVersante = new Anagrafica();
			anagraficaVersante.setCodUnivoco(soggettoVersante.getIdentificativoUnivocoVersante().getCodiceIdentificativoUnivoco());
			anagraficaVersante.setRagioneSociale(soggettoVersante.getAnagraficaVersante());
			ricevuta.setAnagraficaVersante(anagraficaVersante);
		}
		ricevuta.setLogoDominioCreditore(logoDominio);
		
		return getPdfRicevutaPagamento( ricevuta, osAPPdf);
	}
	
	/**
	 * Gets the pdf ricevuta pagamento.
	 *
	 * @param logoDominio the logo dominio
	 * @param causale the causale
	 * @param rt the rt
	 * @param p the p
	 * @param auxDigit the aux digit
	 * @param applicationCode the application code
	 * @param osAPPdf the os AP pdf
	 * @return the pdf ricevuta pagamento
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws NoImplentationException the no implentation exception
	 */
	public static List<String> getPdfRicevutaPagamento(byte[] logoDominio, Causale causale, CtRicevutaTelematica rt,
			Pagamento p,String auxDigit, String applicationCode, OutputStream osAPPdf) throws UnsupportedEncodingException, NoImplentationException {

		RicevutaPagamento ricevuta = new RicevutaPagamento();
		
		CtEnteBeneficiario enteBeneficiario = rt.getEnteBeneficiario();
		Dominio dominioCreditore = new Dominio();
		dominioCreditore.setCodDominio(enteBeneficiario.getIdentificativoUnivocoBeneficiario().getCodiceIdentificativoUnivoco());
		dominioCreditore.setRagioneSociale(enteBeneficiario.getDenominazioneBeneficiario());
		Anagrafica anagraficaCreditore = new Anagrafica();
		anagraficaCreditore.setCap(enteBeneficiario.getCapBeneficiario());
		anagraficaCreditore.setCivico(enteBeneficiario.getCivicoBeneficiario());
		anagraficaCreditore.setCodUnivoco(enteBeneficiario.getIdentificativoUnivocoBeneficiario().getCodiceIdentificativoUnivoco());
		anagraficaCreditore.setIndirizzo(enteBeneficiario.getIndirizzoBeneficiario());
		anagraficaCreditore.setLocalita(enteBeneficiario.getLocalitaBeneficiario());
		anagraficaCreditore.setNazione(enteBeneficiario.getNazioneBeneficiario());
		anagraficaCreditore.setProvincia(enteBeneficiario.getProvinciaBeneficiario());
		anagraficaCreditore.setRagioneSociale(enteBeneficiario.getDenominazioneBeneficiario());
		
		ricevuta.setDominioCreditore(dominioCreditore);
		ricevuta.setCodDominio(dominioCreditore.getCodDominio());
		
		ricevuta.setAnagraficaCreditore(anagraficaCreditore);
		
		CtDatiVersamentoRT datiPagamento = rt.getDatiPagamento();
		ricevuta.setCodAvviso(auxDigit+applicationCode+ datiPagamento.getIdentificativoUnivocoVersamento());
		ricevuta.setIuv(datiPagamento.getIdentificativoUnivocoVersamento());
		
		ricevuta.setCcp(datiPagamento.getCodiceContestoPagamento());
		ricevuta.setImportoPagato(datiPagamento.getImportoTotalePagato());
		
		List<CtDatiSingoloPagamentoRT> datiSingoloPagamento = datiPagamento.getDatiSingoloPagamento();
		if(datiSingoloPagamento!= null && datiSingoloPagamento.size() >0){
			CtDatiSingoloPagamentoRT ctDatiSingoloPagamentoRT = datiSingoloPagamento.get(0);
			ricevuta.setDataPagamento(ctDatiSingoloPagamentoRT.getDataEsitoSingoloPagamento());
			ricevuta.setIdRiscossione(ctDatiSingoloPagamentoRT.getIdentificativoUnivocoRiscossione()); 
			ricevuta.setCausale(ctDatiSingoloPagamentoRT.getCausaleVersamento());
			ricevuta.setCommissioni(ctDatiSingoloPagamentoRT.getCommissioniApplicatePSP());
//			ricevuta.setCausale(v.getCausaleVersamento() != null ? v.getCausaleVersamento().getSimple() : ctDatiSingoloPagamentoRT.getCausaleVersamento()); 
		}
		
//		ricevuta.setDataScadenza(v.getDataScadenza());
//		ricevuta.setImportoDovuto(v.getImportoTotale());
		
		ricevuta.setDescrizioneCausale(causale != null ? causale.getSimple() : ""); 
		
		if(rt.getIstitutoAttestante() != null){
			CtIstitutoAttestante istitutoAttestante = rt.getIstitutoAttestante();
			Anagrafica anagraficaArttestante = new Anagrafica();
			anagraficaArttestante.setCodUnivoco(istitutoAttestante.getIdentificativoUnivocoAttestante().getCodiceIdentificativoUnivoco());
			anagraficaArttestante.setRagioneSociale(istitutoAttestante.getDenominazioneAttestante());
			ricevuta.setAnagraficaAttestante(anagraficaArttestante);
			ricevuta.setPsp(istitutoAttestante.getDenominazioneAttestante());
		}
		
		CtSoggettoPagatore soggettoPagatore = rt.getSoggettoPagatore();
		Anagrafica anagraficaDebitore = new Anagrafica();
		anagraficaDebitore.setCodUnivoco(soggettoPagatore.getIdentificativoUnivocoPagatore().getCodiceIdentificativoUnivoco());
		anagraficaDebitore.setRagioneSociale(soggettoPagatore.getAnagraficaPagatore());
		ricevuta.setAnagraficaDebitore(anagraficaDebitore);
		
		if(rt.getSoggettoVersante() != null){
			CtSoggettoVersante soggettoVersante = rt.getSoggettoVersante();
			Anagrafica anagraficaVersante = new Anagrafica();
			anagraficaVersante.setCodUnivoco(soggettoVersante.getIdentificativoUnivocoVersante().getCodiceIdentificativoUnivoco());
			anagraficaVersante.setRagioneSociale(soggettoVersante.getAnagraficaVersante());
			ricevuta.setAnagraficaVersante(anagraficaVersante);
		}
		
		ricevuta.setLogoDominioCreditore(logoDominio);
		
		return getPdfRicevutaPagamento(ricevuta, osAPPdf);
	}
	

	
	/**
	 * Gets the pdf ricevuta pagamento.
	 *
	 * @param ricevuta the ricevuta
	 * @param osAPPdf the os AP pdf
	 * @return the pdf ricevuta pagamento
	 * @throws NoImplentationException the no implentation exception
	 */
	public static List<String> getPdfRicevutaPagamento(RicevutaPagamento ricevuta, OutputStream osAPPdf) throws NoImplentationException  {
		List<String> msgs = new ArrayList<String>();
		try{
			// 1. Prelevo le properties
			String codDominio = ricevuta.getDominioCreditore().getCodDominio();
			RicevutaPagamentoProperties ricevutaPagamentoProperties = RicevutaPagamentoProperties.getInstance();
			Properties propertiesAvvisoPagamentoDominioTributo = getRicevutaPagamentoPropertiesPerDominioTributo(ricevutaPagamentoProperties, codDominio);

			IRicevutaPagamento ricevutaPagamentoBuilder = RicevutaPagamentoFactory.getRicevutaPagamentoBuilder(propertiesAvvisoPagamentoDominioTributo.getProperty(RicevutaPagamentoProperties.RICEVUTA_PAGAMENTO_CLASSNAME_PROP_KEY));

			msgs.add(ricevutaPagamentoBuilder.getPdfRicevutaPagamento(ricevuta, propertiesAvvisoPagamentoDominioTributo, osAPPdf));

			return msgs;
		}catch(NoImplentationException | NoPropertyException e){
			log.error("Nessuna implementazione disponibile",e);
			throw new NoImplentationException(e);
		}
	}

	/**
	 * Gets the ricevuta pagamento properties per dominio tributo.
	 *
	 * @param ricevutaPagamentoProperties the ricevuta pagamento properties
	 * @param codDominio the cod dominio
	 * @return the ricevuta pagamento properties per dominio tributo
	 * @throws NoPropertyException the no property exception
	 */
	public static Properties getRicevutaPagamentoPropertiesPerDominioTributo(RicevutaPagamentoProperties ricevutaPagamentoProperties,String codDominio) throws NoPropertyException  {
		Properties p = null;
		String key = null;
		// Ricerca per codDominio
		if(p == null && StringUtils.isNotBlank(codDominio)){
			key = codDominio;
			try{
				log.debug("Ricerca delle properties per la chiave ["+key+"]");
				p = ricevutaPagamentoProperties.getProperties(key);
			}catch(Exception e){
				log.debug("Non sono state trovate properties per la chiave ["+key+"]: " + e.getMessage(),e); 
			}
		}

		// utilizzo le properties di default
		try{
			log.debug("Ricerca delle properties di default");
			p = ricevutaPagamentoProperties.getProperties(null);
		}catch(NoPropertyException e){
			log.debug("Non sono state trovate properties di default: " + e.getMessage());
			throw e;
		}

		return p;
	}
}
