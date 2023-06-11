package com.kashi.service;

import java.util.List;

import com.kashi.models.Alert;

public interface AlertService {

	Alert saveAlert(Alert alert);
	List<Alert> getAllAlerts();
}
