package org.logprox.factory.registry;

import java.util.Set;

import org.logprox.factory.LoggerProxyFactory;

public interface LoggerFactoryRegistry {

	@SuppressWarnings("rawtypes")
	public Set<LoggerProxyFactory> retrieveFactories();

}
