package com.ag04.opta.soccer.sddp.ma3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Marko Štefančić, AG04 on 19.01.2021..
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OptaEvent implements Serializable {

    private Long id;
    private int seqId = 0;
    private int eventId;
    private int typeId;
    private Integer periodId;
    private Integer timeMin;
    private Integer timeSec;
    private int keyPass;
    private String contestantId;
    private String kitColour;
    private int outcome;
    private double x;
    private double y;
    private String playerId;
    private String playerName;
    private List<OptaQualifier> qualifier;
    private Date timeStamp;
    private Date lastModified;

    //--- util methods -------------------------------------------------------

    public String shortInfo() {
        return String.format("[%d] (%d:%d) eventId=%d | typeId=%d | team: %s | player: %s / %s", seqId, timeMin, timeSec, eventId, typeId, contestantId, playerId, playerName);
    }

    public OptaQualifier getByQualifierId(int qualifierId) {
        for (OptaQualifier q : qualifier) {
            if (q.getQualifierId() == qualifierId) {
                return q;
            }
        }
        return null;
    }

    /**
     * Searches for qualifier with newQualifier.getQualiferId() and replaces it with the supplied one.
     * 
     */
    public void replaceQualifier(OptaQualifier newQualifier) {
        List<OptaQualifier> newList = new ArrayList<>();
        for (OptaQualifier q : qualifier) {
            if (q.getQualifierId() ==  newQualifier.getQualifierId()) {
                newList.add(newQualifier);
            } else {
                newList.add(q);
            }
        }
        this.qualifier =  newList;
    }

    //--- set / get methods ---------------------------------------------------

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getSeqId() {
        return seqId;
    }
    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }
    public int getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
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
    public Integer getTimeSec() {
        return timeSec;
    }
    public void setTimeSec(Integer timeSec) {
        this.timeSec = timeSec;
    }
    public int getKeyPass() {
        return keyPass;
    }
    public void setKeyPass(int keyPass) {
        this.keyPass = keyPass;
    }
    public String getContestantId() {
        return contestantId;
    }
    public void setContestantId(String contestantId) {
        this.contestantId = contestantId;
    }
    public String getKitColour() {
        return kitColour;
    }
    public void setKitColour(String kitColour) {
        this.kitColour = kitColour;
    }
    public int getOutcome() {
        return outcome;
    }
    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public Date getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    public Date getLastModified() {
        return lastModified;
    }
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    public List<OptaQualifier> getQualifier() {
        return qualifier;
    }
    public void setQualifier(List<OptaQualifier> qualifier) {
        this.qualifier = qualifier;
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
  

}
