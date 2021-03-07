package com.ecommerce.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.domain.Product;
import com.ecommerce.product.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public Product storeProduct(@RequestBody Product product) {
      log.info("Inside the storeProduct to add new product");
      return this.productService.addProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product getProductDetails(@PathVariable("id") long productId) {
		log.info("Inside the getProductDetails to get product details.");
		return this.productService.getProductByProductId(productId);
	}
}
