package com.ag04.opta.soccer.sdapi.ma2;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * 
 * 
 */
public class SubstituteDto implements Serializable {
    private String playerOnId;
    private String playerOnName;
    private String playerOffId;
    private String playerOffName;
    private String contestantId;
    private String subReason;
    private Integer periodId;
    private Integer timeMin;
    private String timeMinSec;
    private ZonedDateTime lastUpdated;

    public String getPlayerOnId() {
        return playerOnId;
    }

    public void setPlayerOnId(String playerOnId) {
        this.playerOnId = playerOnId;
    }

    public String getPlayerOnName() {
        return playerOnName;
    }

    public void setPlayerOnName(String playerOnName) {
        this.playerOnName = playerOnName;
    }

    public String getPlayerOffId() {
        return playerOffId;
    }

    public void setPlayerOffId(String playerOffId) {
        this.playerOffId = playerOffId;
    }

    public String getPlayerOffName() {
        return playerOffName;
    }

    public void setPlayerOffName(String playerOffName) {
        this.playerOffName = playerOffName;
    }

    public String getContestantId() {
        return contestantId;
    }

    public void setContestantId(String contestantId) {
        this.contestantId = contestantId;
    }

    public String getSubReason() {
        return subReason;
    }

    public void setSubReason(String subReason) {
        this.subReason = subReason;
    }

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public Integer getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(Integer timeMin) {
        this.timeMin = timeMin;
    }

    public String getTimeMinSec() {
        return timeMinSec;
    }

    public void setTimeMinSec(String timeMinSec) {
        this.timeMinSec = timeMinSec;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
