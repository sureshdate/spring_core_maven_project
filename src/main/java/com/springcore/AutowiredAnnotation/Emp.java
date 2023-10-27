package com.springcore.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
@Autowired
@Qualifier("temp1")
private Address address;

public Emp() {
	super();
	
}

public Emp(Address address) {
	super();
	this.address = address;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}



}
