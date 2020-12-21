package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TakeLogs {
	
	public static void logs(String classname, String message){
		DOMConfigurator.configure("../log4j/src/main/java/layout/layout.xml");
		Logger log= Logger.getLogger(classname);
		log.info(message);
		
	}
}

