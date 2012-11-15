package com.defysope.dao;

import com.defysope.model.User;

public interface LoginDao {

	User authenticateUser(String userName, String password);

}
