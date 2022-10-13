package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//@repository
public interface UserRepository extends JpaRepository<User, Long>{
		
}
