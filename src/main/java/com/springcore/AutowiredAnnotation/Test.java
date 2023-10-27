package com.springcore.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructor_injection.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/AutowiredAnnotation/Autowired_Annotation.xml");
		Emp emp1=context.getBean("emp1",Emp.class);//if you dont want to typecasting then do same as type
		System.out.println(emp1);

	}

}
