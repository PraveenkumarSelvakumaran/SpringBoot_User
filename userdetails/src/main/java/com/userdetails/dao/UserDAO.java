/**
 * 
 */
package com.userdetails.dao;

import java.util.List;

import com.userdetails.user.User;

/**
 * @author PRAVEEN
 *
 */
public interface UserDAO {
	
	User add(User user);
	
	List<User> getUsers();

	User getUser(String userId);
}
