package com.example.demo.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.mysql.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
