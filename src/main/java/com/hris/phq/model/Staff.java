package com.hris.phq.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Staff  {
    @Id
    public String force_number;
    @ManyToOne @JoinColumn(name = "rank_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    public Rank rank;
    public String first_name;
    public String middle_name;
    public String last_name;
    public String gender;
    public Integer check_number;
    @ManyToOne @JoinColumn(name = "id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    public EducationLevel educationLevel;
    public Date date_of_birthday;
    @ManyToOne @JoinColumn(name = "region_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    public Region region;

}
