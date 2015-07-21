package com.company.project.module.service;

import java.util.List;

import com.company.project.module.model.User;

public interface UserService {

	void saveUser(User user);

	List<User> findAllUsers();

	void deleteUserByemailId(String emaild);

	User findByEmailId(String email);

	void updateUser(User user);
}
