package com.ag04.opta.soccer.sdapi.ma2;

import java.time.ZonedDateTime;

public class CardDto {
    private String type;
    private String playerId;
    private String playerName;
    private String cardReason;
    private String optaEventId;
    private String contestantId;
    private Integer periodId;
    private Integer timeMin;
    private String timeMinSec;
    private ZonedDateTime lastUpdated;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCardReason() {
        return cardReason;
    }

    public void setCardReason(String cardReason) {
        this.cardReason = cardReason;
    }

    public String getOptaEventId() {
        return optaEventId;
    }

    public void setOptaEventId(String optaEventId) {
        this.optaEventId = optaEventId;
    }

    public String getContestantId() {
        return contestantId;
    }

    public void setContestantId(String contestantId) {
        this.contestantId = contestantId;
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
