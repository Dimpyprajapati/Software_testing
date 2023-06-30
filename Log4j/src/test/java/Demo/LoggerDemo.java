package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		Logger log = LogManager.getLogger("LoggerDemo");
		System.out.println("This is logger Demo");
		
		log.info("for info only");
		log.fatal("Fatal msg");
		log.debug("For debug");
		log.error("Error message");
		log.warn("Warning message");
		
	}
}
