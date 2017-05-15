package org.logprox.factory.registry;

import java.util.HashSet;
import java.util.Set;

import org.logprox.factory.LoggerFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringLoggerFactoryRegistry implements ApplicationContextAware, LoggerFactoryRegistry{

	ApplicationContext context;
	@SuppressWarnings("rawtypes")
	Class<LoggerFactoryBean> clazz = LoggerFactoryBean.class;
	
	
	@Autowired
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		context = arg0;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Set<LoggerFactoryBean> retrieveFactories(){
		Set<LoggerFactoryBean> returnValue = new HashSet<LoggerFactoryBean>();
		for(String beanName : context.getBeanNamesForType(clazz)){
			returnValue.add((LoggerFactoryBean) context.getBean(beanName));
		}
		return returnValue;
	}
	
}
