package com.softcehsol.spring.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softcehsol.spring.rest.entities.Product;
import com.softechsol.spring.rest.repos.ProductRepos;

@RestController
@RequestMapping("/productsController")
public class ProductController {

	@Autowired
	private ProductRepos repos;

	@GetMapping
	public Iterable<Product> getAllProducts() {
		return repos.findAll();
	}

}
