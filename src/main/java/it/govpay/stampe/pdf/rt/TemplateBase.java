package it.govpay.stampe.pdf.rt;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.field;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
import static net.sf.dynamicreports.report.builder.DynamicReports.tableOfContentsCustomizer;
import static net.sf.dynamicreports.report.builder.DynamicReports.template;

import java.awt.Color;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.govpay.model.Anagrafica;
import it.govpay.model.Costanti;
import it.govpay.model.Dominio;
import net.sf.dynamicreports.report.base.expression.AbstractSimpleExpression;
import net.sf.dynamicreports.report.base.expression.AbstractValueFormatter;
import net.sf.dynamicreports.report.builder.FieldBuilder;
import net.sf.dynamicreports.report.builder.ReportTemplateBuilder;
import net.sf.dynamicreports.report.builder.column.ColumnBuilder;
import net.sf.dynamicreports.report.builder.column.ComponentColumnBuilder;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.HorizontalListBuilder;
import net.sf.dynamicreports.report.builder.component.SubreportBuilder;
import net.sf.dynamicreports.report.builder.component.TextFieldBuilder;
import net.sf.dynamicreports.report.builder.component.VerticalListBuilder;
import net.sf.dynamicreports.report.builder.datatype.BigDecimalType;
import net.sf.dynamicreports.report.builder.style.FontBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.builder.tableofcontents.TableOfContentsCustomizerBuilder;
import net.sf.dynamicreports.report.constant.HorizontalImageAlignment;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.constant.Markup;
import net.sf.dynamicreports.report.constant.VerticalTextAlignment;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.definition.ReportParameters;

// TODO: Auto-generated Javadoc
/**
 * The Class TemplateBase.
 */
public class TemplateBase {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(TemplateBase.class);
	
	/** The Constant sdf_ddMMyyyy. */
	public static final SimpleDateFormat sdf_ddMMyyyy;

	/** The Constant rootStyle. */
	public static final StyleBuilder rootStyle;
	
	/** The Constant fontStyle8. */
	public static final StyleBuilder fontStyle8;
	
	/** The Constant fontStyle9. */
	public static final StyleBuilder fontStyle9;
	
	/** The Constant fontStyle12. */
	public static final StyleBuilder fontStyle12;
	
	/** The Constant fontStyle16. */
	public static final StyleBuilder fontStyle16;
	
	/** The Constant fontStyle18. */
	public static final StyleBuilder fontStyle18;
	
	/** The Constant fontStyle22. */
	public static final StyleBuilder fontStyle22;
	
	/** The Constant boldStyle. */
	public static final StyleBuilder boldStyle;
	
	/** The Constant boldStyle8. */
	public static final StyleBuilder boldStyle8;
	
	/** The Constant boldStyle9. */
	public static final StyleBuilder boldStyle9;
	
	/** The Constant boldStyle12. */
	public static final StyleBuilder boldStyle12;
	
	/** The Constant boldStyle16. */
	public static final StyleBuilder boldStyle16;
	
	/** The Constant italicStyle. */
	public static final StyleBuilder italicStyle;
	
	/** The Constant italicStyle18. */
	public static final StyleBuilder italicStyle18;
	
	/** The Constant boldCenteredStyle. */
	public static final StyleBuilder boldCenteredStyle;
	
	/** The Constant bold12CenteredStyle. */
	public static final StyleBuilder bold12CenteredStyle;
	
	/** The Constant bold16CenteredStyle. */
	public static final StyleBuilder bold16CenteredStyle;
	
	/** The Constant bold18CenteredStyle. */
	public static final StyleBuilder bold18CenteredStyle;
	
	/** The Constant bold22CenteredStyle. */
	public static final StyleBuilder bold22CenteredStyle;
	
	/** The Constant boldLeftStyle. */
	public static final StyleBuilder boldLeftStyle;
	
	/** The Constant bold12LeftStyle. */
	public static final StyleBuilder bold12LeftStyle;
	
	/** The Constant bold16LeftStyle. */
	public static final StyleBuilder bold16LeftStyle;
	
