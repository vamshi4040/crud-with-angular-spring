package com.angulaeApp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.postgresql.translation.messages_bg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.angulaeApp.controller.form.UserRegistrationValidator;
import com.angulaeApp.dto.UserRegistration;
import com.angulaeApp.service.BaseManager;

@Controller
public class UserController  {

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    binder.addValidators(new UserRegistrationValidator());
	}
	@Autowired
	private BaseManager baseManager;


	@RequestMapping(value = "/user/list.do", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getUsers(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("users", baseManager.getObjects(UserRegistration.class));
		return model;
	}

	@RequestMapping(value = "/user/{id}/edit.do", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getUser(HttpServletRequest request,
			@PathVariable("id") int id) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", baseManager.getObject(UserRegistration.class, id));
		return model;
	}
	
	@RequestMapping(value = "/user/edit.do", method = RequestMethod.POST)
	public @ResponseBody
	Map<String, Object> saveUser(HttpServletRequest request, HttpServletResponse response,
			@RequestBody @Valid UserRegistration user, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		if(result.hasErrors()){
			model.put("validation", result.getAllErrors());
			response.setStatus(400);
			return model;
		}
		
		baseManager.saveObject(user);
		return model;
	}

	@RequestMapping(value = "/user/{id}/.do", method = RequestMethod.DELETE)
	public @ResponseBody
	Map<String, Object> deleteUser(HttpServletRequest request,
			@PathVariable("id") int id) {
		Map<String, Object> model = new HashMap<String, Object>();
		UserRegistration user = baseManager.getObject(UserRegistration.class, id);
		if(user != null){
			baseManager.removeObject(user);
			model.put("users", baseManager.getObjects(UserRegistration.class));
		}
		return model;
	}
	
}
