package com.SpringJpa.JpaDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by melayer on 23/9/17.
 */
@Entity
public class Empolyee {
    
    @Id
    Integer id;
    String name;
    String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
