package com.springcore.constructor_injection;

public class Addition {
	private int a;
	private int b;
	
	
	public Addition(double a,double b) {
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("constructor:double,double");
		
}
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("constructor:int, int");
		
}
	public void doSum()
	{
		System.out.println("value of a "+this.a);
		System.out.println("value of b "+this.b);
		System.out.println("sum is ="+ (this.a + this.b));
	}
 
}
//this is ambeguity example by default string ko hi assume krega 
//but if we give order then it will go through order. but if we give type then according to type that will give output
//if we give index then value of a 34
//value of b 12