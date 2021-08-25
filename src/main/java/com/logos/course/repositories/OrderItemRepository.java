package com.logos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
