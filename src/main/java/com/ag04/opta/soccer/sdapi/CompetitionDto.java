package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;

/**
 * Short (essence) version of the Competition.
 * 
 */
public class CompetitionDto implements Serializable {
    /**
     * Required. Unique ID (UUID) of the competition
     * String (Alphanumeric - UUID)
     */
    String id;
    /**
     * Required. Name of the competition
     */
    String name;
    /**
     * Optional. Unique ID of competition in Opta Core. Returned only if the feed is queried by Opta Core legacy ID. Empty string if the ID does not exist.
     */
    String ocId;

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

    public String getOcId() {
        return ocId;
    }

    public void setOcId(String ocId) {
        this.ocId = ocId;
    }

    @Override
    public String toString() {
        return "CompetitionDto [id=" + id + ", name=" + name + "]";
    }
}
