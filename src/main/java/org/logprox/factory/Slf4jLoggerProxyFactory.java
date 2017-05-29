package org.logprox.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLoggerProxyFactory implements LoggerProxyFactory<Logger>{

	@Override
	public Logger getLogger(Class<?> clazz) {
		return LoggerFactory.getLogger(clazz);
	}

	@Override
	public Class<Logger> getReturnType() {
		return Logger.class;
	}
	
}
