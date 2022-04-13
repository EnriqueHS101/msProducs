package com.ehsproy.msProducs.service.impl;

import org.springframework.stereotype.Service;

import com.ehsproy.msProducs.model.ProductData;
import com.ehsproy.msProducs.repository.IProductDataRepository;
import com.ehsproy.msProducs.service.IProductDataService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductDataServiceImpl implements IProductDataService{

	private final IProductDataRepository repoProduct;

	public Flux<ProductData> findAll() {
		return repoProduct.findAll();
	}


	public Mono<ProductData> save(ProductData productData) {
		return repoProduct.save(productData);
	}


	public Mono<ProductData> findByCodeProduct(String code) {
		return repoProduct.findByCodeProduct(code);
	}
	
	
}
