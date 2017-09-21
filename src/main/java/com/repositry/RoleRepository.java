package com.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.UserRole;


public interface RoleRepository extends CrudRepository<UserRole, Long> {

	List<UserRole> findByUsers_Email(String Email);
	UserRole findByRole(String role);

}
