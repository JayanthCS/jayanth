package com.xworkz.policestation.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;



public class ValidationUtil<T> {

	public boolean validate(T t) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();
		Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

		constraintViolations.forEach(v -> System.out.println(v.getPropertyPath() + "   " + v.getMessage()));
		return constraintViolations.isEmpty();
	}
}
