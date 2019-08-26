package com.mytasksql.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@EntityScan
public @Data class Document extends EntityBase {
	
	private TypeDoc typeDoc;
	private String identification;
	
}
