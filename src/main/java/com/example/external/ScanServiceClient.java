package com.example.external;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.dto.PatientScan;

@FeignClient(name = "scan-service", url = "${scan.service.url}",
			fallback = ScanServiceFallback.class )
public interface ScanServiceClient {

    @GetMapping("/api/scan/{patientId}")
    List<PatientScan> getScansByPatientId(@PathVariable("patientId") Long patientId);
    
}

