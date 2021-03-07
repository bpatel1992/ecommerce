package com.ecommerce.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.product.domain.Product;
import com.ecommerce.product.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		log.info("i<======================inside the addProduct============>");
		return this.productRepository.save(product);
	}
	
	public Product getProductByProductId(long productId) {
		log.info("i<======================inside the getProductByProductId============>");
		return this.productRepository.findByProductId(productId);
	}
	
}
