package com.careerhunt.application.dto;

import com.careerhunt.application.ApplicationStatus;
import com.careerhunt.application.SalaryPeriod;

import java.time.Instant;
import java.time.LocalDate;

public record ApplicationResponse (
    Long id,
    String company,
    String position,
    ApplicationStatus status,
    LocalDate appliedDate,
    String jobUrl,
    String location,
    String notes,
    Integer salaryMin,
    Integer salaryMax,
    String salaryCurrency,
    SalaryPeriod salaryPeriod,
    String source,
    Instant createdAt,
    Instant updatedAt
) {}
