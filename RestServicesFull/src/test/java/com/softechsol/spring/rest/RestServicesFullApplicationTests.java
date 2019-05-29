package com.softechsol.spring.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.softcehsol.spring.rest.entities.Product;
import com.softechsol.spring.rest.repos.ProductRepos;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestServicesFullApplicationTests {

	@Autowired
	private ApplicationContext cont;

	@Test
	public void findAllProducts() {

		ProductRepos repos = cont.getBean(ProductRepos.class);
		Iterable<Product> all = repos.findAll();

		all.forEach(p -> {
			System.out.println(p.toString());
		});
	}

}
