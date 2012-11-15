package com.defysope.service;

import com.defysope.model.User;

public interface LoginManager {

	User authenticateUser(String userName, String password);

}
