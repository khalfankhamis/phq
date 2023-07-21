package com.hris.phq.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity @NoArgsConstructor @AllArgsConstructor
public class EducationLevel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public  String educationLevel;
}
