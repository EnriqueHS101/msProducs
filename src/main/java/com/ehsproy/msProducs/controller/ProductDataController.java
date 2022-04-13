package com.ehsproy.msProducs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ehsproy.msProducs.model.ProductData;
import com.ehsproy.msProducs.service.IProductDataService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductDataController {

	private final IProductDataService serviceProduct;
	
	@GetMapping
	public Flux<ProductData> findAll() {
		return serviceProduct.findAll();
	}

	@PostMapping
	public Mono<ProductData> save(@RequestBody ProductData productData) {
		return serviceProduct.save(productData);
	}

	@PutMapping
	public Mono<ProductData> put(@RequestBody ProductData productData) {
		return serviceProduct.save(productData);
	}
	
	@GetMapping("/find/{code}")
	public Mono<ProductData> findByCodeProduct(@PathVariable String code) {
		return serviceProduct.findByCodeProduct(code);
	}
}
