package com.ag04.opta.soccer.sdapi.ma2;

import java.util.List;

public class MatchDetailsExtraDto {
    private String attendance;
    private List<MatchOfficialDto> matchOfficial;

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public List<MatchOfficialDto> getMatchOfficial() {
        return matchOfficial;
    }

    public void setMatchOfficial(List<MatchOfficialDto> matchOfficial) {
        this.matchOfficial = matchOfficial;
    }
}
