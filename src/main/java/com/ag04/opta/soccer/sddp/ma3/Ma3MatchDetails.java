package com.ag04.opta.soccer.sddp.ma3;

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

    public OptaEvent[] getEvent() {
        return event;
    }

    public void setEvent(OptaEvent[] event) {
        this.event = event;
    }

    public OptaEvent getOneEvent() {
        return event[0];
    }
    
    public OptaEvent[] getEvents() {
        return event;
    }
    
}
