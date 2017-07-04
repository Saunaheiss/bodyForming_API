package com.tobias.bodyForming.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@Table(name = "trainer_user")
@EqualsAndHashCode(exclude = {"password", "id"})
@ToString(exclude = { "password"})
public class TrainerUser {
	
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
	
	@Column(name = "personal_photo", nullable = true, length = 500)
	private String personalPhoto;
	
	@Column(name = "conclusion", nullable = true, length = 1000)
	private String conclusion;
	
	@Column(name = "philosophy", nullable = true, length = 1000)
	private String philosophy;
	
	@Column
	@ElementCollection
	private List<String> experience;
	
	@ManyToMany
	private List<Skills> skills; //(Endorsements)
	
	@OneToMany(mappedBy = "revieweD", cascade = CascadeType.ALL, orphanRemoval=true)
	private List <Reviews> reviews;
	
	@Column
	@ElementCollection
	private List<String> photos;

	public TrainerUser(){
		/* default constructor: required by JPA */
	}

	public TrainerUser(String firstName, String lastName, String email, String password, String token,
			String personalPhoto, String conclusion, String philosophy, List<String> experience, List<Skills> skills, List<Reviews> reviews, 
			List<String> photos) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
//		this.token = token;
		this.personalPhoto = personalPhoto;
		this.conclusion = conclusion;
		this.philosophy = philosophy;
		this.experience = experience;
		this.skills = skills;
		this.reviews = reviews;
		this.photos = photos;
	}
	
}
