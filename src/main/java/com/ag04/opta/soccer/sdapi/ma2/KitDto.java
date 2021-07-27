package com.ag04.opta.soccer.sdapi.ma2;

import java.io.Serializable;

public class KitDto implements Serializable {
    private String id;
    private String colour1;
    private String colour2;
    private String type;

    //--- set / get methods ---------------------------------------------------

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getColour1() {
        return colour1;
    }
    public void setColour1(String colour1) {
        this.colour1 = colour1;
    }
    public String getColour2() {
        return colour2;
    }
    public void setColour2(String colour2) {
        this.colour2 = colour2;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
