package com.greatLearning.employeeService.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "users")

public class User {

   @Id
   @Column(name = "user_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name="username")
   private String username;
   @Column(name="password")
   private String password;
    
   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(
           name = "users_roles",
           joinColumns = @JoinColumn(name = "user_id"),
           inverseJoinColumns = @JoinColumn(name = "role_id")
           )
   private List<Role> roles = new ArrayList<>();



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getUsername() {
	return username;
}



public void setUsername(String username) {
	this.username = username;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public void setRoles(List<Role> roles) {
	this.roles = roles;
}



@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + "]";
}



public List<Role> getRoles() {
	// TODO Auto-generated method stub
	return roles;
}





   


}

