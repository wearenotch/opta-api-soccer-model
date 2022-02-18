package com.ag04.opta.soccer.sddp.ma3;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * MA3 Specific implementation of MatchDetails DTO.
 * 
 */
public class Ma3MatchDetails implements Serializable {
    protected String id;
    public OptaEvent[] event;
    
    public Ma3MatchDetails() {
        // default constructor ...
    }

    public Ma3MatchDetails(String id, OptaEvent[] event) {
        this.id = id;
        this.event = event;
    }

    //--- set / get methods ---------------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty
    public OptaEvent[] getEvent() {
        return event;
    }

    @JsonProperty
    public void setEvent(OptaEvent[] event) {
        this.event = event;
    }

    @JsonIgnore
    public OptaEvent getOneEvent() {
        return event != null && event.length > 0 ? event[0] : null;
    }

    @JsonIgnore
    public OptaEvent[] getEvents() {
        return event;
    }
    
}
