package com.defysope.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.defysope.dao.RegisterDao;
import com.defysope.model.User;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;

	public User saveNewUser(User user) {
		User userNew = null;
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		userNew = (User) sessionFactory.getCurrentSession().get(User.class,
				user.getId());

		return userNew;
	}

}
