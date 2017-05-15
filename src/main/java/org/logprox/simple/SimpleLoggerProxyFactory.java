package org.logprox.simple;

import org.logprox.factory.LoggerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class SimpleLoggerProxyFactory implements LoggerFactoryBean<SimpleLoggerProxy>{

	@Override
	public SimpleLoggerProxy getLogger(Class<?> clazz) {
		return new SimpleLoggerProxy(clazz);
	}

	@Override
	public Class<SimpleLoggerProxy> getReturnType() {
		return SimpleLoggerProxy.class;
	}

	
}
