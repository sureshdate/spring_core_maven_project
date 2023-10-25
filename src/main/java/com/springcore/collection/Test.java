package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
		 Employee emp1=(Employee)context.getBean("emp1");
		 System.out.println(emp1.getName());
		 System.out.println(emp1.getPhones());
		 System.out.println(emp1.getAddress());
		  System.out.println(emp1.getCourses());
		  System.out.println(emp1.getProps());
	}

}
