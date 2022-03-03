package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String[] prefixes;

	@Override
	public void initialize(CourseCode courseCode) {
		prefixes = courseCode.value();
	}

	@Override
	public boolean isValid(String providedCode, ConstraintValidatorContext arg1) {
//		System.out.println("CourseCodeConstraintValidator : " + providedCode);
		if (providedCode == null)
			return true;
		for (var prefix : prefixes) {
			if (providedCode.startsWith(prefix))
				return true;
		}
		return false;
	}
}
