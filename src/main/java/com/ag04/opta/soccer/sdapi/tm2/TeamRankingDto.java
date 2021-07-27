package com.ag04.opta.soccer.sdapi.tm2;

import java.io.Serializable;

public class TeamRankingDto implements Serializable {
    Integer rank;
    /**
     * Promotion | Promotion Play-off | Relegation | Relegation Play-off |
     * UEFA Champions League | UEFA Europa League
     */
    String rankStatus;
    String rankId;
    String contestantId;
    String contestantName;
    String contestantShortName;
    String contestantClubName;
    String contestantCode;
    Integer points;
    Integer matchesPlayed;
    Integer matchesWon;
    Integer matchesLost;
    Integer matchesDrawn;
    Integer goalsFor;
    Integer goalsAgainst;
    String goalDifference;
    String goaldifference;
    /**
     * string using following values: D (draw) | L (lost) | W (won)
     */
    String lastSix;

    public TeamRankingDto() {
        //
    }

    public TeamRankingDto(Integer rank, String rankStatus, String rankId, String contestantId, String contestantName,
                          String contestantShortName, String contestantClubName, String contestantCode, Integer points,
                          Integer matchesPlayed, Integer matchesWon, Integer matchesLost, Integer matchesDrawn,
                          Integer goalsFor, Integer goalsAgainst, String goalDifference, String lastSix) {
        this.rank = rank;
        this.rankStatus = rankStatus;
        this.rankId = rankId;
        this.contestantId = contestantId;
        this.contestantName = contestantName;
        this.contestantShortName = contestantShortName;
        this.contestantClubName = contestantClubName;
        this.contestantCode = contestantCode;
        this.points = points;
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDrawn = matchesDrawn;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifference = goalDifference;
        this.lastSix = lastSix;
    }

    // --- set / get methods --------------------------------------------------

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRankStatus() {
        return rankStatus;
    }

    public void setRankStatus(String rankStatus) {
        this.rankStatus = rankStatus;
    }

    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    public String getContestantId() {
        return contestantId;
    }

    public void setContestantId(String contestantId) {
        this.contestantId = contestantId;
    }

    public String getContestantName() {
        return contestantName;
    }

    public void setContestantName(String contestantName) {
        this.contestantName = contestantName;
    }

    public String getContestantShortName() {
        return contestantShortName;
    }

    public void setContestantShortName(String contestantShortName) {
        this.contestantShortName = contestantShortName;
    }

    public String getContestantClubName() {
        return contestantClubName;
    }

    public void setContestantClubName(String contestantClubName) {
        this.contestantClubName = contestantClubName;
    }

    public String getContestantCode() {
        return contestantCode;
    }

    public void setContestantCode(String contestantCode) {
        this.contestantCode = contestantCode;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(Integer matchesWon) {
        this.matchesWon = matchesWon;
    }

    public Integer getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(Integer matchesLost) {
        this.matchesLost = matchesLost;
    }

    public Integer getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(Integer matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public String getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(String goalDifference) {
        this.goalDifference = goalDifference;
    }

    public String getLastSix() {
        return lastSix;
    }

    public void setLastSix(String lastSix) {
        this.lastSix = lastSix;
    }

    //--- there is a defference between opta docs and actual response in this field:

    public String getGoaldifference() {
        return goaldifference;
    }

    public void setGoaldifference(String goaldifference) {
        this.goaldifference = goaldifference;
    }

    //--- toString -------

    @Override
    public String toString() {
        return "TeamRankingDto{" + " rank=" + rank + ", rankStatus='" + rankStatus + "', rankId='" + rankId +
            "', contestantId='" + contestantId + ", contestantName='" + contestantName + "', contestantShortName='" +
            contestantShortName + "', contestantClubName='" + contestantClubName + "', contestantCode='" +
            contestantCode + "', points=" + points + ", matchesPlayed=" + matchesPlayed + ", matchesWon=" + matchesWon +
            ", matchesLost=" + matchesLost + ", matchesDrawn=" + matchesDrawn + ", goalsFor=" + goalsFor +
            ", goalsAgainst=" + goalsAgainst + ", goalDifference='" + goalDifference + "', lastSix='" + lastSix + "'}";
    }
}
