package com.ag04.opta.soccer.sdapi.match;

public class VenueDto {
    String id;
    String neutral;
    String longName;
    String shortName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeutral() {
        return neutral;
    }

    public void setNeutral(String neutral) {
        this.neutral = neutral;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "VenueDto [id=" + id + ", longName=" + longName + ", neutral=" + neutral + ", shortName=" + shortName
                + "]";
    }
    
}
