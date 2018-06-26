package it.govpay.stampe.pdf.rt;


import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.govpay.model.RicevutaPagamento;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.jasper.builder.export.JasperPdfExporterBuilder;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.constant.PageOrientation;
import net.sf.dynamicreports.report.constant.PageType;

import static net.sf.dynamicreports.report.builder.DynamicReports.export;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;

// TODO: Auto-generated Javadoc
/**
 * The Class RicevutaPagamentoPdf.
 */
public class RicevutaPagamentoPdf implements IRicevutaPagamento{
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(RicevutaPagamentoPdf.class);
	public String getPdfRicevutaPagamento(RicevutaPagamento ricevuta, Properties prop, OutputStream os)  {
		String msg = null;
		List<String> errList = new ArrayList<String>();

		try{
			JasperPdfExporterBuilder pdfExporter = export.pdfExporter(os);
			JasperReportBuilder report = report();

			List<ComponentBuilder<?, ?>> cl = new ArrayList<>();

			ComponentBuilder<?, ?> createTitleComponent = TemplateRt.createTitleComponent(ricevuta,errList);
			if(createTitleComponent != null) {
				cl.add(createTitleComponent);
				// Aggiunge Debitore,Creditore,Attestante ed esito 
				ComponentBuilder<?,?> createSezioneCreditore = TemplateRt.createSezioneCreditore(ricevuta, errList);
				cl.add(createSezioneCreditore);

//				ComponentBuilder<?,?> createSezioneTitoloRicevuta = TemplateRt.createSezioneTitoloRicevuta(ricevuta, errList, log);
//				cl.add(createSezioneTitoloRicevuta);
				// aggiunge la parte degli importi
				ComponentBuilder<?,?> createSezioneImporti = TemplateRt.createSezioneImporti(ricevuta, errList); 

				if(createSezioneImporti != null)
					cl.add(createSezioneImporti);

				// se ho generato almeno il titolo allora produco il pdf.
				if(cl.size() > 0){

					ComponentBuilder<?, ?>[] ca = new ComponentBuilder<?, ?>[cl.size()];

					//configure report
					report.setPageFormat(PageType.A4, PageOrientation.PORTRAIT)
					.setTemplate(TemplateBase.reportTemplate)
					.title(cl.toArray(ca))
					.toPdf(pdfExporter);
				}
			}
		}catch(Exception e){
			log.error("Errore durante la generazione della ricevuta di pagamento ["+ricevuta.getCodAvviso()+"]: "+ e.getMessage()); 
			errList.add(0,"Errore durante la generazione della ricevuta di pagamento ["+ricevuta.getCodAvviso()+"]: "+e.getMessage());
		}

		// colleziono eventuali errori durante la generazione del pdf
		if(errList.size() > 0){
			StringBuilder sb = new StringBuilder();

			for (String errore : errList) {
				if(sb.length() > 0)
					sb.append(", ");

				sb.append(errore);
			}
			msg = sb.toString();
		}

		return msg;
	}

//	private static ComponentBuilder<?, ?> createRicevutaPagamentoList(String label , CtRicevutaTelematica rt, String causale) {
//		HorizontalListBuilder list = cmp.horizontalList().setBaseStyle(stl.style(TemplateBase.fontStyle12).setLeftPadding(10));
//		CtDatiVersamentoRT datiPagamento = rt.getDatiPagamento();
//		TemplateBase.creaElementoListaNomeValore(list, Costanti.LABEL_CAUSALE, causale);
//		TemplateBase.creaElementoListaNomeValore(list, Costanti.LABEL_IMPORTO_PAGATO, String.format("%.2f",datiPagamento.getImportoTotalePagato().doubleValue())+ Costanti.LABEL_EURO));
//		TemplateBase.creaElementoListaNomeValore(list, Costanti.LABEL_CF_PIVA_DEBITORE, rt.getSoggettoPagatore().getIdentificativoUnivocoPagatore().getCodiceIdentificativoUnivoco());
//		TemplateBase.creaElementoListaNomeValore(list, Costanti.LABEL_IUV, datiPagamento.getIdentificativoUnivocoVersamento());
//
//		List<CtDatiSingoloPagamentoRT> datiSingoloPagamento = datiPagamento.getDatiSingoloPagamento();
//		if(datiSingoloPagamento != null && datiSingoloPagamento.size() > 0) {
//			CtDatiSingoloPagamentoRT ctDatiSingoloPagamentoRT = datiSingoloPagamento.get(0);
//
//			Date dataEsitoSingoloPagamento = ctDatiSingoloPagamentoRT.getDataEsitoSingoloPagamento();
//			TemplateBase.creaElementoListaNomeValore(list, Costanti.LABEL_DATA_PAGAMENTO, TemplateBase.sdf_ddMMyyyy.format(dataEsitoSingoloPagamento));
//			TemplateBase.creaElementoListaNomeValore(list, Costanti.LABEL_IUR, ctDatiSingoloPagamentoRT.getIdentificativoUnivocoRiscossione());
//		}
//		String labelIstitutoAttestante = rt.getIstitutoAttestante().getDenominazioneAttestante() + " (C.F. " + rt.getIstitutoAttestante().getIdentificativoUnivocoAttestante().getCodiceIdentificativoUnivoco()+ ")";
//		TemplateBase.creaElementoListaNomeValore(list, Costanti.LABEL_ISTITUTO_ATTESTANTE, labelIstitutoAttestante );
//
//		return cmp.verticalList(
//				cmp.text(label).setStyle(TemplateBase.bold16CenteredStyle).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER),
//				cmp.verticalGap(10),
//				list).setStyle(TemplateBase.centeredStyle);
//	}
}
