package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//using interface lifecycle method
//InitializingBean,DisposableBean
public class Pepsi implements InitializingBean,DisposableBean {
 public double price;

public Pepsi(double price) {
	super();
	this.price = price;
}

public Pepsi() {
	super();
	
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("taking pepsi:init");
	
}

@Override
public void destroy() throws Exception {
	System.out.println("Going to put bottle back to shop:after destroy");
	
}
 
 
}
