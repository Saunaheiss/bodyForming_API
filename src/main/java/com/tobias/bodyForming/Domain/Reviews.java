package com.tobias.bodyForming.Domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@Table(name = "review")
@EqualsAndHashCode(exclude = {"id", "dateCreated"})
@ToString(exclude={"revieweR", "revieweD"})
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonView(JsonViews.Public.class)
	private Long id;
	
	@Column(name = "create_at", nullable = true)
	@JsonView(JsonViews.Public.class)
	private LocalDateTime dateCreated;
	
	@ManyToOne(optional=false)
	@JsonView(JsonViews.Detail.class)
	private User revieweR;
	
	@Column(name = "rating", nullable = true, length = 1)
	@JsonView(JsonViews.Public.class)
	private int rating;
	
	@ManyToOne(optional=false)
	@JsonView(JsonViews.Public.class)
//	@Column(name = "revieweD")
	private TrainerUser revieweD;
	
	@Column(name = "comment", nullable = true, length = 1000)
	@JsonView(JsonViews.Public.class)
	private String comment;
	
	public Reviews() {
		// JPA required :)
	}

	public Reviews(User revieweR, int rating, TrainerUser revieweD, String comment) {
		this.revieweR = revieweR;
		this.rating = rating;
		this.revieweD = revieweD;
		this.comment = comment;
	}
}
