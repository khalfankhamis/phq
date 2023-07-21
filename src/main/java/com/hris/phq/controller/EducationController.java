package com.hris.phq.controller;

import com.hris.phq.model.EducationLevel;
import com.hris.phq.services.EducationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/education")
@CrossOrigin("*")
public class EducationController {
    @Autowired
    public EducationServices educationServices;
    @PostMapping
    public EducationLevel addLevel(@RequestBody EducationLevel educationLevel){
        return educationServices.addLevel(educationLevel);
    }

    @GetMapping
    public List<EducationLevel> getAllLevel(){
        return educationServices.getAllLevel();
    }

    @GetMapping("/{id}")
    public Optional<EducationLevel> getLevelById(@PathVariable Long id){
        return  educationServices.getLevelById(id);
    }

    @PutMapping
    public EducationLevel addLevel(@RequestBody EducationLevel educationLevel,@PathVariable Long id){
        educationLevel.setId(id);
        return educationServices.addLevel(educationLevel);
    }
    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        educationServices.deleteMe(id);
    }




    }
