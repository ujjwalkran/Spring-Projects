package com.infosys.Librarypgm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	LibraryServices ls = (LibraryServices) context.getBean("ls");
    	ls.displayBooks();
    }
}
