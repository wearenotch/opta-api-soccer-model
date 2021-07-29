package com.ag04.opta.soccer.sdapi.pe7;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.ag04.opta.soccer.sdapi.OptaCompetitionDto;
import com.ag04.opta.soccer.sdapi.TournamentCalendarDto;

/**
 * 
 * @author iraguz
 */
public class PE7FeedResponse implements Serializable {
    private OptaCompetitionDto competition;
    private TournamentCalendarDto tournamentCalendar;
    private List<PersonDto> person;
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

    public List<PersonDto> getPerson() {
        return person;
    }

    public void setPerson(List<PersonDto> person) {
        this.person = person;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
