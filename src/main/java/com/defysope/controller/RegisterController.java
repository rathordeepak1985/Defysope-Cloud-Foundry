package com.defysope.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.defysope.model.User;
import com.defysope.service.RegisterManager;

@Controller
public class RegisterController {

	private String viewName = "/views/loginFail.jsp";

	@Autowired
	private RegisterManager registerManager;

	@RequestMapping(value = "/register")
	public ModelAndView loginCheck(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("user") User user)
			throws IOException {
		Map<String, Object> model = new HashMap<String, Object>();
		User userNew = registerManager.saveNewUser(user);
		if (userNew != null) {
			model.put("user", userNew);
			model.put("error", "Welcome " + userNew.getName()
					+ " you have registered successfully.");
		}
		return new ModelAndView(viewName, model);
	}

}
