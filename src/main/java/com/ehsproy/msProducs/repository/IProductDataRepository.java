package com.ehsproy.msProducs.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.msProducs.model.ProductData;

import reactor.core.publisher.Mono;

public interface IProductDataRepository extends ReactiveCrudRepository<ProductData,String> {

	
	Mono<ProductData> findByCodeProduct(String code);
}
