package it.govpay.stampe.pdf.rt;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.govpay.stampe.pdf.rt.RicevutaPagamentoProperties;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating RicevutaPagamento objects.
 */
public class RicevutaPagamentoFactory {
	
	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(RicevutaPagamentoFactory.class);
	
	/**
	 * Gets the ricevuta pagamento builder.
	 *
	 * @param ricevutaPagamentoImplClass the ricevuta pagamento impl class
	 * @return the ricevuta pagamento builder
	 * @throws NoImplentationException the no implentation exception
	 */
	public static IRicevutaPagamento getRicevutaPagamentoBuilder(String ricevutaPagamentoImplClass) throws NoImplentationException {

		IRicevutaPagamento instance = null;
		try{

			if(ricevutaPagamentoImplClass == null) {
				ricevutaPagamentoImplClass = RicevutaPagamentoProperties.getInstance().getDefaultImplClassName();
			}

			Class<?> ricevutaPagamentoClass = Class.forName(ricevutaPagamentoImplClass);

			Object ricevutaPagamentoClassObjectImpl = ricevutaPagamentoClass.newInstance();

			if(!(ricevutaPagamentoClassObjectImpl instanceof IRicevutaPagamento)) {
				throw new NoImplentationException("La classe ["+ricevutaPagamentoImplClass+"] dovrebbe implementare l'interfaccia " + IRicevutaPagamento.class);
			}

			instance = (IRicevutaPagamento) ricevutaPagamentoClassObjectImpl;

		}catch(RuntimeException | ClassNotFoundException | InstantiationException | IllegalAccessException | NoPropertyException e){
			log.error("Errore durante l'instance della classe ["+ricevutaPagamentoImplClass+"]: "+ e.getMessage()); 
			throw new NoImplentationException(e);
		}
		return instance;
	}
	
}
