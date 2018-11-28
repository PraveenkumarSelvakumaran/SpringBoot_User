/**
 * 
 */
package com.userdetails.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Praveenkumar.S
 *
 */

@RestController
@RequestMapping(value="/")
public class UserController {
	
	private final UserDao userDao;
	
	private final UserRepository userRepository;
	
	public UserController(UserDao userDao, UserRepository userRepository) {
		this.userDao = userDao;
		this.userRepository = userRepository;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User add(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@RequestMapping(value = "", method = Request.GET)
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public User getUser(@pathVariable String userId) {
		return userRepository.findByID(userId);
	}
		
}
