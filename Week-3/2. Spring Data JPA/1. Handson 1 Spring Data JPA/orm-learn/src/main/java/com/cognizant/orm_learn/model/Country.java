package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Country")
public class Country {

    @Id
    @Column(name="code")
    private String id;

    @Column(name="name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name =  name;
    }

    @Override
    public String toString() {
        return "Country{" +
                    "id=" + id +
                    ", name ='" + name + '\'' +
                '}';
    }
}
