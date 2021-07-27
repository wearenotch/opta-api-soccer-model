package com.ag04.opta.soccer.sdapi.pe4;

import com.ag04.opta.soccer.sdapi.OptaCompetitionDto;
import com.ag04.opta.soccer.sdapi.TournamentCalendarDto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class PE4FeedResponse implements Serializable {

    private OptaCompetitionDto competition;
    private TournamentCalendarDto tournamentCalendar;
    private List<TeamDto> team;
    private LocalDateTime lastUpdated;

    public OptaCompetitionDto getCompetition() {
        return competition;
    }

    public void setCompetition(OptaCompetitionDto competition) {
        this.competition = competition;
    }

    public TournamentCalendarDto getTournamentCalendar() {
        return tournamentCalendar;
    }

    public void setTournamentCalendar(TournamentCalendarDto tournamentCalendar) {
        this.tournamentCalendar = tournamentCalendar;
    }

    public List<TeamDto> getTeam() {
        return team;
    }

    public void setTeam(List<TeamDto> team) {
        this.team = team;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
