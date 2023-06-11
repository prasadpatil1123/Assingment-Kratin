package com.kashi.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Alert {
	
	@Id
	private int id;
	private String userId;
	private String alertType;
	private String frequency;

}
