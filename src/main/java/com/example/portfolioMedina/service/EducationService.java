package com.example.portfolioMedina.service;

import com.example.portfolioMedina.domain.Education;
import com.example.portfolioMedina.repository.EducationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService {
    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public Education addEducation(Education education){
        return educationRepository.save(education);
    }
    public Education updateEducation(Education education){
        return educationRepository.save(education);
    }
    public List<Education> findAllEducation(){
        return educationRepository.findAll();
    }
    public void deleteEducation(Long id){
        educationRepository.deleteById(id);
    }
}

