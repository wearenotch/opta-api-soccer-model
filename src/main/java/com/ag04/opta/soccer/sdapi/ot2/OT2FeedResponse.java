package com.ag04.opta.soccer.sdapi.ot2;

import java.time.LocalDateTime;
import java.util.List;

import com.ag04.opta.soccer.sdapi.OptaCompetitionDto;

public class OT2FeedResponse {

    private List<OptaCompetitionDto> competition;
    private LocalDateTime lastUpdated;

    public List<OptaCompetitionDto> getCompetition() {
        return competition;
    }

    public void setCompetition(List<OptaCompetitionDto> competition) {
        this.competition = competition;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
