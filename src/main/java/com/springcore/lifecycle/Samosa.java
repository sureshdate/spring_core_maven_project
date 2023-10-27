package com.springcore.lifecycle;

public class Samosa {
   private double price;
   
   

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

public Samosa(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting price");
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
//you can change  name init replace to any othe name same as for destry only change in xml file..change nly method name
public void init() {
	System.out.println("inside init method");
}
   
public void destroy() {
	System.out.println("inside destroy method");
}
	
}
