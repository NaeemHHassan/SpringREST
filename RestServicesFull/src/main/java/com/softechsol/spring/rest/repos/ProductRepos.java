package com.softechsol.spring.rest.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.softcehsol.spring.rest.entities.Product;

public interface ProductRepos extends CrudRepository<Product, Integer> {

}
