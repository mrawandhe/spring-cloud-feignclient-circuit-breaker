package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PatientRecord;
import com.example.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	PatientService service;

	@GetMapping("/{id}")
	public ResponseEntity<PatientRecord> getPetienRecords(@PathVariable Long id) {
		PatientRecord empList = service.getPatientDetails(id);
		return ResponseEntity.ok(empList);
	}

}
