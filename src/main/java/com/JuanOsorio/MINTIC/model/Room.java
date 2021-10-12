package com.JuanOsorio.MINTIC.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Room")
public class Room implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="room")
	private String room;
	@Column(name="stars")
	private Integer stars;
	@Column(name="description")
	private String description;
	@OneToOne
	@JoinColumn(name="category")
	private Category category;
	
}
