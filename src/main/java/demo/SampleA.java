package demo;

import org.logprox.annotation.Log;
import org.slf4j.Logger;

public class SampleA {

	@Log
	static Logger log;
	
	public void logSomething(){
		log.debug("Simple debug statement");
		log.error("Simple error statement");
		log.info("Simple info statement");
		log.warn("Simple warn statement");
	}
	
}
