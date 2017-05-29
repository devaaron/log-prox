package org.logprox.factory.registry;

import java.util.HashSet;
import java.util.Set;

import org.logprox.factory.LoggerProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringLoggerFactoryRegistry implements ApplicationContextAware, LoggerFactoryRegistry{

	ApplicationContext context;
	@SuppressWarnings("rawtypes")
	Class<LoggerProxyFactory> clazz = LoggerProxyFactory.class;
	
	
	@Autowired
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		context = arg0;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Set<LoggerProxyFactory> retrieveFactories(){
		Set<LoggerProxyFactory> returnValue = new HashSet<LoggerProxyFactory>();
		for(String beanName : context.getBeanNamesForType(clazz)){
			returnValue.add((LoggerProxyFactory) context.getBean(beanName));
		}
		return returnValue;
	}
	
}
