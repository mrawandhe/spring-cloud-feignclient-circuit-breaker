package com.example.dto;

import java.time.LocalDateTime;
import lombok.Builder;

@Builder(toBuilder = true)
public record PatientScan(String scanType,
		String scanCenter,
		LocalDateTime scanDate,
		String diagnosisSummary) {
}
