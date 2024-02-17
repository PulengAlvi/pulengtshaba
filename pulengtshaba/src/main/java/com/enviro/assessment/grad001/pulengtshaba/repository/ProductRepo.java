package com.enviro.assessment.grad001.pulengtshaba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enviro.assessment.grad001.pulengtshaba.model.Products;



public interface ProductRepo extends JpaRepository<Products, Long> {
   
}
