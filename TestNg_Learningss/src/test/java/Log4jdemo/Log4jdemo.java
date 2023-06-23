package Log4jdemo;

import java.util.logging.LogManager;

import org.testng.log4testng.Logger;

public class Log4jdemo {
	public static final Logger log = LogManager.getLogger(Log4jdemo.class);
	public static void main(String[] args) {
		log.error("err log");
		log.fatal("fatal error msg");
		log.info("info msg");
	}

}
