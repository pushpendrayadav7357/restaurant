package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String specialty;
    private int totalStaffs;

    public Restaurant(Long id, String name, String address, String specialty, int totalStaffs) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.specialty = specialty;
        this.totalStaffs = totalStaffs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }
}
