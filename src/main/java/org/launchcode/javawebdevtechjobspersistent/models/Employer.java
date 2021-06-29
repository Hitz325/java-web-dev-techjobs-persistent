package org.launchcode.javawebdevtechjobspersistent.models;

import jdk.jfr.DataAmount;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min = 3, max = 150, message = "location must be between 3 and 150 characters long")
    private String location;

//    @ManyToOne
//    private Employer employer;

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
