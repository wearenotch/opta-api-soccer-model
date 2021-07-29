package com.ag04.opta.soccer.sdapi;

/**
 * Extended by:
 *  - MA2/PlayerDto
 *  - PE7/PersonDto
 * 
 */
public class BasePlayer extends BasePerson {
    protected String matchName;
    protected Integer shirtNumber;
    protected String position;

    //--- set / get methods ---------------------------------------------------

    public String getMatchName() {
        return matchName;
    }
    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }
    public Integer getShirtNumber() {
        return shirtNumber;
    }
    public void setShirtNumber(Integer shirtNumber) {
        this.shirtNumber = shirtNumber;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "BasePlayer [firstName=" + firstName + 
            ", lastName=" + lastName + 
            ", matchName=" + matchName + 
            ", position=" + position + 
            ", shirtNumber=" + shirtNumber + 
            "]";
    }

    
}
