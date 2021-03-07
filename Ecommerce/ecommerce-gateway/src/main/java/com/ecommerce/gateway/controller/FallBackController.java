package com.ecommerce.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@RequestMapping("/ecommerceProductFallback")
	public String productServiceCallback() {
		return "Product Service is taking too long to respond or is down. Please try again later";
		
	}
	
	@RequestMapping("/ecommerceCartFallback")
	public String cartServiceCallback() {
		return "cart Service is taking too long to respond or is down. Please try again later";
		
	}
	
	@RequestMapping("/ecommerceServiceFallback")
	public String ecommerceServiceCallback() {
		return "Ecommerce Service is taking too long to respond or is down. Please try again later";
		
	}
}
