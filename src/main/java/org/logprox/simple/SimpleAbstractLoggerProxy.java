package org.logprox.simple;

import org.logprox.AbstractLoggerProxy;
import org.slf4j.Marker;

public abstract class SimpleAbstractLoggerProxy extends AbstractLoggerProxy {

	public SimpleAbstractLoggerProxy(Class<?> clazz) {
		super(clazz);
	}

	abstract void executeProxyAction();
	
	@Override
	public void debug(String arg0) {
		executeProxyAction();
		getLog().debug(arg0);
	}

	@Override
	public void debug(String arg0, Object arg1) {
		executeProxyAction();
		getLog().debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Object... arg1) {
		executeProxyAction();
		getLog().debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Throwable arg1) {
		executeProxyAction();
		getLog().debug(arg0, arg1);
	}

	@Override
	public void debug(Marker arg0, String arg1) {
		executeProxyAction();
		getLog().debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Object arg1, Object arg2) {
		executeProxyAction();
		getLog().debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2) {
		executeProxyAction();
		getLog().debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object... arg2) {
		executeProxyAction();
		getLog().debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Throwable arg2) {
		executeProxyAction();
		getLog().debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		executeProxyAction();
		getLog().debug(arg0, arg1, arg2, arg3);
	}

	@Override
	public void error(String arg0) {
		executeProxyAction();
		getLog().error(arg0);
	}

	@Override
	public void error(String arg0, Object arg1) {
		executeProxyAction();
		getLog().error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Object... arg1) {
		executeProxyAction();
		getLog().error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Throwable arg1) {
		executeProxyAction();
		getLog().error(arg0, arg1);
	}

	@Override
	public void error(Marker arg0, String arg1) {
		executeProxyAction();
		getLog().error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Object arg1, Object arg2) {
		executeProxyAction();
		getLog().error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2) {
		executeProxyAction();
		getLog().error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object... arg2) {
		executeProxyAction();
		getLog().error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Throwable arg2) {
		executeProxyAction();
		getLog().error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		executeProxyAction();
		getLog().error(arg0, arg1, arg2, arg3);
	}

	@Override
	public String getName() {
		executeProxyAction();
		return getLog().getName();
	}

	@Override
	public void info(String arg0) {
		executeProxyAction();
		getLog().info(arg0);
	}

	@Override
	public void info(String arg0, Object arg1) {
		executeProxyAction();
		getLog().info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Object... arg1) {
		executeProxyAction();
		getLog().info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Throwable arg1) {
		executeProxyAction();
		getLog().info(arg0, arg1);
	}

	@Override
	public void info(Marker arg0, String arg1) {
		executeProxyAction();
		getLog().info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Object arg1, Object arg2) {
		executeProxyAction();
		getLog().info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2) {
		executeProxyAction();
		getLog().info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object... arg2) {
		executeProxyAction();
		getLog().info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Throwable arg2) {
		executeProxyAction();
		getLog().info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		executeProxyAction();
		getLog().info(arg0, arg1, arg2, arg3);
	}

	@Override
	public boolean isDebugEnabled() {
		executeProxyAction();
		return getLog().isDebugEnabled();
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		executeProxyAction();
		return getLog().isDebugEnabled(marker);
	}

	@Override
	public boolean isErrorEnabled() {
		executeProxyAction();
		return getLog().isErrorEnabled();
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		executeProxyAction();
		return getLog().isErrorEnabled(marker);
	}

	@Override
	public boolean isInfoEnabled() {
		executeProxyAction();
		return getLog().isInfoEnabled();
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		executeProxyAction();
		return getLog().isInfoEnabled(marker);
	}

	@Override
	public boolean isTraceEnabled() {
		executeProxyAction();
		return getLog().isTraceEnabled();
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		executeProxyAction();
		return getLog().isTraceEnabled(marker);
	}

	@Override
	public boolean isWarnEnabled() {
		executeProxyAction();
		return getLog().isWarnEnabled();
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		executeProxyAction();
		return getLog().isWarnEnabled(marker);
	}

	@Override
	public void trace(String msg) {
		executeProxyAction();
		getLog().trace(msg);
	}

	@Override
	public void trace(String marker, Object msg) {
		executeProxyAction();
		getLog().trace(marker, msg);
	}

	@Override
	public void trace(String format, Object... arguments) {
		executeProxyAction();
		getLog().trace(format, arguments);
	}

	@Override
	public void trace(String msg, Throwable t) {
		executeProxyAction();
		getLog().trace(msg, t);
	}

	@Override
	public void trace(Marker marker, String msg) {
		executeProxyAction();
		getLog().trace(marker, msg);
	}

	@Override
	public void trace(String arg0, Object arg1, Object arg2) {
		executeProxyAction();
		getLog().trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2) {
		executeProxyAction();
		getLog().trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object... arg2) {
		executeProxyAction();
		getLog().trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Throwable arg2) {
		executeProxyAction();
		getLog().trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		executeProxyAction();
		getLog().trace(arg0, arg1, arg2, arg3);
	}

	@Override
	public void warn(String arg0) {
		executeProxyAction();
		getLog().warn(arg0);	
	}

	@Override
	public void warn(String arg0, Object arg1) {
		executeProxyAction();
		getLog().warn(arg0, arg1);
	}

	@Override
	public void warn(String arg0, Object... arg1) {
		executeProxyAction();
		getLog().warn(arg0, arg1);
	}

	@Override
	public void warn(String arg0, Throwable arg1) {
		executeProxyAction();
		getLog().warn(arg0, arg1);
	}

	@Override
	public void warn(Marker arg0, String arg1) {
		executeProxyAction();
		getLog().warn(arg0, arg1);
	}

	@Override
	public void warn(String arg0, Object arg1, Object arg2) {
		executeProxyAction();
		getLog().warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2) {
		executeProxyAction();
		getLog().warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object... arg2) {
		executeProxyAction();
		getLog().warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Throwable arg2) {
		executeProxyAction();
		getLog().warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		executeProxyAction();
		getLog().warn(arg0, arg1, arg2, arg3);
	}

}
