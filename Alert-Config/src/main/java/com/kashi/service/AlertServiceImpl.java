package com.kashi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kashi.models.Alert;
import com.kashi.repo.AlertRepository;

@Service
public class AlertServiceImpl implements AlertService {

	@Autowired
	private AlertRepository repository;
	
	@Override
	public Alert saveAlert(Alert alert) {
		return repository.save(alert);
	}

	@Override
	public List<Alert> getAllAlerts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	

}
