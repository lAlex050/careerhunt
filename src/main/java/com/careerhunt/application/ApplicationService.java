package com.careerhunt.application;

import com.careerhunt.application.dto.ApplicationCreateRequest;
import com.careerhunt.application.dto.ApplicationResponse;
import com.careerhunt.exception.ApplicationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper;

    public ApplicationService(ApplicationRepository applicationRepository, ApplicationMapper applicationMapper) {
        this.applicationRepository = applicationRepository;
        this.applicationMapper = applicationMapper;
    }

    public ApplicationResponse createApplication(ApplicationCreateRequest applicationRequest) {
        Application application = applicationMapper.toEntity(applicationRequest);
        return applicationMapper.toResponse(applicationRepository.save(application));
    }

    public List<ApplicationResponse> getAllApplications() {
        List<Application> applications = applicationRepository.findAll();

        return applications.stream().map(applicationMapper::toResponse).toList();
    }

    public ApplicationResponse getApplicationById(Long id) {
        Application application = applicationRepository.findById(id)
                .orElseThrow(()-> new ApplicationNotFoundException(id));

        return applicationMapper.toResponse(application);
    }

    public void deleteApplicationById(Long id) {
        if(!applicationRepository.existsById(id)) {
            throw new ApplicationNotFoundException(id);
        }
        applicationRepository.deleteById(id);
    }

}
