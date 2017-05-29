package demo;

import org.logprox.annotation.Log;
import org.logprox.simple.SimpleLoggerProxyImpl;

public class SampleB {

	@Log
	static SimpleLoggerProxyImpl log;
	
	public void logSomething(){
		log.debug("Simple debug statement");
		log.error("Simple error statement");
		log.info("Simple info statement");
		log.warn("Simple warn statement");
	}
	
}
