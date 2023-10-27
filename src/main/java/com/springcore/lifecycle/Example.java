package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//usiing annotation method
public class Example {
private String subject;


public Example(String subject) {
	super();
	this.subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

public String getSubject() {
	return subject;
}

public void setSubject(String Subject) {
	this.subject=subject;
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}
@PostConstruct
public void start() {
	System.out.println("starting method");
}
@PreDestroy
public void end() {
	System.out.println("ending method");
}
}
