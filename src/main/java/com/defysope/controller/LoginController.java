package com.defysope.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.defysope.model.User;
import com.defysope.service.LoginManager;

@Controller
public class LoginController {

	@Autowired
	private LoginManager loginManager;

	private String viewName = "index.jsp";

	@RequestMapping(value = "/getLoginPage")
	public ModelAndView loginPage(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView("/views/index.jsp");
	}
	
	@RequestMapping(value = "/loginCheck")
	public ModelAndView loginCheck(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = loginManager.authenticateUser(userName, password);
		if (user != null) {
			model.put("user", user);
			viewName = "/views/home.jsp";
			model.put("error", "");
		} else {
			model.put("userName", userName);
			model.put("password", password);
			viewName = "/views/loginFail.jsp";
			model.put("error",
					"Invalid Username & password.Enter correct and try again");
		}
		return new ModelAndView(viewName, model);
	}

}
