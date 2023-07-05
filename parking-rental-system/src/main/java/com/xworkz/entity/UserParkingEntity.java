package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="userparking_details")
public class UserParkingEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int parkingId;
	
	private int userId;
	
	private String location;

	private String vtype;

	private String vclassification;

	private String term;

	private int price;

	private String discount;
	
	private int totalAmount;
	
	/*
	 * @Id private int id;
	 * 
	 * @Column(name = "userId_fk") private int userId; private String location;
	 * private String vehicleNo; private String vehicleType; //private String
	 * engineType; private String classification; private String term; private int
	 * price; private String discount; private int totalAmount;
	 */
}
