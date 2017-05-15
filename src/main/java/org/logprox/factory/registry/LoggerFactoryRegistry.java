package org.logprox.factory.registry;

import java.util.Set;

import org.logprox.factory.LoggerFactoryBean;

public interface LoggerFactoryRegistry {

	@SuppressWarnings("rawtypes")
	public Set<LoggerFactoryBean> retrieveFactories();

}
