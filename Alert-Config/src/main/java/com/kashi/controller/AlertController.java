package com.kashi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kashi.models.Alert;
import com.kashi.service.AlertServiceImpl;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class AlertController {

	@Autowired
	private AlertServiceImpl service;
	
	@PostMapping("/save/alert")
	public ResponseEntity<Alert> saveAlertForUser(@RequestBody Alert alert) {
		return new ResponseEntity<Alert>(service.saveAlert(alert), HttpStatus.OK);
	}
	
	@GetMapping("/alerts")
	public List<Alert> getAlerts() {
		
		return service.getAllAlerts();
	}
	
	
}
