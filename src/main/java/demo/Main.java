package demo;

import org.logprox.annotation.StaticLoggerScanner;
import org.logprox.factory.registry.DefaultLoggerFactoryRegistry;
import org.logprox.factory.registry.LoggerFactoryRegistry;
import org.logprox.simple.SimpleLoggerProxyFactory;

public class Main {
	public static void main(String[] args) {


		LoggerFactoryRegistry registry = new DefaultLoggerFactoryRegistry(new SimpleLoggerProxyFactory());
		
		try {
			StaticLoggerScanner scanner = new StaticLoggerScanner(Main.class.getPackage().getName(), registry);
			scanner.setLoggers();
			SampleA bean = new SampleA();
			bean.logSomething();
			
			SampleB beanB = new SampleB();
			beanB.logSomething();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}

}