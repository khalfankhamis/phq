package com.hris.phq.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Region {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer region_id;
    public String region_name;
}
