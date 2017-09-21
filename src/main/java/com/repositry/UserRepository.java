package com.repositry;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Users;

public interface UserRepository extends JpaRepository<Users,Long>{
	
	Users findByEmail(String email);
	List<Users> findByRoles_Role(String role);
				
}
