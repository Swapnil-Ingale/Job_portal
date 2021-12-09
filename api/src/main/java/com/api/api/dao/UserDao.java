package com.api.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
