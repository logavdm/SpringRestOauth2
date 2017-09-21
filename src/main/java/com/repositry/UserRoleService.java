package com.repositry;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.UserRole;


@Service
@Transactional
public class UserRoleService implements RoleRepository{

	@Autowired
	RoleRepository repository;
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserRole arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends UserRole> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UserRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UserRole> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserRole> S save(S arg0) {
		// TODO Auto-generated method stub
		
		return repository.save(arg0);
		
		
	}

	@Override
	public <S extends UserRole> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserRole> findByUsers_Email(String Email) {
		// TODO Auto-generated method stub
		return repository.findByUsers_Email(Email);
	}

	@Override
	public UserRole findByRole(String role) {
		
		return repository.findByRole(role);
	}

	

	
}
