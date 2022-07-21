package com.example.portfolioMedina.repository;

import com.example.portfolioMedina.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
