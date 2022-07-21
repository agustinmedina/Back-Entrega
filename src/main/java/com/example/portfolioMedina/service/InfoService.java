package com.example.portfolioMedina.service;

import com.example.portfolioMedina.domain.Info;
import com.example.portfolioMedina.exception.UserNotFoundException;
import com.example.portfolioMedina.repository.InfoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InfoService { private final InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public Info addInfo(Info info){
        return infoRepository.save(info);
    }
    public Info updateInfo(Info info){
        return infoRepository.save(info);
    }
    public Info findInfoById(Long id){
        return (Info) infoRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
    public void deleteInfo(Long id){
        infoRepository.deleteById(id);
    }
}