package org.logprox.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;

import org.logprox.factory.LoggerFactoryBean;
import org.logprox.factory.registry.LoggerFactoryRegistry;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;

@SuppressWarnings("rawtypes")
public class StaticLoggerScanner implements LoggerScanner {
	
	public StaticLoggerScanner(String packageName, LoggerFactoryRegistry registry) throws IllegalAccessException {
		this(new Reflections(packageName, new FieldAnnotationsScanner()), registry);
	}
	
	public StaticLoggerScanner(Reflections reflections, LoggerFactoryRegistry registry) throws IllegalAccessException {
		this(reflections.getFieldsAnnotatedWith(Log.class), registry);
	}
	
	public StaticLoggerScanner(Set<Field> fields, LoggerFactoryRegistry registry) throws IllegalAccessException {
		this(fields, registry.retrieveFactories());
		
	}
	
	public StaticLoggerScanner(Set<Field> fields, Set<LoggerFactoryBean> loggerFactoryBeans) throws IllegalAccessException {
		setLoggers(fields, loggerFactoryBeans);
	}
		
	@SuppressWarnings("unchecked")
	public void setLoggers(Set<Field> fields, Set<LoggerFactoryBean> factories) throws IllegalAccessException{
		for(Field field : fields){
			field.setAccessible(true);
			for(LoggerFactoryBean factory : factories){
				if(factory.getReturnType().equals(factory.getReturnType())){
					if(Modifier.isStatic(field.getModifiers())){
						field.set(null, factory.getLogger(field.getDeclaringClass()));
					}
				}
			}
		}
	}
}
