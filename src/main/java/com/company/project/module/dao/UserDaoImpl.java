package com.company.project.module.dao;

import java.util.List;

import com.company.project.module.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	public void saveEmployee(User employee) {
		persist(employee);
	}


	public List<User> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	public void deleteEmployeeBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from User where ssn = :ssn");
		query.setString("ssn", ssn);
		query.executeUpdate();
	}

	
	public User findBySsn(String ssn){
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("ssn",ssn));
		return (User) criteria.uniqueResult();
	}
	
	public void updateEmployee(User employee){
		getSession().update(employee);
	}

	public void saveUser(User user) {
		persist(user);
	}

	public List<User> findAllUsers() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	public void deleteUSerByemailId(String emailId) {
		Query query = getSession().createSQLQuery("delete from User where emailId = :emailId");
		query.setString("emailId", emailId);
		query.executeUpdate();

	}

	public User findByEmailId(String emailId) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("ssn",emailId));
        return (User) criteria.uniqueResult();
	}

	public void updateUser(User user) {
        getSession().update(user);
	}
}
