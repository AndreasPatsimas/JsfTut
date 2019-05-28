package org.patsimas.jsf.hello;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped // shared by all users,  an valw @SessionScoped  tote thanai gia to session kathe user
public class CounterTwo {

	private int value = 0;
	
	
	
	public CounterTwo() {
		
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public String increment() {
		
		value++;
		
		return "student_two";
	}
}
