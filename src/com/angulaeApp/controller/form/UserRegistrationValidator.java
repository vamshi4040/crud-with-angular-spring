package com.angulaeApp.controller.form;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.angulaeApp.dto.UserRegistration;

@Component
public class UserRegistrationValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(UserRegistration.class);
	}

	@Override
	public void validate(Object o, Errors errors) {
		UserRegistration form = (UserRegistration) o;
	
		if (StringUtils.isBlank(form.getUserName())) {
			errors.rejectValue("userName", "", "aaaaaaaaa-----------------");
		}
		
		if (StringUtils.isBlank(form.getFirstName())) {
			errors.rejectValue("firstName", "", "bbbbbbb-----------------");
		}
	}
}
