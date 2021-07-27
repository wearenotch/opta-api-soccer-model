package com.ag04.opta.soccer.sdapi.match;

import java.util.ArrayList;
import java.util.List;

public class MatchDetailsDto {
    Integer periodId;
    String matchStatus;
    String winner;
    Integer matchLengthMin;
    Integer matchLengthSec;
    List<MatchPeriod> period = new ArrayList<>();
    MatchScores scores = new MatchScores();

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Integer getMatchLengthMin() {
        return matchLengthMin;
    }

    public void setMatchLengthMin(Integer matchLengthMin) {
        this.matchLengthMin = matchLengthMin;
    }

    public Integer getMatchLengthSec() {
        return matchLengthSec;
    }

    public void setMatchLengthSec(Integer matchLengthSec) {
        this.matchLengthSec = matchLengthSec;
    }

    public List<MatchPeriod> getPeriod() {
        return period;
    }

    public void setPeriod(List<MatchPeriod> period) {
        this.period = period;
    }

    public MatchScores getScores() {
        return scores;
    }

    public void setScores(MatchScores scores) {
        this.scores = scores;
    }

}
