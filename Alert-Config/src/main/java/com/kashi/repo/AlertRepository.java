package com.kashi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kashi.models.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Integer>{

}
