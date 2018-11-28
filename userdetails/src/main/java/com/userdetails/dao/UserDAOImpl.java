/**
 * 
 */
package com.userdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.userdetails.user.User;

/**
 * @author PRAVEEN
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public User add(User user) {
		mongoTemplate.save(user);
		return user;
	}
	
	@Override
	public List<User> getUsers() {
		return mongoTemplate.findAll(User.class);
	}

	@Override
	public User getUser(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return mongoTemplate.findOne(query, User.class);
	}

}
