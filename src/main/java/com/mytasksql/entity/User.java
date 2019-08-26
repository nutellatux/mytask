package com.mytasksql.entity;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@EntityScan
public @Data class User extends EntityBase {
	
	private String name;
	private String email;
	private String password;
	private String token;
	private Document document;
	private UserAddress userAddress;  
	
	// @OneToMany
	private List<Task> tasks;
	
}
