package com.company.project.module.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.project.module.dao.UserDao;
import com.company.project.module.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	public void saveUser(User user) {
		dao.saveUser(user);
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	public void deleteUserByemailId(String emailId) {
		dao.deleteUSerByemailId(emailId);
	}

	public User findByEmailId(String email) {
		return dao.findByEmailId(email);
	}

	public void updateUser(User user){
		dao.updateUser(user);
	}
}
