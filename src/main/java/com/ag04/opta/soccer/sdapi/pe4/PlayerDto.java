package com.ag04.opta.soccer.sdapi.pe4;

import java.io.Serializable;
import java.util.List;

public class PlayerDto implements Serializable {

    private String id;
    private String name;
    private String position;
    private List<StatsDto> stat;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<StatsDto> getStat() {
        return stat;
    }

    public void setStat(List<StatsDto> stat) {
        this.stat = stat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
            "name='" + name + ", position='" + position + ", stat=" + stat + ", id='" + id + '}';
    }
}
