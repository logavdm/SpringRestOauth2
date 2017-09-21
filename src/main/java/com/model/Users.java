package com.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="users")
public class Users {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
	private String email;
	private String Password;
	private boolean isExpired;
	private boolean isEnable;
	private boolean isLocked;
	private boolean NonExpiredPassword;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(name = "User_Roles", joinColumns = @JoinColumn(name = "User_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "Role_id", referencedColumnName = "id"))
	@JsonManagedReference
	private Set<UserRole> roles;
		
	public boolean isExpired() {
		return isExpired;
	}

	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean isNonExpiredPassword() {
		return NonExpiredPassword;
	}

	public void setNonExpiredPassword(boolean nonExpiredPassword) {
		NonExpiredPassword = nonExpiredPassword;
	}

	public Set<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<UserRole> roles) {
		this.roles = roles;
	}

	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		email = Email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	

	

}
