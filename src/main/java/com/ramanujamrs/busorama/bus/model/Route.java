/*
 * @author Ramanujam Srinivasan
 * @created_on 06-21-2020
 */

package com.ramanujamrs.busorama.bus.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "route")
public class Route
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String routeName;
    private String routeDescription;
    private String active;
    private Timestamp createdAt;
    private Timestamp modifiedAt;

    public Route()
    {
        super();
    }

    public Route(Long id, String routeName, String routeDescription, String active, Timestamp createdAt, Timestamp modifiedAt) {
        this.id = id;
        this.routeName = routeName;
        this.routeDescription = routeDescription;
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

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteDescription() {
        return routeDescription;
    }

    public void setRouteDescription(String routeDescription) {
        this.routeDescription = routeDescription;
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
}
