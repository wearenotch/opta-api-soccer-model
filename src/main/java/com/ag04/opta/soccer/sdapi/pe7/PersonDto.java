package com.ag04.opta.soccer.sdapi.pe7;

import java.util.List;

import com.ag04.opta.soccer.sdapi.BasePlayer;

/**
 * 
 * @author iraguz
 */
public class PersonDto extends BasePlayer {
    private String id;
    private String ocId;
    private String opId;
    private String type;
    private List<InjuryDto> injury;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOcId() {
        return ocId;
    }

    public void setOcId(String ocId) {
        this.ocId = ocId;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<InjuryDto> getInjury() {
        return injury;
    }

    public void setInjury(List<InjuryDto> injury) {
        this.injury = injury;
    }
}
