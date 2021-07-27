package com.ag04.opta.soccer.sdapi.ma2;

import java.io.Serializable;

public class PlayerStatDto implements Serializable {
    private String type;
    private String value;

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
}
