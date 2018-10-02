package com.pk.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private int classification;
    private boolean isOpen;

    public Hotel(){

    }

    public Hotel(String name,int classification,boolean isOpen){
        this.name=name;
        this.classification=classification;
        this.isOpen=isOpen;
    }
}
