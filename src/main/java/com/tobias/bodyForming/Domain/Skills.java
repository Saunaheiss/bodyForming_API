package com.tobias.bodyForming.Domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@Table(name = "skills")
@EqualsAndHashCode(exclude = {"id"})
@ToString(exclude={"endorsedTrainer"})
public class Skills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToMany
	private List<TrainerUser> endorsedTrainer;
	
	//@OneToMany(mappedBy="jobInfo.pm") // or is this the correct one? What for jobInfo.pm?
	// @ManyToOne(optional=false)
	@ManyToMany
	private List<TrainerUser> endorsments; 
	
	@Column(name = "type", nullable = true, length = 30)
	private String type;
	
	public Skills() {
		// JPA required :)
	}

	public Skills(List<TrainerUser> endorsedTrainer, List<TrainerUser> endorsments, String type) {
		super();
		this.endorsedTrainer = endorsedTrainer;
		this.endorsments = endorsments;
		this.type = type;
	}
}
