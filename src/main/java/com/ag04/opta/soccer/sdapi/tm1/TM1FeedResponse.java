package com.ag04.opta.soccer.sdapi.tm1;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.ag04.opta.soccer.sdapi.ContestantDto;

public class TM1FeedResponse implements Serializable {
    private List<ContestantDto> contestant;
    private LocalDateTime lastUpdated;

    public List<ContestantDto> getContestant() {
        return contestant;
    }

    public void setContestant(List<ContestantDto> contestant) {
        this.contestant = contestant;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
