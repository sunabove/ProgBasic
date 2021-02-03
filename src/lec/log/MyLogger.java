package lec.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

	private final static Logger logger = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args) {
		logger.setLevel( Level.ALL );
 
		logger.warning("my warning");
		logger.info("my info");
		
		logger.config("my config"); 
		logger.fine("my fine");
		logger.finest("my finest");
	}

}
