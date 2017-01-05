package com.wangjie.spring.validate;

import com.wangjie.spring.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by 26297 on 2016/12/29.
 */
public class MyValidator implements Validator {

	public boolean supports(Class<?> aClass) {
		return User.class.equals(aClass);
	}

	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "username", null, "Username is empty.");
		User user = (User) obj;
		if (null == user.getPassword() || "".equals(user.getPassword()))
			errors.rejectValue("password", null, "Password is empty.");
	}
}
