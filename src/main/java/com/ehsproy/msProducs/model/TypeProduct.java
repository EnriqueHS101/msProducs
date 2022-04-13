package com.ehsproy.msProducs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("typeProduct")
public class TypeProduct {

	@Id
	private String id;
	private String codeType;
	private String nameType;
	
}