	/** The Constant bold18LeftStyle. */
	public static final StyleBuilder bold18LeftStyle;
	
	/** The Constant bold22LeftStyle. */
	public static final StyleBuilder bold22LeftStyle;
	
	/** The Constant columnStyle. */
	public static final StyleBuilder columnStyle;
	
	/** The Constant columnBorderStyle. */
	public static final StyleBuilder columnBorderStyle;
	
	/** The Constant columnTitleStyle. */
	public static final StyleBuilder columnTitleStyle;
	
	/** The Constant tableColumnTitleStyle. */
	public static final StyleBuilder tableColumnTitleStyle;
	
	/** The Constant groupStyle. */
	public static final StyleBuilder groupStyle;
	
	/** The Constant subtotalStyle. */
	public static final StyleBuilder subtotalStyle;
	
	/** The Constant centeredStyle. */
	public static final StyleBuilder centeredStyle;

	/** The Constant rootFont. */
	public static final FontBuilder rootFont;

	/** The Constant reportTemplate. */
	public static final ReportTemplateBuilder reportTemplate;
	
	/** The Constant tableTemplate. */
	public static final ReportTemplateBuilder tableTemplate;
	
	/** The Constant currencyType. */
	public static final CurrencyType currencyType;
	
	/** The Constant footerComponent. */
	public static final ComponentBuilder<?, ?> footerComponent;


