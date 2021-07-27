package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;

/**
 * 
 */
public class SportDto implements Serializable {

    String id;
    String name;

    public SportDto() {
        //
    }

    public SportDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // --- set / get methods --------------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SportDto{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
