package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author dmadunic
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseContestant implements Serializable {
    protected String id;
    protected String name;
    protected String shortName;
    protected String officialName;
    protected String code;

    //--- set / get methods ---------------------------------------------------

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
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getOfficialName() {
        return officialName;
    }
    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }    
    
}