	static {
		sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");

		rootFont = stl.font().setFontSize(10);
		rootStyle = stl.style().setPadding(2).setFont(rootFont);
		fontStyle8 = stl.style().setFont(rootFont).setFontSize(8);
		fontStyle9 = stl.style().setPadding(1).setFont(rootFont).setFontSize(9);
		fontStyle12 = stl.style(rootStyle).setFontSize(12);
		fontStyle16 = stl.style(rootStyle).setFontSize(16);
		fontStyle18 = stl.style(rootStyle).setFontSize(18);
		fontStyle22 = stl.style(rootStyle).setFontSize(22);
		boldStyle = stl.style(rootStyle).bold();
		boldStyle8 = stl.style(fontStyle8).bold();
		boldStyle9 = stl.style(fontStyle9).bold();
		boldStyle12 = stl.style(fontStyle12).bold();
		boldStyle16 = stl.style(fontStyle16).bold();
		italicStyle = stl.style(rootStyle).italic();
		italicStyle18 = stl.style(fontStyle18).italic();
		centeredStyle   = stl.style(rootStyle).setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE);
		boldCenteredStyle   = stl.style(boldStyle)
				.setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE);
		bold12CenteredStyle = stl.style(boldCenteredStyle)
				.setFontSize(12);
		bold16CenteredStyle = stl.style(boldCenteredStyle)
				.setFontSize(16);
		bold18CenteredStyle = stl.style(boldCenteredStyle)
				.setFontSize(18);
		bold22CenteredStyle = stl.style(boldCenteredStyle)
				.setFontSize(22);
		boldLeftStyle = stl.style(boldStyle)
				.setTextAlignment(HorizontalTextAlignment.CENTER, VerticalTextAlignment.MIDDLE);
		bold12LeftStyle = stl.style(boldLeftStyle)
				.setFontSize(12);
		bold16LeftStyle = stl.style(boldLeftStyle)
				.setFontSize(16);
		bold18LeftStyle = stl.style(boldLeftStyle)
				.setFontSize(18);
		bold22LeftStyle = stl.style(boldLeftStyle)
				.setFontSize(20);
		columnStyle = stl.style(fontStyle9).setVerticalTextAlignment(VerticalTextAlignment.MIDDLE);
		columnBorderStyle = stl.style(fontStyle9).setVerticalTextAlignment(VerticalTextAlignment.MIDDLE).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT).setBorder(stl.pen1Point());
		columnTitleStyle = stl.style(rootStyle)
				.setBorder(stl.pen1Point())
				.setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)
				.setBackgroundColor(Color.LIGHT_GRAY)
				.bold();
		groupStyle= stl.style(boldStyle)
				.setHorizontalTextAlignment(HorizontalTextAlignment.LEFT);
		subtotalStyle       = stl.style(boldStyle)
				.setTopBorder(stl.pen1Point());

		tableColumnTitleStyle= stl.style(rootStyle)
				.setBorder(stl.pen1Point()).setLeftPadding(2)
				.setHorizontalTextAlignment(HorizontalTextAlignment.LEFT)
				.setBackgroundColor(Color.LIGHT_GRAY)
				.bold();

		StyleBuilder crosstabGroupStyle      = stl.style(columnTitleStyle);
		StyleBuilder crosstabGroupTotalStyle = stl.style(columnTitleStyle)
				.setBackgroundColor(new Color(170, 170, 170));
		StyleBuilder crosstabGrandTotalStyle = stl.style(columnTitleStyle)
				.setBackgroundColor(new Color(140, 140, 140));
		StyleBuilder crosstabCellStyle       = stl.style(columnStyle)
				.setBorder(stl.pen1Point());

		TableOfContentsCustomizerBuilder tableOfContentsCustomizer = tableOfContentsCustomizer()
				.setHeadingStyle(0, stl.style(rootStyle).bold());

		reportTemplate = template()
				.setLocale(Locale.ITALIAN)
				.setColumnStyle(columnStyle)
				.setColumnTitleStyle(columnTitleStyle)
				.setGroupStyle(groupStyle)
				.setGroupTitleStyle(groupStyle)
				.setSubtotalStyle(subtotalStyle)
				.highlightDetailEvenRows()
				.crosstabHighlightEvenRows()
				.setCrosstabGroupStyle(crosstabGroupStyle)
				.setCrosstabGroupTotalStyle(crosstabGroupTotalStyle)
				.setCrosstabGrandTotalStyle(crosstabGrandTotalStyle)
				.setCrosstabCellStyle(crosstabCellStyle)
				.setTableOfContentsCustomizer(tableOfContentsCustomizer);

		tableTemplate = template()
				.setLocale(Locale.ITALIAN)
				.setColumnStyle(columnStyle)
				.setColumnTitleStyle(tableColumnTitleStyle)
				.setHighlightDetailEvenRows(false)
				.setCrosstabHighlightEvenRows(false);

		currencyType = new CurrencyType();

		footerComponent = cmp.pageXofY()
				.setStyle(
						stl.style(boldCenteredStyle)
						.setTopBorder(stl.pen1Point()));
	}

	/**
	 * Creates the currency value formatter.
	 *
	 * @param label the label
	 * @return the currency value formatter
	 */
	public static CurrencyValueFormatter createCurrencyValueFormatter(String label) {
		return new CurrencyValueFormatter(label);
	}

	/**
	 * The Class CurrencyType.
	 */
	public static class CurrencyType extends BigDecimalType {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;

		@Override
		public String getPattern() {
			return Costanti.LABEL_EURO + " #,###.00";
		}
	}

	/**
	 * The Class CurrencyValueFormatter.
	 */
	private static class CurrencyValueFormatter extends AbstractValueFormatter<String, Number> {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;

		/** The label. */
		private String label;

		/**
		 * Instantiates a new currency value formatter.
		 *
		 * @param label the label
		 */
		public CurrencyValueFormatter(String label) {
			this.label = label;
		}

		@Override
		public String format(Number value, ReportParameters reportParameters) {
			return this.label + currencyType.valueToString(value, reportParameters.getLocale());
		}
	}

	/**
	 * Adds the elemento lista.
	 *
	 * @param list the list
	 * @param label the label
	 * @param value the value
	 * @param newRow the new row
	 * @param bold the bold
	 * @param dots the dots
	 */
	public static void addElementoLista(HorizontalListBuilder list, String label, String value, boolean newRow, boolean bold, boolean dots) {
		if (value != null) {
			String v = value;

			if(label != null) { //.setFixedColumns(8)
				String labelDots = (label.length() > 0 && dots) ? (label + Costanti.LABEL_DUE_PUNTI) : label;
				v = "<b>" + labelDots + "</b> " + value;
			} 

			TextFieldBuilder<String> text = cmp.text(v).setMarkup(Markup.STYLED).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT);

			if(bold)
				text.setStyle(TemplateBase.boldStyle);

			if(newRow)
				list.add(text).newRow();
			else
				list.add(text);

		}
	}

	/**
	 * Adds the elemento lista.
	 *
	 * @param list the list
	 * @param label the label
	 * @param value the value
	 * @param newRow the new row
	 * @param bold the bold
	 * @param dots the dots
	 */
	public static void addElementoLista(HorizontalListBuilder list, String label, AbstractSimpleExpression<String> value, boolean newRow, boolean bold, boolean dots) {
		if (value != null) {

			TextFieldBuilder<String> text = cmp.text(value).setMarkup(Markup.STYLED).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT);

			if(bold)
				text.setStyle(TemplateBase.boldStyle);

			if(newRow)
				list.add(text).newRow();
			else
				list.add(text);
		}
	}

	/**
	 * Crea elemento lista nome valore.
	 *
	 * @param list the list
	 * @param label the label
	 * @param value the value
	 */
	public static void creaElementoListaNomeValore(HorizontalListBuilder list, String label, String value) {
		if (value != null) {
			list.add(cmp.text(label + ":").setFixedColumns(20).setStyle(TemplateBase.boldStyle), cmp.text(value)).newRow();
		}
	}

	/**
	 * Adds the elemento contenuto statico lista.
	 *
	 * @param list the list
	 * @param value the value
	 * @param newRow the new row
	 * @param bold the bold
	 * @param align the align
	 */
	public static void addElementoContenutoStaticoLista(HorizontalListBuilder list, String value, boolean newRow, boolean bold,HorizontalTextAlignment align) {
		if (value != null) {
			String v = value;

			TextFieldBuilder<String> text = cmp.text(v).setMarkup(Markup.HTML).setHorizontalTextAlignment(align);

			if(bold)
				text.setStyle(TemplateBase.boldStyle);

			if(newRow)
				list.add(text).newRow();
			else
				list.add(text);

		}
	}

	/**
	 * Creates custom component which is possible to add to any report band component.
	 *
	 * @param dominio the dominio
	 * @param anagrafica the anagrafica
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createDatiDominio(Dominio dominio, Anagrafica anagrafica) {
		try{
			HorizontalTextAlignment horizontalTextAlignment = HorizontalTextAlignment.CENTER;
			HorizontalImageAlignment horizontalImageAlignment = HorizontalImageAlignment.CENTER;
			StyleBuilder style = stl.style(TemplateBase.fontStyle12); 
			StyleBuilder headerStyle = stl.style(TemplateBase.bold18LeftStyle); 
			
			VerticalListBuilder listDominio = cmp.verticalList().setStyle(style.setLeftPadding(10)
					.setHorizontalTextAlignment(horizontalTextAlignment).setHorizontalImageAlignment(horizontalImageAlignment)); 
			
			return createDatiDominio(dominio, anagrafica, listDominio,horizontalTextAlignment,headerStyle, style);
		}catch(Exception e){
			log.error(e.getMessage(),e);
		}
		return null;
	}
	
	/**
	 * Creates custom component which is possible to add to any report band component.
	 *
	 * @param dominio the dominio
	 * @param anagrafica the anagrafica
	 * @param horizontalTextAlignment the horizontal text alignment
	 * @param verticalTextAlignment the vertical text alignment
	 * @param headerStyle the header style
	 * @param style the style
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createDatiDominio(Dominio dominio, Anagrafica anagrafica, HorizontalTextAlignment horizontalTextAlignment,VerticalTextAlignment verticalTextAlignment,
			StyleBuilder headerStyle, StyleBuilder style ) {
		try{
			VerticalListBuilder listDominio = cmp.verticalList().setStyle(style.setLeftPadding(10)
					.setHorizontalTextAlignment(horizontalTextAlignment).setVerticalTextAlignment(verticalTextAlignment));  
			
			return createDatiDominio(dominio, anagrafica, listDominio,horizontalTextAlignment,headerStyle, style);
		}catch(Exception e){
			log.error(e.getMessage(),e);
		}
		return null;
	}
	
	/**
	 * Creates custom component which is possible to add to any report band component.
	 *
	 * @param dominio the dominio
	 * @param anagrafica the anagrafica
	 * @param listDominio the list dominio
	 * @param horizontalTextAlignment the horizontal text alignment
	 * @param headerStyle the header style
	 * @param style the style
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createDatiDominio(Dominio dominio, Anagrafica anagrafica,VerticalListBuilder listDominio,
			HorizontalTextAlignment horizontalTextAlignment, StyleBuilder headerStyle, StyleBuilder style) {
		try{
			

			String denominazioneDominio = dominio.getRagioneSociale();
			String pIvaDominio = MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE, Costanti.LABEL_P_IVA, dominio.getCodDominio());

			String indirizzoCivico = null,capCitta =null;

			if(anagrafica != null) {
				String indirizzo = StringUtils.isNotEmpty(anagrafica.getIndirizzo()) ? anagrafica.getIndirizzo() : "";
				String civico = StringUtils.isNotEmpty(anagrafica.getCivico()) ? anagrafica.getCivico() : "";
				String cap = StringUtils.isNotEmpty(anagrafica.getCap()) ? anagrafica.getCap() : "";
				String localita = StringUtils.isNotEmpty(anagrafica.getLocalita()) ? anagrafica.getLocalita() : "";
				String provincia = StringUtils.isNotEmpty(anagrafica.getProvincia()) ? (" (" +anagrafica.getProvincia() +")" ) : "";
				indirizzoCivico = indirizzo + " " + civico;
				capCitta = cap + " " + localita + provincia      ;
			}

			listDominio.add(cmp.text(denominazioneDominio).setStyle(headerStyle).setHorizontalTextAlignment(horizontalTextAlignment));//.newRow();
			listDominio.add(cmp.text(pIvaDominio).setStyle(style).setHorizontalTextAlignment(horizontalTextAlignment));
			if(StringUtils.isNotEmpty(indirizzoCivico))
				listDominio.add(cmp.text(indirizzoCivico).setStyle(style).setHorizontalTextAlignment(horizontalTextAlignment));
			if(StringUtils.isNotEmpty(capCitta))
				listDominio.add(cmp.text(capCitta).setStyle(style).setHorizontalTextAlignment(horizontalTextAlignment));

			return listDominio;
		}catch(Exception e){
			log.error(e.getMessage(),e);
		}
		return null;
	}

	/**
	 * Creates custom component which is possible to add to any report band component.
	 *
	 * @param anagrafica the anagrafica
	 * @param includeCF the include CF
	 * @param bold the bold
	 * @param fontstyleBase the fontstyle base
	 * @param horizontalTextAlignment the horizontal text alignment
	 * @return the component builder
	 */
	public static ComponentBuilder<?, ?> createDatiDebitore(Anagrafica anagrafica, boolean includeCF, boolean bold, 
			StyleBuilder fontstyleBase , HorizontalTextAlignment horizontalTextAlignment) {
		try{
			VerticalListBuilder listDebitore = cmp.verticalList().setStyle(stl.style(fontstyleBase).setLeftPadding(10)
					.setHorizontalTextAlignment(horizontalTextAlignment).setVerticalTextAlignment(VerticalTextAlignment.TOP)); 

			createDatiDebitore(listDebitore, anagrafica, includeCF, bold, fontstyleBase, horizontalTextAlignment); 

			return listDebitore;
		}catch(Exception e){
			log.error(e.getMessage(),e);
		}
		return null;
	}

	/**
	 * Creates custom component which is possible to add to any report band component.
	 *
	 * @param listDebitore the list debitore
	 * @param anagrafica the anagrafica
	 * @param includeCF the include CF
	 * @param bold the bold
	 * @param fontstyleBase the fontstyle base
	 * @param horizontalTextAlignment the horizontal text alignment
	 */
	public static void createDatiDebitore(VerticalListBuilder listDebitore, Anagrafica anagrafica, boolean includeCF, 
			boolean bold, StyleBuilder fontstyleBase , HorizontalTextAlignment horizontalTextAlignment) {
		try{
			String denominazioneDebitore = anagrafica.getRagioneSociale();
			String cfDebitore = anagrafica.getCodUnivoco() ; //MessageFormat.format(Costanti.PATTERN_NOME_DUE_PUNTI_VALORE, Costanti.LABEL_P_IVA, anagrafica.getCodUnivoco());

			StyleBuilder headerStyle = bold ? TemplateBase.boldStyle12 : fontstyleBase;
			listDebitore.add(cmp.text(denominazioneDebitore.toUpperCase()).setStyle(headerStyle).setHorizontalTextAlignment(horizontalTextAlignment));//.newRow();
			if(includeCF)
				listDebitore.add(cmp.text(cfDebitore.toUpperCase()).setStyle(headerStyle).setHorizontalTextAlignment(horizontalTextAlignment));

			String indirizzo = StringUtils.isNotEmpty(anagrafica.getIndirizzo()) ? anagrafica.getIndirizzo() : "";
			String[] indirizzoSplit = indirizzo.split("\\|");
			if(indirizzoSplit != null && indirizzoSplit.length > 0){
				for (int i = 0; i < indirizzoSplit.length; i++) {
					String indirizzoI = indirizzoSplit[i];
					if(StringUtils.isNotEmpty(indirizzoI))
						listDebitore.add(cmp.text(indirizzoI.toUpperCase()).setStyle(fontstyleBase).setHorizontalTextAlignment(horizontalTextAlignment));
				}
			}
		}catch(Exception e){
			log.error(e.getMessage(),e);
		}
	}

	/**
	 * Gets the tabella.
	 *
	 * @param title the title
	 * @param values the values
	 * @param errList the err list
	 * @param width the width
	 * @param columnStyle the column style
	 * @param horizontalTextAlignment the horizontal text alignment
	 * @return the tabella
	 */
	public static SubreportBuilder getTabella(String title, List<String> values, List<String> errList,Integer width,
			StyleBuilder columnStyle, HorizontalTextAlignment horizontalTextAlignment) {
		String sezione = "Tabella titolo["+title+"]";
		try{
			boolean showColumnTitle = StringUtils.isNotEmpty(title);
			// Scittura Intestazione
			List<ColumnBuilder<?, ?>> colonne = new ArrayList<ColumnBuilder<?, ?>>();

			TextFieldBuilder<String> componentText = cmp.text(new TemplateBase().new ColonnaUnoExpression())
					.setMarkup(Markup.HTML).setStyle(columnStyle).setHorizontalTextAlignment(horizontalTextAlignment); 

			ComponentColumnBuilder columnOne = col.componentColumn(title, componentText).setWidth(width);

			colonne.add(columnOne);

			List<FieldBuilder<String>> fields = new ArrayList<FieldBuilder<String>>();

			fields.add(field(Costanti.COL_UNO, String.class));

			List<String> header = new ArrayList<String>();
			header.add(Costanti.COL_UNO);

			DRDataSource dataSource = new DRDataSource(header.toArray(new String[header.size()]));
			for (String value : values) {
				List<String> oneLine = new ArrayList<String>();
				oneLine.add(value);
				dataSource.add(oneLine.toArray(new Object[oneLine.size()]));	
			}

			return cmp.subreport(
					report().setShowColumnTitle(showColumnTitle)
					.setTemplate(TemplateBase.tableTemplate)
					.fields(fields.toArray(new FieldBuilder[fields.size()])) 
					.columns(colonne.toArray(new ColumnBuilder[colonne.size()]))
					.setDataSource(dataSource));

		}catch(RuntimeException e){
			log.error("Impossibile completare la costruzione della " + sezione +": "+ e.getMessage(),e);
			errList.add(0,"Impossibile completare la costruzione della " + sezione +": "+ e.getMessage());
		}
		return null;
	}

	/**
	 * The Class ColonnaUnoExpression.
	 */
	public class ColonnaUnoExpression extends AbstractSimpleExpression<String> {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;
		@Override
		public String evaluate(ReportParameters reportParameters) {
			return reportParameters.getValue(Costanti.COL_UNO);
		}
	}
}
