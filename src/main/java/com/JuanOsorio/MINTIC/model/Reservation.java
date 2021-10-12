package com.JuanOsorio.MINTIC.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name="client_id")
	private Client clientId;
	@OneToOne
	@JoinColumn(name="room_id")
	private Room roomId;
	@Column(name="status")
	private String status;
	@Column(name="creation_date")
	private Date creationDate;
	@Column(name="deliver_date")
	private Date deliverDate;
	
}
