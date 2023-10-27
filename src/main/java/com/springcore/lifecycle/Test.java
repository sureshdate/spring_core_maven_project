package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/Lifecycle.xml");
		Samosa s1=(Samosa)context.getBean("s1");
		System.out.println(s1);
        //in application context call only init method but for destroy method we have to make application class as a
		//abstract class and we have to enable registershutdook.then it will get call to destry method
		
		//registering shutdown hook
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++ By using interfaces method");
		Pepsi p1 =(Pepsi)context.getBean("p1");
		
		System.out.println(p1);
		System.out.println("+++++++++++++++++++++");
		
		
		Example example=(Example)context.getBean("example");
		System.out.println(example);
	
	}

}
