package com.ag04.opta.soccer.sdapi.ma2;

import java.util.List;

import com.ag04.opta.soccer.sdapi.BasePlayer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerDto extends BasePlayer {
    private String playerId;
     private String positionSide;
    private String subPosition;
    private String formationPlace;
    private List<PlayerStatDto> stat;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public String getSubPosition() {
        return subPosition;
    }

    public void setSubPosition(String subPosition) {
        this.subPosition = subPosition;
    }

    public String getFormationPlace() {
        return formationPlace;
    }

    public void setFormationPlace(String formationPlace) {
        this.formationPlace = formationPlace;
    }

    public List<PlayerStatDto> getStat() {
        return stat;
    }

    public void setStat(List<PlayerStatDto> stat) {
        this.stat = stat;
    }
}
