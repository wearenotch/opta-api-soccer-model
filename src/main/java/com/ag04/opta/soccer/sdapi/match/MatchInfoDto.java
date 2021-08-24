package com.ag04.opta.soccer.sdapi.match;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ag04.opta.soccer.sdapi.RulesetDto;
import com.ag04.opta.soccer.sdapi.SportDto;
import com.ag04.opta.soccer.sdapi.StageDto;
import com.ag04.opta.soccer.sdapi.TournamentCalendarDto;


public class MatchInfoDto implements Serializable {
    String id;
    
    Integer coverageLevel;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
    String date;

    //"18:30:00Z"
    String time;

    Integer week;
    
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ssZ")
    ZonedDateTime lastUpdated;
    
    String description;

    SportDto sport = new SportDto();

    RulesetDto ruleset = new RulesetDto();
    
    MatchCompetition competition = new MatchCompetition();

    TournamentCalendarDto tournamentCalendar = new TournamentCalendarDto();

    List<MatchContestantDto> contestant = new ArrayList<>();

    VenueDto venue = new VenueDto();

    StageDto stage = new StageDto();

    public MatchContestantDto getContestantByPosition(String position) {
        for (MatchContestantDto c : contestant) {
            if (position.equalsIgnoreCase(c.getPosition())) {
                return c;
            }
        }
        // none found
        MatchContestantDto mc = new MatchContestantDto();
        mc.setPosition(position);
        contestant.add(mc);
        return mc;
    }

    //--- set / get methods ---------------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCoverageLevel() {
        return coverageLevel;
    }

    public void setCoverageLevel(Integer coverageLevel) {
        this.coverageLevel = coverageLevel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public MatchCompetition getCompetition() {
        return competition;
    }

    public void setCompetition(MatchCompetition competition) {
        this.competition = competition;
    }

    public TournamentCalendarDto getTournamentCalendar() {
        return tournamentCalendar;
    }

    public void setTournamentCalendar(TournamentCalendarDto tournamentCalendar) {
        this.tournamentCalendar = tournamentCalendar;
    }

    public List<MatchContestantDto> getContestant() {
        return contestant;
    }

    public void setContestant(List<MatchContestantDto> contestant) {
        this.contestant = contestant;
    }

    public VenueDto getVenue() {
        return venue;
    }

    public void setVenue(VenueDto venue) {
        this.venue = venue;
    }

    public StageDto getStage() {
        return stage;
    }

    public void setStage(StageDto stage) {
        this.stage = stage;
    }

}
