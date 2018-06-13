package it.govpay.stampe.pdf.avviso;

// TODO: Auto-generated Javadoc
/**
 * The Class AvvisoPagamentoCostanti.
 */
public class AvvisoPagamentoCostanti {
	
	/** The Constant AVVISO_PAGAMENTO_ROOT_ELEMENT_NAME. */
	// root element elemento di input
	public static final String AVVISO_PAGAMENTO_ROOT_ELEMENT_NAME= "input";
	
	/** The Constant LOGO_ENTE. */
	// nomi properties loghi
	public static final String LOGO_ENTE = "avvisoPagamento.logo.ente";
	
	/** The Constant LOGO_AGID. */
	public static final String LOGO_AGID = "avvisoPagamento.logo.agid";
	
	/** The Constant LOGO_PAGOPA. */
	public static final String LOGO_PAGOPA = "avvisoPagamento.logo.pagopa";
	
	/** The Constant LOGO_PAGOPA_90. */
	public static final String LOGO_PAGOPA_90 = "avvisoPagamento.logo.pagopa90";
	
	/** The Constant LOGO_APP. */
	public static final String LOGO_APP = "avvisoPagamento.logo.app";
	
	/** The Constant LOGO_PLACE. */
	public static final String LOGO_PLACE = "avvisoPagamento.logo.place";
	
	/** The Constant LOGO_IMPORTO. */
	public static final String LOGO_IMPORTO = "avvisoPagamento.logo.importo";
	
	/** The Constant LOGO_SCADENZA. */
	public static final String LOGO_SCADENZA = "avvisoPagamento.logo.scadenza";
	
	/** The Constant LOGO_TAGLIO. */
	public static final String LOGO_TAGLIO = "avvisoPagamento.logo.taglio";
	
	/** The Constant LOGO_TAGLIO1. */
	public static final String LOGO_TAGLIO1 = "avvisoPagamento.logo.taglio1";
	
	/** The Constant PREFIX_LOGO. */
	public static final String PREFIX_LOGO = "avvisoPagamento.logo";
	
	/** The Constant AVVISO_PAGAMENTO_TEMPLATE_JASPER. */
	public static final String AVVISO_PAGAMENTO_TEMPLATE_JASPER = "avvisoPagamento.risorse.template";
	
	/** The Constant SEZIONE_DOVUTO_KEY. */
	// chiavi contenuto statico
	public static final String SEZIONE_DOVUTO_KEY = "sezioneDovuto";
	
	/** The Constant SEZIONE_DISPONIBILITA_KEY. */
	public static final String SEZIONE_DISPONIBILITA_KEY = "sezioneDisponibilita";
	
	/** The Constant SEZIONE_COMUNICAZIONI_KEY. */
	public static final String SEZIONE_COMUNICAZIONI_KEY = "sezioneComunicazioni";
	
	/** The Constant SEZIONE_PAGOPA_KEY. */
	public static final String SEZIONE_PAGOPA_KEY = "sezionePagoPA";
	
	/** The Constant SEZIONE_STATICA_KEYS. */
	public static final String[] SEZIONE_STATICA_KEYS  = {
			SEZIONE_DOVUTO_KEY,	SEZIONE_DISPONIBILITA_KEY,SEZIONE_COMUNICAZIONI_KEY,SEZIONE_PAGOPA_KEY
	};
	
	/** The Constant ENTE_CREDITORE_KEY. */
	public static final String ENTE_CREDITORE_KEY = "$ENTE_CREDITORE$";
	
	/** The Constant URL_ENTE_CREDITORE_KEY. */
	public static final String URL_ENTE_CREDITORE_KEY = "$URL_ENTE_CREDITORE$";
}
