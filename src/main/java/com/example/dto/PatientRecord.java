package com.example.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;

@Builder(toBuilder = true)
public record PatientRecord (Long id,
		String petientName,
		int age,
		String city,
		String gender,
		LocalDateTime lastCheckupDate,
		List<PatientScan> scans) {
};
