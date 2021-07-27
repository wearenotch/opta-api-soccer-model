package com.ag04.opta.soccer.sdapi.tm2;

import com.ag04.opta.soccer.sdapi.CompetitionDto;
import com.ag04.opta.soccer.sdapi.RulesetDto;
import com.ag04.opta.soccer.sdapi.SportDto;
import com.ag04.opta.soccer.sdapi.TournamentCalendarDto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TM2FeedResponse implements Serializable {
    SportDto sport = new SportDto();
    RulesetDto ruleset = new RulesetDto();
    CompetitionDto competition = new CompetitionDto();
    TournamentCalendarDto tournamentCalendar = new TournamentCalendarDto();
    List<TeamStageDto> stage = new ArrayList<>();
    LocalDateTime lastUpdated;

    public SportDto getSport() {
        return sport;
    }

    public void setSport(SportDto sport) {
        this.sport = sport;
    }

    public RulesetDto getRuleset() {
        return ruleset;
    }

    public void setRuleset(RulesetDto ruleset) {
        this.ruleset = ruleset;
    }

    public CompetitionDto getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionDto competition) {
        this.competition = competition;
    }

    public TournamentCalendarDto getTournamentCalendar() {
        return tournamentCalendar;
    }

    public void setTournamentCalendar(TournamentCalendarDto tournamentCalendar) {
        this.tournamentCalendar = tournamentCalendar;
    }

    public List<TeamStageDto> getStage() {
        return stage;
    }

    public void setStage(List<TeamStageDto> stage) {
        this.stage = stage;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "TM2FeedResponse{" +
            "sport=" + sport +
            ", ruleset=" + ruleset +
            ", competition=" + competition +
            ", tournamentCalendar=" + tournamentCalendar +
            ", stage=" + stage +
            ", lastUpdated=" + lastUpdated +
            '}';
    }
}
