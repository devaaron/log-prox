package org.logprox.annotation;

import java.lang.reflect.Field;
import java.util.Set;

import org.logprox.factory.LoggerFactoryBean;

public interface LoggerScanner {

	public void setLoggers(Set<Field> fields, @SuppressWarnings("rawtypes") Set<LoggerFactoryBean> factories) throws IllegalAccessException;
}
