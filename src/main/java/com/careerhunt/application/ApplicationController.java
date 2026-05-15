package com.careerhunt.application;

import com.careerhunt.application.dto.ApplicationCreateRequest;
import com.careerhunt.application.dto.ApplicationResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public ResponseEntity<ApplicationResponse> createApplication(@Valid @RequestBody ApplicationCreateRequest applicationCreateRequest) {
        ApplicationResponse response = applicationService.createApplication(applicationCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<ApplicationResponse>> getApplications() {
        List<ApplicationResponse> responses = applicationService.getAllApplications();
        return ResponseEntity.status(HttpStatus.OK).body(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationResponse> getApplicationById(@PathVariable Long id) {
        ApplicationResponse response = applicationService.getApplicationById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ApplicationResponse> deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplicationById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
