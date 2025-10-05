package com.example.service;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.PatientRecord;
import com.example.dto.PatientScan;
import com.example.external.ScanServiceClient;

@Service
public class PatientService {

	@Autowired
    private ScanServiceClient scanServiceClient;

    public PatientRecord getPatientDetails(Long patientId) {
    	PatientRecord patient = patients.stream().filter(p-> p.id().equals(patientId)).findAny()
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        List<PatientScan> scans = scanServiceClient.getScansByPatientId(patientId);
        patient = patient.toBuilder().scans(scans).build();
        return patient;
    }


	List<PatientRecord> patients = List.of(
			new PatientRecord(1L, "Rahul Sharma", 34, "Mumbai", "Male", LocalDateTime.of(2025, 9, 10, 14, 30), null),
			new PatientRecord(2L, "Sneha Iyer", 28, "Bangalore", "Female", LocalDateTime.of(2025, 9, 22, 11, 20), null),
			new PatientRecord(3L, "Vikram Singh", 46, "Delhi", "Male", LocalDateTime.of(2025, 8, 25, 10, 0), null),
			new PatientRecord(4L, "Ananya Patel", 39, "Ahmedabad", "Female", LocalDateTime.of(2025, 9, 30, 9, 15), null),
			new PatientRecord(5L, "Rohit Verma", 52, "Pune", "Male", LocalDateTime.of(2025, 7, 10, 10, 45), null));

}

