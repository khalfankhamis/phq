package com.hris.phq.controller;

import com.hris.phq.model.Rank;
import com.hris.phq.services.RankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @RequestMapping("api/v1/rank")
@CrossOrigin("*")
public class RankController {
    @Autowired
    public RankServices rankServices;

    @PostMapping
    public Rank addRank(@RequestBody Rank rank){
        return rankServices.addRank(rank);
    }
    @GetMapping
    public List<Rank> getAllRank(){
        return rankServices.getAllRank();
    }
    @GetMapping("/{id}")
    public Optional<Rank> getRankById(@PathVariable Long id){
        return rankServices.getRankById(id);
    }
    @PutMapping
    public Rank addRank(@RequestBody Rank rank,@PathVariable Long id){
        rank.setId(rank.id);
        return rankServices.addRank(rank);
    }
    @DeleteMapping("/{id}")
    public  void deleteRank(@PathVariable Long id){
        rankServices.deleteRank(id);
    }
}
