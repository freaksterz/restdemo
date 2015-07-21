package com.company.project.module.dao;

import java.util.List;

import com.company.project.module.model.User;

public interface UserDao {

	void saveUser(User user);
	
	List<User> findAllUsers();
	
	void deleteUSerByemailId(String emailId);
	
	User findByEmailId(String emailId);
	
	void updateUser(User user);
}
