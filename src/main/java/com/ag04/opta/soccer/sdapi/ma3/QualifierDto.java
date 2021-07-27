package com.ag04.opta.soccer.sdapi.ma3;

import java.io.Serializable;

/**
 * 
 */
public class QualifierDto implements Serializable {
    Long id;
    Long qualifierId;
    String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQualifierId() {
        return qualifierId;
    }

    public void setQualifierId(Long qualifierId) {
        this.qualifierId = qualifierId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "QualifierDto [id=" + id + ", qualifierId=" + qualifierId + ", value=" + value + "]";
    }

    
}
