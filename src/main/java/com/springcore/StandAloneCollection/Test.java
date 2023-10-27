package com.springcore.StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/StandAloneCollection/StandAloneCollection.xml");
        Person p=context.getBean("person1",Person.class);
        System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());//by defult it is array list but we define LinkedList in xml file 
	    System.out.println(p.getFeesStructure().getClass().getName());
	   System.out.println(p.getProperties().getClass().getName());
	
	}

}
