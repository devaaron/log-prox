package org.logprox;

import org.logprox.annotation.Log;
import org.springframework.stereotype.Component;

@Component
public class SampleBean {

	@Log
	static Log log;
	
}
