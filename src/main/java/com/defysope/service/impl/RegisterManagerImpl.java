package com.defysope.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.defysope.dao.RegisterDao;
import com.defysope.model.User;
import com.defysope.service.RegisterManager;

@Service
@Transactional(readOnly = false)
public class RegisterManagerImpl implements RegisterManager {

	@Autowired
	private RegisterDao registerDao;

	public User saveNewUser(User user) {

		return registerDao.saveNewUser(user);
	}

}
