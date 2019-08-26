package com.mytasksql.entity;

import java.util.List;

import lombok.Data;

public @Data class Task extends EntityBase {
	
	private String title; 
	private String description;
	private String startDate;
	private String endDate;
	private List<Attachment> attachments;
	private Boolean favorites;
	private Boolean isDone;
	
	// @ManyToOne
	private User user;

}
