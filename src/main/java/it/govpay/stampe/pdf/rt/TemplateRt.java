package it.govpay.stampe.pdf.rt;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.govpay.model.Costanti;
import it.govpay.model.RicevutaPagamento;
import it.govpay.stampe.pdf.avviso.AvvisoPagamentoProperties;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.HorizontalListBuilder;
import net.sf.dynamicreports.report.builder.component.VerticalListBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalImageAlignment;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.constant.VerticalTextAlignment;

// TODO: Auto-generated Javadoc
/**
 * The Class TemplateRt.
 */
public class TemplateRt {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(TemplateRt.class);
	
	/**
	 * TITOLO
	 * 
	 * TITOLO RICEVUTA sx Logo PAGOPA dx.
	 *
	 * @param ricevuta the ricevuta
	 * @param errList the err list
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createTitleComponent(RicevutaPagamento ricevuta,  List<String> errList){
		String sezione = "Sezione Titolo";
		try{
			List<ComponentBuilder<?, ?>> lst = new ArrayList<ComponentBuilder<?,?>>();
			
			InputStream resourceLogoPagoPa = TemplateRt.class.getResourceAsStream("/pagopa_logo.png");
			StyleBuilder headerStyle = stl.style(TemplateBase.bold18LeftStyle); 
			
			if(ricevuta.getCodDominio()!=null ){
				lst.add(cmp.image(AvvisoPagamentoProperties.getImmagineEnte(ricevuta.getCodDominio())).setFixedDimension(90, 90).setHorizontalImageAlignment(HorizontalImageAlignment.LEFT)); 
			}else if(ricevuta.getDominioCreditore() != null && ricevuta.getDominioCreditore().getCodDominio() != null){
				lst.add(cmp.image(AvvisoPagamentoProperties.getImmagineEnte(ricevuta.getDominioCreditore().getCodDominio())).setFixedDimension(90, 90).setHorizontalImageAlignment(HorizontalImageAlignment.LEFT)); 
			}else{
				lst.add(cmp.text("   ").setFixedDimension(90, 90).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT).setStyle(headerStyle.setLeftPadding(10)));
			}

			HorizontalTextAlignment horizontalTextAlignment = HorizontalTextAlignment.CENTER;

			lst.add(cmp.text(Costanti.LABEL_RICEVUTA_PAGAMENTO).setHorizontalTextAlignment(horizontalTextAlignment).setStyle(headerStyle)); 
			lst.add(cmp.image(resourceLogoPagoPa).setFixedDimension(90, 90).setHorizontalImageAlignment(HorizontalImageAlignment.RIGHT));

			return cmp.horizontalList(lst.toArray(new ComponentBuilder[lst.size()])).newRow().add(cmp.verticalGap(20)).newRow();

		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}

	/**
	 * sx vuoto, dx dati debitore.
	 *
	 * @param ricevuta the ricevuta
	 * @param errList the err list
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createSezioneCreditore(RicevutaPagamento ricevuta,  List<String> errList){
		String sezione = "Sezione Creditore";
		try{
			HorizontalListBuilder listRiepilogo = cmp.horizontalList().setBaseStyle(stl.style(TemplateBase.fontStyle12).setLeftPadding(10).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT)); 
			// Debitore:
			if(ricevuta.getAnagraficaDebitore() != null){
				StringBuffer sb = new StringBuffer();
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaDebitore().getRagioneSociale()))
					sb.append(ricevuta.getAnagraficaDebitore().getRagioneSociale());
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaDebitore().getCodUnivoco())){
					if(sb.length() > 0)
						sb.append(" (").append(ricevuta.getAnagraficaDebitore().getCodUnivoco()).append(")");
					else 
						sb.append(ricevuta.getAnagraficaDebitore().getCodUnivoco());
				}

				TemplateBase.addElementoLista(listRiepilogo, Costanti.LABEL_DEBITORE, sb.toString(), true, false, true);
			}
			// Creditore:
			if(ricevuta.getAnagraficaCreditore() != null){
				StringBuffer sb = new StringBuffer();
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaCreditore().getRagioneSociale()))
					sb.append(ricevuta.getAnagraficaCreditore().getRagioneSociale());
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaCreditore().getCodUnivoco())){
					if(sb.length() > 0)
						sb.append(" (").append(ricevuta.getAnagraficaCreditore().getCodUnivoco()).append(")");
					else 
						sb.append(ricevuta.getAnagraficaCreditore().getCodUnivoco());
				}

				TemplateBase.addElementoLista(listRiepilogo, Costanti.LABEL_CREDITORE, sb.toString(), true, false, true);
			}
			// Attestante:
			if(ricevuta.getAnagraficaAttestante() != null){
				StringBuffer sb = new StringBuffer();
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaAttestante().getRagioneSociale()))
					sb.append(ricevuta.getAnagraficaAttestante().getRagioneSociale());
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaAttestante().getCodUnivoco())){
					if(sb.length() > 0)
						sb.append(" (").append(ricevuta.getAnagraficaAttestante().getCodUnivoco()).append(")");
					else 
						sb.append(ricevuta.getAnagraficaAttestante().getCodUnivoco());
				}

				TemplateBase.addElementoLista(listRiepilogo, Costanti.LABEL_ATTESTANTE, sb.toString(), true, false, true);
			}
			// Versante: 
			if(ricevuta.getAnagraficaVersante() != null){
				StringBuffer sb = new StringBuffer();
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaVersante().getRagioneSociale()))
					sb.append(ricevuta.getAnagraficaVersante().getRagioneSociale());
				if(StringUtils.isNotEmpty(ricevuta.getAnagraficaVersante().getCodUnivoco())){
					if(sb.length() > 0)
						sb.append(" (").append(ricevuta.getAnagraficaVersante().getCodUnivoco()).append(")");
					else 
						sb.append(ricevuta.getAnagraficaVersante().getCodUnivoco());
				}

				TemplateBase.addElementoLista(listRiepilogo, Costanti.LABEL_VERSANTE, sb.toString(), true, false, true);
			}
			
			if(ricevuta.getEsito() != null){
				
				TemplateBase.addElementoLista(listRiepilogo, "Esito", ricevuta.getEsito(), true, false, true);
			}

			return listRiepilogo.newRow().add(cmp.verticalGap(20)).newRow()
					;

		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}

	/**
	 * sx vuoto, dx dati debitore.
	 *
	 * @param ricevuta the ricevuta
	 * @param errList the err list
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createSezioneDebitore(RicevutaPagamento ricevuta,  List<String> errList){
		String sezione = "Sezione Debitore";
		try{
			List<ComponentBuilder<?, ?>> lst = new ArrayList<ComponentBuilder<?,?>>();
			lst.add(cmp.text(" "));
			lst.add(TemplateBase.createDatiDebitore(ricevuta.getAnagraficaDebitore(), false, false, 
					stl.style(TemplateBase.rootStyle).setPadding(0), HorizontalTextAlignment.LEFT ));

			return cmp.horizontalList(lst.toArray(new ComponentBuilder[lst.size()])).newRow().add(cmp.verticalGap(20)).newRow()
					;

		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}

	/**
	 * *
	 * Elenco delle informazioni sul titolo avviso:
	 * 
	 * 1 Avviso di pagamento N ...
	 *
	 * @param ricevuta the ricevuta
	 * @param errList the err list
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createSezioneTitoloRicevuta(RicevutaPagamento ricevuta,  List<String> errList){
		String sezione = "Sezione Titolo Ricevuta";
		try{
			HorizontalListBuilder list = cmp.horizontalList().setBaseStyle(stl.style(TemplateBase.fontStyle16)
					.setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE));
			String label = MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_RICEVUTA_PAGAMENTO_UPPER_CASE, ricevuta.getCodAvviso());
			list.add(cmp.verticalGap(70));
			list.add(cmp.text(label ).setStyle(TemplateBase.bold16CenteredStyle));
			list.add(cmp.verticalGap(50));
			list.newRow();

			return list;

		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}

	/**
	 * sx causale, dx importi.
	 *
	 * @param ricevuta the ricevuta
	 * @param errList the err list
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createSezionePagamento(RicevutaPagamento ricevuta,  List<String> errList){
		String sezione = "Sezione Pagamento";
		try{
			//			VerticalTextAlignment verticalTextAlignment = VerticalTextAlignment.TOP;
			//			StyleBuilder style = stl.style(TemplateBase.rootFont).setVerticalTextAlignment(verticalTextAlignment);;  
			return cmp.horizontalList().add(
					cmp.hListCell(createSezioneCausale(ricevuta, errList)).heightFixedOnTop(),
					cmp.hListCell(createSezioneImporti(ricevuta, errList)).heightFixedOnTop()				
					);//.setStyle(style);
		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}

	/**
	 * linea 1: causale
	 * linea 2: debitore.
	 *
	 * @param ricevuta the ricevuta
	 * @param errList the err list
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createSezioneCausale(RicevutaPagamento ricevuta, List<String> errList){
		String sezione = "Sezione Causale";
		try{
			HorizontalTextAlignment horizontalTextAlignment = HorizontalTextAlignment.LEFT;
			StyleBuilder style = stl.style(TemplateBase.rootStyle).setPadding(0).setHorizontalTextAlignment(horizontalTextAlignment).setVerticalTextAlignment(VerticalTextAlignment.TOP);
			VerticalListBuilder verticalList = cmp.verticalList().setStyle(style);

			verticalList.add(cmp.verticalGap(20));
			verticalList.add(cmp.text(ricevuta.getCausale()).setStyle(style).setHorizontalTextAlignment(horizontalTextAlignment));
			verticalList.add(cmp.text(Costanti.LABEL_INTESTATO_A).setStyle(style).setHorizontalTextAlignment(horizontalTextAlignment));
			TemplateBase.createDatiDebitore(verticalList,ricevuta.getAnagraficaDebitore(), true, false, style, 
					horizontalTextAlignment );
			verticalList.add(cmp.verticalGap(20));

			return verticalList; 

		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}



	/**
	 * linea 1: tabella importo
	 * linea 2: tabella scadenza
	 * linea 3: tabella riferimenti.
	 *
	 * @param ricevuta the ricevuta
	 * @param errList the err list
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createSezioneImporti(RicevutaPagamento ricevuta,  List<String> errList){
		String sezione = "Sezione Importi";
		try{
			StyleBuilder style = stl.style(TemplateBase.rootStyle).setPadding(0).setLeftPadding(10); 
			HorizontalTextAlignment horizontalTextAlignment = HorizontalTextAlignment.LEFT;
			VerticalListBuilder verticalList = cmp.verticalList().setStyle(stl.style(style)
					.setHorizontalTextAlignment(horizontalTextAlignment).setVerticalTextAlignment(VerticalTextAlignment.TOP)); 

			StyleBuilder columnStyle = stl.style(TemplateBase.columnBorderStyle).setLeftPadding(5).setRightPadding(0).setTopPadding(5).setBottomPadding(5);

			List<String> values = new ArrayList<String>();
			StringBuilder sb = new StringBuilder();
			boolean addBreak = false;
			if(ricevuta.getImportoDovuto() != null) {
				String importoDovutoAsString = Costanti.LABEL_EURO + String.format("%.2f",ricevuta.getImportoDovuto().doubleValue());
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_IMPORTO_DOVUTO, importoDovutoAsString));
				addBreak = true;
			}

			if(ricevuta.getDataScadenza() != null){
				if(addBreak)
					sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_DATA_SCADENZA, TemplateBase.sdf_ddMMyyyy.format(ricevuta.getDataScadenza())));
				addBreak = true;
			}
			
			if(addBreak) 
				sb.append("<br/>");
			if(ricevuta.getImportoPagato()!=null) {
				String importoPagatoAsString = Costanti.LABEL_EURO+ ricevuta.getImportoPagato().setScale(2).toString(); 
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_IMPORTO_PAGATO, importoPagatoAsString));
			}
			if(ricevuta.getCommissioni() != null){
				String commissioniAsString = Costanti.LABEL_EURO+ String.format("%.2f",ricevuta.getCommissioni().doubleValue()); 
				sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_COMMISSIONI_PSP, commissioniAsString));
			}
			if(ricevuta.getDataPagamento() != null){
				sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_DATA_PAGAMENTO, TemplateBase.sdf_ddMMyyyy.format(ricevuta.getDataPagamento())));
			}
			if(StringUtils.isNotEmpty(ricevuta.getIuv())){
				sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_IUV, ricevuta.getIuv()));
			}
			
			if(StringUtils.isNotEmpty(ricevuta.getCcp())){
				sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_CCP, ricevuta.getCcp()));
			}
			
			if(StringUtils.isNotEmpty(ricevuta.getIdRiscossione())){
				sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_ID_RISCOSSIONE, ricevuta.getIdRiscossione()));
			}
			//			sb.append("<br/>");
			//			sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_PSP, ricevuta.getPsp()));
			if(StringUtils.isNotEmpty(ricevuta.getCausale())){
				sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_CAUSALE_BONIFICIO, ricevuta.getCausale()));
			}
			if(StringUtils.isNotEmpty(ricevuta.getDescrizioneCausale())){
				sb.append("<br/>");
				sb.append(MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE,Costanti.LABEL_CAUSALE_VERSAMENTO, ricevuta.getDescrizioneCausale()));
			}

			values.add(sb.toString());
			verticalList.add(TemplateBase.getTabella(Costanti.LABEL_ESTREMI_DI_PAGAMENTO,values, errList,150, 
					columnStyle,horizontalTextAlignment));

			return verticalList; //.setFixedWidth(200);//.setFixedHeight(90)	; 

		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}
}
