package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="SKILL_TYPE")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class SkillType {

	@Id
	@GeneratedValue(generator="skill_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="skill_seq", allocationSize=1, initialValue=1)
	@Column(name="TYPE_ID")
	private int id;
	
	@Column(name=("SKILL_NAME"))
	private String type;

	public SkillType(String type) {
		super();
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SkillType [id=" + id + ", type=" + type + "]";
	}
	
	
}
