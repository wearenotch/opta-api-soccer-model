package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;

public class RulesetDto implements Serializable {
    String id;
    String name;

    public RulesetDto() {
        //
    }

    public RulesetDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

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
        return "RulesetDto{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
