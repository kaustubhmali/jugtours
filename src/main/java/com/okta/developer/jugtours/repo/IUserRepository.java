package com.okta.developer.jugtours.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okta.developer.jugtours.model.Group;
import com.okta.developer.jugtours.model.User;

public interface IUserRepository extends JpaRepository<User, String>{

}
