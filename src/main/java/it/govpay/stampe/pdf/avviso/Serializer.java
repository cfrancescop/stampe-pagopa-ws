package it.govpay.stampe.pdf.avviso;

import java.io.FileNotFoundException;
import java.io.OutputStream;

import javax.xml.bind.JAXBException;

import org.openspcoop2.utils.xml.JaxbUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class Serializer.
 */
abstract class Serializer {
	
	/**
	 * Write to.
	 *
	 * @param out the out
	 * @param type the type
	 * @throws SerializationException the serialization exception
	 */
	public void writeTo(OutputStream out,WriteToSerializerType type) throws SerializationException {
		try {
			switch (type) {
				
				case JAXB:
				
					JaxbUtils.objToXml(out, getClass(), this, true);
				
					break;
				
			}
		} catch (FileNotFoundException | JAXBException e) {
			throw new SerializationException(e);
		}
		
	}
}
