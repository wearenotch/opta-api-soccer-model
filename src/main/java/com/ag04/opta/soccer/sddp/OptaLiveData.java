package com.ag04.opta.soccer.sddp;

import java.io.Serializable;

/**
 * 
 */
public class OptaLiveData<M> implements Serializable {
    /**
     * Each feed should have its own implementation of MatchDetails.
     * 
     */
    M matchDetails;

    public OptaLiveData() {
        // default constructor ...
    }

    public OptaLiveData(M matchDetails) {
        this.matchDetails = matchDetails;
    }

    //--- set / get methods ---------------------------------------------------

    public M getMatchDetails() {
        return matchDetails;
    }

    public void setMatchDetails(M matchDetails) {
        this.matchDetails = matchDetails;
    }

}
