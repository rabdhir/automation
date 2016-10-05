package seleniumtutorial;

import org.apache.log4j.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LoggingDemo {
	static Logger log = Logger.getLogger(LoggingDemo.class);
	static Appender append;
	
/*
 * Debug
 * Info
 * Warn
 * Error
 * Fatal
 * VM Argument: -Dlog4j.debug=true
 * @param args
 */

	public static void main(String[] args)  throws Exception {	  
	    // Define Appender
		append = new ConsoleAppender(new SimpleLayout());
	    log.addAppender(append);
	   /* 
		// BasicConfigurator.configure();
		Properties log4jprop = new Properties();
		log4jprop.setProperty("log4j.rootlogger", "DEBUG, CA");
		log4jprop.setProperty("log4j.appender.CA", "org.apache.log4j.ConsoleAppender");
		log4jprop.setProperty("log4j.appender.CA.layout", "org.apache.log4j.PatternLayout");
		log4jprop.setProperty("log4j.appender.CA.layout.CoversionPattern", "%d{yyyy-MM-dd} -- %-10p %c - %m%n");
		*/
		PropertyConfigurator.configure("log4j.properties");
		log.info("Running before method");
		runMethod();
		log.debug("This message is a debug");
	}

	private static void runMethod() {
		log.info("This message is from runMethod");
	
	}

}

