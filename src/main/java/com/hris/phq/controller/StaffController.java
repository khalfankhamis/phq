package com.hris.phq.controller;

import com.hris.phq.model.Staff;
import com.hris.phq.services.StaffServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/staff")
@CrossOrigin("*")
public class StaffController {
    @Autowired
    public StaffServices staffServ;

    @PostMapping
    public Staff addStaff(@RequestBody Staff staff){
        return staffServ.addStaff(staff);
    }
    @GetMapping
    public List<Staff> getAllStaff(){
        return staffServ.getAllStaff();
    }
    @GetMapping("/{force_number}")

    public Optional<Staff> getStaffById(@PathVariable String force_number ) {
        return staffServ.getStaffById(force_number);
    }



    @DeleteMapping("/{force_number}")
    public void deleteStaff(@PathVariable String force_number){
        staffServ.deleteStaff(force_number);
    }

    @PutMapping("/{force_number}")
    public Staff updateStaff(@RequestBody Staff staff,@PathVariable String force_number){
        staff.setForce_number(force_number);
        return staffServ.addStaff(staff);
    }
}
