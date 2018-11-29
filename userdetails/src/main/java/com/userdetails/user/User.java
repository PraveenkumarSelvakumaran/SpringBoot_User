/**
 * 
 */
package com.userdetails.user;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * @author PRAVEEN
 *
 */
public class User {
	
	@Id
	private String id;
	private String name;
	private Date dob = new Date();
	private String address;
	private String description;
	private Date createdAt = new Date();
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
}
