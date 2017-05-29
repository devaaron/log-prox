package org.logprox.factory.registry;

import java.util.HashSet;
import java.util.Set;

import org.logprox.factory.LoggerProxyFactory;

@SuppressWarnings("rawtypes")
public class DefaultLoggerFactoryRegistry implements LoggerFactoryRegistry {

	Set<LoggerProxyFactory> factories;
	
	@SuppressWarnings("serial")
	public DefaultLoggerFactoryRegistry(final LoggerProxyFactory initialFactory) {
		super();
		factories = new HashSet<LoggerProxyFactory>(){{add(initialFactory);}};
	}

	@Override
	public Set<LoggerProxyFactory> retrieveFactories() {
		return factories; 
	}
	
	public void add(LoggerProxyFactory factory){
		factories.add(factory);
	}
}
