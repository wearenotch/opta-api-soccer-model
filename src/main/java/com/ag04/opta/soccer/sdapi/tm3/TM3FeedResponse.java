package com.ag04.opta.soccer.sdapi.tm3;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TM3FeedResponse implements Serializable {
    private List<SquadDto> squad = new ArrayList<>();
    private LocalDateTime lastUpdated;

    //--- set / get methods ---------------------------------------------------

    public List<SquadDto> getSquad() {
        return squad;
    }

    public void setSquad(List<SquadDto> squad) {
        this.squad = squad;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
