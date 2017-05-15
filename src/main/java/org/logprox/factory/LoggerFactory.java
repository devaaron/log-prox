package org.logprox.factory;

import org.slf4j.Logger;

public class LoggerFactory {

	public Logger createInstance(Class<?> declaringClass, LoggerFactoryBean<? extends Logger> subFactory) throws Exception {
		return subFactory.getLogger(declaringClass);
	}
	
}
