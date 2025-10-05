package com.example.external;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.dto.PatientScan;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScanServiceFallback implements ScanServiceClient {

    @Override
    public List<PatientScan> getScansByPatientId(Long patientId) {
    	log.error("Fallback triggered for patientId={}, after retries. Cause: {}", patientId);
        return Collections.singletonList(
            new PatientScan(
                "N/A",
                "N/A",
                LocalDateTime.now(),
                "Scan service unavailable — showing cached/placeholder data"
            )
        );
    }
    
}
