/**
 * 
 */
package com.userdetails.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userdetails.user.User;

/**
 * @author PRAVEEN
 *
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
