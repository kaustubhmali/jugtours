package com.okta.developer.jugtours.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okta.developer.jugtours.model.Group;

public interface IGroupRepository extends JpaRepository<Group, Long>{
	
	Group findByName(String name);

}
