package com.ibstraining.springbootmicroservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibstraining.springbootmicroservice.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
