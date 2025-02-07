package org.launchcode.javawebdevtechjobspersistent.models;

import jdk.jfr.DataAmount;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min = 3, max = 150, message = "location must be between 3 and 150 characters long")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> job = new ArrayList<>();

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {this.location = location;}

}
