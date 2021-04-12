package br.com.pelada_project.peladaproject.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String full_name;
	
	private String alias_name;
	
	private String email;
	
	private String password;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getAlias_name() {
		return alias_name;
	}

	public void setAlias_name(String alias_name) {
		this.alias_name = alias_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
