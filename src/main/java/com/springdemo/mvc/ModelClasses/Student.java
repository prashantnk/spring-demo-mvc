package com.springdemo.mvc.ModelClasses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] OS;

	public String[] getOS() {
		return OS;
	}

	public void setOS(String[] oS) {
		OS = oS;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	private Map<String, String> countries;
	private Map<String, String> languages;

//	getters and setters

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
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

//	constructors

	public Student() {
//		System.out.println("new Student Created !");

		countries = new HashMap<String, String>();
		countries.put("in", "INDIA");
		countries.put("us", "USA");
		countries.put("uk", "UK");
		countries.put("jp", "Japan");
		countries.put("pak", "Pakistan");

		languages = new HashMap<String, String>();

		languages.put("Java", "Java");
		languages.put("C++", "C++");
		languages.put("JavaScript", "Javascript");
		languages.put("Python", "Python");
		languages.put("Others", "Others");

	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", favoriteLanguage=" + favoriteLanguage + ", OS=" + Arrays.toString(OS) + "]";
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public Map<String, String> getLanguages() {
		return languages;
	}

}
