package org.logprox.factory.registry;

import java.util.Set;

import org.logprox.factory.LoggerFactoryBean;

@SuppressWarnings("rawtypes")
public class DefaultLoggerFactoryRegistry implements LoggerFactoryRegistry {

	Set<LoggerFactoryBean> factories;
	
	@Override
	public Set<LoggerFactoryBean> retrieveFactories() {
		return factories; 
	}
	
	public void add(LoggerFactoryBean factory){
		factories.add(factory);
	}
}
