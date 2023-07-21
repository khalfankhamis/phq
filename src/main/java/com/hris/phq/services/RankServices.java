package com.hris.phq.services;

import com.hris.phq.model.Rank;
import com.hris.phq.model.Staff;
import com.hris.phq.repository.RankRepository;
import com.hris.phq.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RankServices {
    @Autowired
    public RankRepository rankRepository;
    @Autowired
    public StaffRepository staffRepository;

    public  Rank addRank(Rank rank){
        return rankRepository.save(rank);
    }
    public List<Rank> getAllRank(){
        return rankRepository.findAll();
    }
    public Optional<Rank> getRankById(Long Rank){
        return rankRepository.findById(Rank);
    }

    public  void deleteRank(Long id){
        rankRepository.deleteById(id);
    }

}
