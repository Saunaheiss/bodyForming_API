package com.tobias.bodyForming.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@Table(name = "user")
@EqualsAndHashCode(exclude = {"password", "id"})
@ToString(exclude = { "password"})
public class User {
	// FACEBOOK ?! ------------------------------------------------------------
	
	@JsonView(JsonViews.Public.class)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonView(JsonViews.Public.class)
	@Column(name = "first_name", nullable = false, length = 30)
	private String firstName;
	
	@JsonView(JsonViews.Public.class)
	@Column(name = "last_name", nullable = false, length = 45)
	private String lastName;
	
	@JsonView(JsonViews.Public.class)
	@Column(unique = true, nullable = false, length = 75)
	private String email;
	
	@JsonView(JsonViews.Public.class)
	@Column(nullable = false, length = 76)
	private String password;
	
//	@Column(nullable = false, length = 75) // NECESSARY???????????? --------------
//	private String token;
	
	public User(){
		/* default constructor: required by JPA */
	}

	public User(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
//		this.token = token;
	}
}
