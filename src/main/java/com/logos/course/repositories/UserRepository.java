package com.logos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
