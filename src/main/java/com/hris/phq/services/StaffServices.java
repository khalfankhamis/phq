package com.hris.phq.services;

import com.hris.phq.model.Staff;
import com.hris.phq.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServices {
    @Autowired
    public StaffRepository staffRepo;

    public Staff addStaff(Staff staff){
        return staffRepo.save(staff);
    }

    public List<Staff> getAllStaff(){
        return staffRepo.findAll();
    }
    public Optional<Staff> getStaffById(String Staff ) {
        return staffRepo.findById(Staff);
    }
    public void deleteStaff(String Staff){
        staffRepo.deleteById(Staff);
    }
}
