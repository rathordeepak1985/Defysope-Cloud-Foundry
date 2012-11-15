package com.defysope.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.defysope.dao.LoginDao;
import com.defysope.model.User;

@Repository
@Transactional
public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {

	@Autowired
	public void init(SessionFactory factory) {
		setSessionFactory(factory);
	}

	public User authenticateUser(String userName, String password) {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("userName", userName));
		criteria.add(Restrictions.eq("password", password));
		@SuppressWarnings("unchecked")
		List<User> userList = getHibernateTemplate().findByCriteria(criteria);
		if (userList.size() > 0) {
			return userList.get(0);
		} else {
			return null;
		}
	}

}
