package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		customerDAO cu=	(customerDAO)context.getBean("cus");
		System.out.println(cu.toString());

}
	

}
