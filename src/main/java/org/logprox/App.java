package org.logprox;

import org.logprox.annotation.Log;
import org.slf4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	@Log
	static Logger log;
	
    public static void main( String[] args )
    {
        log.info( "Hello World!" );
    }
}
