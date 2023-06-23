package Log4jdemo;

import java.util.logging.LogManager;

import org.testng.log4testng.Logger;

public class LogTestDemo {
	private static final Logger log = LogManager.getlogger(LogTestDemo.class);
	public static void main(String[] args) {
		log.error("err log");
		log.fatal("fatal error msg");
		log.debug("debug complete");
		log.info("info msg");
	}

}
