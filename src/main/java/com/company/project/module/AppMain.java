package com.company.project.module;

import com.company.project.module.model.User;
import com.company.project.module.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.company.project.module.configuration.AppConfig;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService service = (UserService) context.getBean("userService");


		//  Create user1

		User user1 = new User();
		user1.setUserName("aman");
		user1.setEmailId("amangupta.onl9@gmail.com");



		/*
		 * Persist both Employees
		 */
		service.saveUser(user1);




		context.close();
	}
}
