package com.hris.phq.controller;

import com.hris.phq.model.Region;
import com.hris.phq.services.RegionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/region")
@CrossOrigin("*")
public class RegionController {
    @Autowired
    public RegionServices regionServices;

    @PostMapping
    public Region addRegion(@RequestBody Region region){
        return regionServices.addRegion(region);
    }
    @GetMapping
    public List<Region> getAll(){
        return regionServices.getAll();
    }

    @GetMapping("/calculate-staff-in-region/{region_id}")
    public int calculateStaffInRegion(@PathVariable Integer region_id){
        return regionServices.calculateStaffInRegion(region_id);
    }
    @GetMapping("/{region_id}")
    public Optional<Region> getById(@PathVariable Integer region_id ){
        return regionServices.getById(region_id);
    }
    @DeleteMapping("/{region_id}")
    public void deleteMe(@PathVariable Integer region_id ){
        regionServices.deleteMe((region_id));
    }
    @PutMapping("/{region_id}")
    public Region updateRegion(@RequestBody Region region,@PathVariable Integer region_id ){
        region.setRegion_id(region_id);
        return regionServices.addRegion(region);
    }
    }
