package org.utils.qa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	  public static Logger logger = LogManager.getLogger(Log.class);
	  
	  public static void info(String message) {
		  logger.info(message); 
		  }
	  
	  public static void error(String message) {
		  logger.error(message); 
		  }
	  
	  public static void debug(String message) { 
		  logger.debug(message); 
		  }
	  
	  public static void warn(String message) {
		  logger.debug(message);
	  }
	  
	  public static void pymentFailure(String message) {
		  System.out.println("Payment gateway is failing");
		  logger.debug(message);
	  }
	 
}