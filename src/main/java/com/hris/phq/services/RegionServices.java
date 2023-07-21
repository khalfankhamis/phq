package com.hris.phq.services;

import com.hris.phq.model.Region;
import com.hris.phq.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionServices {
    @Autowired
    public RegionRepository regionRepository;

    public Region addRegion(Region region){
        return regionRepository.save(region);
    }
    public List<Region> getAll(){
        return regionRepository.findAll();
    }
    public Optional<Region> getById(Integer region_id ){
        return regionRepository.findById(region_id);
    }
    public void deleteMe(Integer region_id ){
        regionRepository.deleteById(region_id);
    }
}
