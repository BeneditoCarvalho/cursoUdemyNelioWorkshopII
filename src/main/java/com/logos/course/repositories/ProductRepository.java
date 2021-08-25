package com.logos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
