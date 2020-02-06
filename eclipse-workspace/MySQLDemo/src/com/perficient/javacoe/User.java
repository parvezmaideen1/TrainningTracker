package com.perficient.javacoe;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
    private Long iduser;
	private String username;
	private String email;
	private String first_name;
	private String last_name;
	private Date date_of_birth;

	public Long getIduser() {
		return iduser;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	public String toString() {
		return "iduser = <"+this.iduser+"> username= <"+this.username+"> email =<"+this.email+"> first_name =<"+this.first_name+"> last_name =<"+this.last_name+"> DOB =<"+this.date_of_birth.toString()+">";
	}
}
