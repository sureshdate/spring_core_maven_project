package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
 private String name;
 private List<String> phones;
 private Set<String> address;
 private Map<String,String> courses;
 private Properties props;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}
public Employee(Properties props) {
	super();
	this.props = props;
}

public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
	super();
	this.name = name;
	this.phones = phones;
	this.address = address;
	this.courses = courses;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
 
}
