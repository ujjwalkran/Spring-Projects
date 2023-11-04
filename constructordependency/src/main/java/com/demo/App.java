package com.demo;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        customer cst = (customer) context.getBean("cust");
        System.out.println(cst.getCustomerid());
        System.out.println(cst.getCustomername());
        System.out.println(cst.getCustomeremail());
        
        order od = (order) context.getBean("order");
        System.out.println(od.getOrderid());
        System.out.println(od.getOrderdetail());
        
    }
}
