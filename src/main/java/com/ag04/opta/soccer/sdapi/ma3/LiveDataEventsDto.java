package com.ag04.opta.soccer.sdapi.ma3;

import java.util.ArrayList;
import java.util.List;

import com.ag04.opta.soccer.sdapi.BaseLiveDataDto;
import com.ag04.opta.soccer.sdapi.match.MatchDetailsDto;

public class LiveDataEventsDto extends BaseLiveDataDto {

    List<EventDto> event = new ArrayList<>();

    public MatchDetailsDto getMatchDetails() {
        return matchDetails;
    }

    public void setMatchDetails(MatchDetailsDto matchDetails) {
        this.matchDetails = matchDetails;
    }

    public List<EventDto> getEvent() {
        return event;
    }

    public void setEvent(List<EventDto> event) {
        this.event = event;
    }

}
