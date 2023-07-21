package com.hris.phq.services;

import com.hris.phq.model.EducationLevel;
import com.hris.phq.model.Rank;
import com.hris.phq.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class EducationServices {
    @Autowired
    public EducationRepository educationRepository;
    public EducationLevel addLevel(EducationLevel educationLevel){
        return educationRepository.save(educationLevel);
    }
    public List<EducationLevel> getAllLevel(){
        return educationRepository.findAll();
    }
    public Optional<EducationLevel> getLevelById(Long id){
        return educationRepository.findById(id);
    }
    public void deleteMe(Long id){
        educationRepository.deleteById(id);
    }
}
