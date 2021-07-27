package com.ag04.opta.soccer.sdapi.pe4;

import java.io.Serializable;
import java.util.List;

public class TeamDto implements Serializable {

    private String id;
    private String name;
    private List<PlayerDto> player;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PlayerDto> getPlayer() {
        return player;
    }

    public void setPlayer(List<PlayerDto> player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "TeamDto [id=" + id + ", name=" + name + ", player=" + player + "]";
    }

}
