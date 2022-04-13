package com.ehsproy.msProducs.service;

import com.ehsproy.msProducs.model.ProductData;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductDataService {

	Flux<ProductData> findAll();
	Mono<ProductData> save(ProductData productData);
	Mono<ProductData> findByCodeProduct(String code);
}
