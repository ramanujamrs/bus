package com.ramanujamrs.busorama.bus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String busName;

    public Bus() {
        super();
    }

    public Bus(Long id, String busName, String busType, String active, Timestamp createdAt, Timestamp modifiedAt) {
        this.id = id;
        this.busName = busName;
        this.busType = busType;
        this.active = active;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    private String busType;
    private String active;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
}
