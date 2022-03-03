package com.springdemo.mvc.ModelClasses;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;

	@NotNull(message = "must not be empty!")
	@Size(min = 3, message = "should have min. length 3")
	private String lastName;

	@NotNull(message = "must not be empty!")
	@Min(value = 1, message = "must be atleast 1")
	@Max(value = 9, message = "must be less than 10")
	private Integer passes;

	@Pattern(regexp = "[0-9]{6}", message = "must be 6 digits")
	private String postalCode;

	@CourseCode(value = { "IT", "CS" }, message = "Start with CS/IT")
	private String courseCode;

	public void setPasses(Integer passes) {
		this.passes = passes;
	}

	public Integer getPasses() {
		return passes;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", passes=" + passes + ", postalCode="
				+ postalCode + ", courseCode=" + courseCode + "]";
	}
}
