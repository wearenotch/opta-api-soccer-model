package com.ag04.opta.soccer.sddp.ma3;

import java.io.Serializable;

/**
 * @author Marko Štefančić, AG04 on 19.01.2021..
 */
public class OptaQualifier implements Serializable {

    private Long id;
    private int qualifierId;
    private String value;
    private String opValue;
    private String detail;

    public OptaQualifier() {
        // default constructor ....
    }

    public OptaQualifier(Long id, int qualifierId, String value, String opValue, String detail) {
        this.id = id;
        this.qualifierId = qualifierId;
        this.value = value;
        this.opValue = opValue;
        this.detail = detail;
    }

    //--- set / get methods ---------------------------------------------------

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getQualifierId() {
        return qualifierId;
    }
    public void setQualifierId(int qualifierId) {
        this.qualifierId = qualifierId;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getOpValue() {
        return opValue;
    }
    public void setOpValue(String opValue) {
        this.opValue = opValue;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "OptaQualifier [id=" + id + 
            ", opValue=" + opValue + 
            ", qualifierId=" + qualifierId + 
            ", value=" + value + 
            ", detail=" + detail + 
            "]";
    }

}
