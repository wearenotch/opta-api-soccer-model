package com.ag04.opta.soccer.sdapi.tm2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TeamDivisionDto implements Serializable {
    /**
     * total | home | away | form-total | form-home | form-away |
     * half-time-total | half-time-home | half-time-away |
     * attendance | over-under
     */
    String type;
    List<TeamRankingDto> ranking = new ArrayList<>();

    public TeamDivisionDto() {
        //
    }

    public TeamDivisionDto(String type, List<TeamRankingDto> ranking) {
        this.type = type;
        this.ranking = ranking;
    }

    // --- set / get methods --------------------------------------------------

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TeamRankingDto> getRanking() {
        return ranking;
    }

    public void setRanking(List<TeamRankingDto> ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "TeamDivisionDto{" + "type='" + type + ", ranking=" + ranking.toString() + '}';
    }
}
