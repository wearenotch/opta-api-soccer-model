package com.ag04.opta.soccer.sdapi.ma2;

import java.io.Serializable;

public class TeamStatDto implements Serializable {
    private Number fh;
    private Number sh;
    private Number efh;
    private Number esh;
    private String type;
    private Number value;

    public Number getFh() {
        return fh;
    }

    public void setFh(Number fh) {
        this.fh = fh;
    }

    public Number getSh() {
        return sh;
    }

    public void setSh(Number sh) {
        this.sh = sh;
    }

    public Number getEfh() {
        return efh;
    }

    public void setEfh(Number efh) {
        this.efh = efh;
    }

    public Number getEsh() {
        return esh;
    }

    public void setEsh(Number esh) {
        this.esh = esh;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }
}
