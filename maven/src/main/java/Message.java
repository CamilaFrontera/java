import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Message {

	final static Logger logger =  LogManager.getLogger(Message.class);
	
	public void logError(String parameter) {
		logger.error("Error en el programa " + parameter);
		
		
	}
	
	public void logInfo(String pais) {
		
		logger.info("El país ingresado es:  " + pais);
		
	}
	
}
