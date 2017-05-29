package org.logprox.simple;

import org.logprox.factory.LoggerProxyFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleLoggerProxyFactory implements LoggerProxyFactory<SimpleAbstractLoggerProxy>{

	@Override
	public SimpleAbstractLoggerProxy getLogger(Class<?> clazz) {
		return new SimpleLoggerProxyImpl(clazz);
	}

	@Override
	public Class<SimpleAbstractLoggerProxy> getReturnType() {
		return SimpleAbstractLoggerProxy.class;
	}

	
}
