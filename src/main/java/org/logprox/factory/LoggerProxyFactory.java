package org.logprox.factory;

import org.slf4j.Logger;

public interface LoggerProxyFactory<ReturnType extends Logger> {

	public ReturnType getLogger(Class<?> clazz);
	
	public Class<ReturnType> getReturnType();
}
