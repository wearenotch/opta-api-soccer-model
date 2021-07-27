package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;

import com.ag04.opta.soccer.sdapi.match.MatchDetailsDto;

/**
 * Extended by:
 *  - MA2/LiveDataDto
 *  - MA3/LiveDataEventsDto
 * 
 */
public class BaseLiveDataDto implements Serializable  {
    
    protected MatchDetailsDto matchDetails = new MatchDetailsDto();

    public MatchDetailsDto getMatchDetails() {
        return matchDetails;
    }

    public void setMatchDetails(MatchDetailsDto matchDetails) {
        this.matchDetails = matchDetails;
    }

}
