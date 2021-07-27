package com.ag04.opta.soccer.sdapi.ma2;

import java.time.ZonedDateTime;

public class GoalDto {
    private String type;
    private String scorerId;
    private String scorerName;
    private String assistPlayerId;
    private String assistPlayerName;
    private String optaEventId;
    private Integer homeScore;
    private Integer awayScore;
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

    public String getScorerId() {
        return scorerId;
    }

    public void setScorerId(String scorerId) {
        this.scorerId = scorerId;
    }

    public String getScorerName() {
        return scorerName;
    }

    public void setScorerName(String scorerName) {
        this.scorerName = scorerName;
    }

    public String getAssistPlayerId() {
        return assistPlayerId;
    }

    public void setAssistPlayerId(String assistPlayerId) {
        this.assistPlayerId = assistPlayerId;
    }

    public String getAssistPlayerName() {
        return assistPlayerName;
    }

    public void setAssistPlayerName(String assistPlayerName) {
        this.assistPlayerName = assistPlayerName;
    }

    public String getOptaEventId() {
        return optaEventId;
    }

    public void setOptaEventId(String optaEventId) {
        this.optaEventId = optaEventId;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
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
