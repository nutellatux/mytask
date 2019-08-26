package com.mytasksql.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@EntityScan
public @Data class Attachment extends EntityBase {
	
	private String name; // Hash  = instante da criação +  infos
	private String idUser;
	
}
