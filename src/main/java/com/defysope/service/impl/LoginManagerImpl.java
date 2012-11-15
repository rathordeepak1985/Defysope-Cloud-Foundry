package com.defysope.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defysope.dao.LoginDao;
import com.defysope.model.User;
import com.defysope.service.LoginManager;

@Service
public class LoginManagerImpl implements LoginManager {

	@Autowired
	private LoginDao dao;

	public User authenticateUser(String userName, String password) {
		return dao.authenticateUser(userName, password);
	}

}
