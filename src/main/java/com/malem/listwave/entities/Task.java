package com.malem.listwave.entities;


import jakarta.persistence.*;


public class Task {

    private Long id;
    private String description;
    private String status;

    public Task() { }


    public Task(Long id, String description, String status)
    {
        this.id = id;
        this.description = description;
        this.status = status;
    }



    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}
}
