package com.ag04.opta.soccer.sdapi.ma2;

import java.io.Serializable;
import java.util.List;

public class LineupDto implements Serializable {
    private String contestantId;
    private String formationUsed;
    private List<PlayerDto> player;
    private TeamOfficialDto teamOfficial;
    private List<TeamStatDto> stat;
    private KitDto kit;

    public String getContestantId() {
        return contestantId;
    }

    public void setContestantId(String contestantId) {
        this.contestantId = contestantId;
    }

    public String getFormationUsed() {
        return formationUsed;
    }

    public void setFormationUsed(String formationUsed) {
        this.formationUsed = formationUsed;
    }

    public List<PlayerDto> getPlayer() {
        return player;
    }

    public void setPlayer(List<PlayerDto> player) {
        this.player = player;
    }

    public TeamOfficialDto getTeamOfficial() {
        return teamOfficial;
    }

    public void setTeamOfficial(TeamOfficialDto teamOfficial) {
        this.teamOfficial = teamOfficial;
    }

    public List<TeamStatDto> getStat() {
        return stat;
    }

    public void setStat(List<TeamStatDto> stat) {
        this.stat = stat;
    }

    public KitDto getKit() {
        return kit;
    }

    public void setKit(KitDto kit) {
        this.kit = kit;
    }
}
