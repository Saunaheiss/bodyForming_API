package com.tobias.bodyForming.Domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	private Long id;
	
	@Column(name = "create_at", nullable = true)
	private LocalDateTime dateCreated;
	
	@ManyToOne(optional=false)
	private User revieweR;
	
	@Column(name = "rating", nullable = true, length = 1)
	private int rating;
	
	@ManyToOne(optional=false)
//	@Column(name = "revieweD")
	private TrainerUser revieweD;
	
	@Column(name = "comment", nullable = true, length = 1000)
	private String comment;
	
	public Reviews() {
		// JPA required :)
	}

	public Reviews(User revieweR, int rating, TrainerUser revieweD, String comment) {
		super();
		this.revieweR = revieweR;
		this.rating = rating;
		this.revieweD = revieweD;
		this.comment = comment;
	}
}
