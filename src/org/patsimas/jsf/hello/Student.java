package org.patsimas.jsf.hello;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student {

	private String firstname; 
	
	private String lastname;
	
	private String phoneNumber;
	
	private String country;
	
	private String courseCode;

	public Student() {

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public void validateTheCourseCode(FacesContext context, UIComponent component, Object value) {
		if(value == null) {
			return;
		}
		
		String data = value.toString();
		
		if(!data.startsWith("ARIS")) {
			
			FacesMessage message = new FacesMessage("Course code must start with ARIS");
			
			throw new ValidatorException(message);
		}
	}
}
