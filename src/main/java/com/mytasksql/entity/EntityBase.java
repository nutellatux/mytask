package com.mytasksql.entity;

import java.time.LocalDateTime;

import lombok.Data;

public @Data class EntityBase {
	
	private String id;
	private LocalDateTime creationDate;
	private LocalDateTime alterationDate;
	private String idCreationUser;
	private String idalterationUser;

}
