package com.careerhunt.application;

import com.careerhunt.application.dto.ApplicationCreateRequest;
import com.careerhunt.application.dto.ApplicationResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;

@Component
public class ApplicationMapper {

    public Application toEntity(ApplicationCreateRequest applicationCreateRequest) {

        ApplicationStatus statusToUse = Objects.requireNonNullElse(
                applicationCreateRequest.getStatus(),
                ApplicationStatus.APPLIED
        );

        LocalDate dateToUse = Objects.requireNonNullElse(
                applicationCreateRequest.getAppliedDate(),
                LocalDate.now()
        );

        Application application = new Application();
        application.setCompany(applicationCreateRequest.getCompany());
        application.setPosition(applicationCreateRequest.getPosition());
        application.setStatus(statusToUse);
        application.setAppliedDate(dateToUse);
        application.setJobUrl(applicationCreateRequest.getJobUrl());
        application.setLocation(applicationCreateRequest.getLocation());
        application.setNotes(applicationCreateRequest.getNotes());
        application.setSalaryMin(applicationCreateRequest.getSalaryMin());
        application.setSalaryMax(applicationCreateRequest.getSalaryMax());
        application.setSalaryCurrency(applicationCreateRequest.getSalaryCurrency());
        application.setSalaryPeriod(applicationCreateRequest.getSalaryPeriod());
        application.setSource(applicationCreateRequest.getSource());

        return application;
    }

    public ApplicationResponse toResponse(Application application) {
        return new ApplicationResponse(application.getId(),
                application.getCompany(),
                application.getPosition(),
                application.getStatus(),
                application.getAppliedDate(),
                application.getJobUrl(),
                application.getLocation(),
                application.getNotes(),
                application.getSalaryMin(),
                application.getSalaryMax(),
                application.getSalaryCurrency(),
                application.getSalaryPeriod(),
                application.getSource(),
                application.getCreatedAt(),
                application.getUpdatedAt());
    }



}
