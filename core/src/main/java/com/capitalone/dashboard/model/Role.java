package com.capitalone.dashboard.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;


import javax.annotation.Nonnull;
import java.util.Date;

@Document(collection = "roles")
public class Role {

    @Id
    String name;

    String description ;
    String createdBy;
    Date createdOn ;
    boolean active = true ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (active != role.active) return false;
        if (!name.equals(role.name)) return false;
        if (description != null ? !description.equals(role.description) : role.description != null) return false;
        if (createdBy != null ? !createdBy.equals(role.createdBy) : role.createdBy != null) return false;
        return !(createdOn != null ? !createdOn.equals(role.createdOn) : role.createdOn != null);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        return result;
    }
}
