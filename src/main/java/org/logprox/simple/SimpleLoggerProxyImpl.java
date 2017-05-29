package org.logprox.simple;

public class SimpleLoggerProxyImpl extends SimpleAbstractLoggerProxy{

	public SimpleLoggerProxyImpl(Class<?> clazz) {
		super(clazz);
	}

	@Override
	void executeProxyAction() {
		// TODO Auto-generated method stub
		getLog().info("Additional Action From Proxy");
	}

}
