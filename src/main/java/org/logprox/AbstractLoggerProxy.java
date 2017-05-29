package org.logprox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractLoggerProxy implements Logger {

	private Logger log;

	public AbstractLoggerProxy(Logger log) {
		super();
		this.log = log;
	}
	
	public AbstractLoggerProxy(Class<?> clazz) {
		super();
		this.log = LoggerFactory.getLogger(clazz);
	}

	public Logger getLog() {
		return log;
	}

	public void setLog(Logger log) {
		this.log = log;
	}
	
	public void setLog(Class<?> clazz) {
		this.log = LoggerFactory.getLogger(clazz);
	}
	
}
