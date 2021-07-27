package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;

/**
 * Extended by:
 * - BasePlayerDto 
 * - MA2/MatchOfficalDto
 * - MA2/TeamOfficialDto
 *  
 * @author
 */
public abstract class BasePerson implements Serializable {
    protected String firstName;
    protected String lastName;

    //--- set / get methods ---------------------------------------------------

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "BasePerson [firstName=" + firstName + ", lastName=" + lastName + "]";
    }  

}
