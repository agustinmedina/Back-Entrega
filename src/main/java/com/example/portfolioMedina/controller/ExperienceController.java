package com.example.portfolioMedina.controller;

import com.example.portfolioMedina.domain.Experience;
import com.example.portfolioMedina.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/experience")
public class ExperienceController {
    @Autowired
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public ResponseEntity<List<Experience>> getAllExperience(){
        List<Experience> experiences=experienceService.findAllExperience();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Experience> addExperience(@RequestBody Experience experience){
        Experience newExperience=experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience){
        Experience updateExperience=experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id){
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}