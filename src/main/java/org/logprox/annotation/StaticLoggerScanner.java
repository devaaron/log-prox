package org.logprox.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;

import org.logprox.factory.LoggerProxyFactory;
import org.logprox.factory.Slf4jLoggerProxyFactory;
import org.logprox.factory.registry.LoggerFactoryRegistry;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("rawtypes")
public class StaticLoggerScanner implements LoggerScanner {
	Set<Field> fields; Set<LoggerProxyFactory> factories;
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	public StaticLoggerScanner(String packageName, LoggerFactoryRegistry registry) throws IllegalAccessException {
		this(new Reflections(packageName, new FieldAnnotationsScanner()), registry);
	}
	
	public StaticLoggerScanner(Reflections reflections, LoggerFactoryRegistry registry) throws IllegalAccessException {
		this(reflections.getFieldsAnnotatedWith(Log.class), registry);
	}
	
	public StaticLoggerScanner(Set<Field> fields, LoggerFactoryRegistry registry) throws IllegalAccessException {
		this(fields, registry.retrieveFactories());
		
	}
	
	public StaticLoggerScanner(Set<Field> fields, Set<LoggerProxyFactory> loggerFactoryBeans) throws IllegalAccessException {
		this.fields = fields;
		this.factories = loggerFactoryBeans;
	}
		
	@SuppressWarnings("unchecked")
	public void setLoggers(){
		for(Field field : fields){
			field.setAccessible(true);
			Reflections reflections = null;
			for(LoggerProxyFactory factory : factories){
				if(!factory.getReturnType().equals(field.getType())){
					reflections = new Reflections(new SubTypesScanner());
					if(!reflections.getSubTypesOf(factory.getReturnType()).contains(field.getType())){
						factory = new Slf4jLoggerProxyFactory();
					}
				}
				
				if(Modifier.isStatic(field.getModifiers())){
					try {
						field.set(null, factory.getLogger(field.getDeclaringClass()));
					} catch (IllegalArgumentException | IllegalAccessException e) {
						log.warn(String.format("Unable to set static field where fieldName=%s, declaringClass=%s, errorMessage=%s",field.getName(),field.getDeclaringClass(), e.getMessage()), e);
					}
				}
			}
		}
	}
}
