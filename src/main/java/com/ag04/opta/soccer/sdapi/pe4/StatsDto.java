package com.ag04.opta.soccer.sdapi.pe4;

import java.io.Serializable;

public class StatsDto implements Serializable {

    private String type;
    private String value;

    public StatsDto() {
    }

    public StatsDto(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StatsDto{" + "type='" + type + ", value='" + value + '}';
    }
}
