package com.example.portfolioMedina.service;


import com.example.portfolioMedina.domain.Experience;
import com.example.portfolioMedina.repository.ExperienceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Experience addExperience(Experience experience){
        return experienceRepository.save(experience);
    }

    public Experience updateExperience(Experience experience){
        return experienceRepository.save(experience);
    }

    public List<Experience> findAllExperience(){
        return experienceRepository.findAll();
    }

    public void deleteExperience(long id){
        experienceRepository.deleteById(id);
    }
}


