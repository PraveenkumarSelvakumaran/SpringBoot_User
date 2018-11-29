/**
 * 
 */
package com.userdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.dao.UserDAO;
import com.userdetails.dao.UserRepository;
import com.userdetails.user.User;

/**
 * @author PRAVEEN
 *
 */

@RestController
@RequestMapping(value="/")
public class UserController {
	
	private final UserDAO userDao;
	
	private final UserRepository userRepository;
	
	public UserController(UserDAO userDao, UserRepository userRepository) {
		this.userDao = userDao;
		this.userRepository = userRepository;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User add(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public Optional<User> getUser(@PathVariable String userId) {
		return userRepository.findById(userId);
	}
		
}
