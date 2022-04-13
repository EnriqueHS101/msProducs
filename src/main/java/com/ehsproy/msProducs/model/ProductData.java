package com.ehsproy.msProducs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("productData")
public class ProductData {

	@Id
	private String id;
	private String typeProduct;
	private String codeProduct;
	private String nameProduct;
	private Integer maxProduct;
	private Boolean commission;
	private Boolean limitYN;
	private Integer numberMoves;
	private Double minAmountOpen;
}
