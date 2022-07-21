package com.example.portfolioMedina.controller;

import com.example.portfolioMedina.domain.Education;
import com.example.portfolioMedina.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")

public class EducationController {

    @Autowired
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public ResponseEntity<List<Education>> getAllEducation(){
        List<Education> educations=educationService.findAllEducation();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Education> addEducation(@RequestBody Education project){
        Education newEducation=educationService.addEducation(project);
        return new ResponseEntity<>(newEducation,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Education> updateEducation(@RequestBody Education education){
        Education updateEducation=educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id){
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


