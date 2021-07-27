package com.ag04.opta.soccer.sdapi.tm3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SquadDto implements Serializable {
    String contestantId;
    String contestantName;
    String contestantShortName;
    String contestantClubName;
    String contestantCode;
    String tournamentCalendarId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
    LocalDate tournamentCalendarStartDate; // "2021-09-24Z";

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
    LocalDate tournamentCalendarEndDate; // "2021-10-16Z";

    String competitionName;
    String competitionId;

    String teamType;

    String venueName;
    String venueId;

    private List<PersonDto> person;

    public String getContestantId() {
        return contestantId;
    }

    public void setContestantId(String contestantId) {
        this.contestantId = contestantId;
    }

    public String getContestantName() {
        return contestantName;
    }

    public void setContestantName(String contestantName) {
        this.contestantName = contestantName;
    }

    public String getContestantShortName() {
        return contestantShortName;
    }

    public void setContestantShortName(String contestantShortName) {
        this.contestantShortName = contestantShortName;
    }

    public String getContestantClubName() {
        return contestantClubName;
    }

    public void setContestantClubName(String contestantClubName) {
        this.contestantClubName = contestantClubName;
    }

    public String getContestantCode() {
        return contestantCode;
    }

    public void setContestantCode(String contestantCode) {
        this.contestantCode = contestantCode;
    }

    public String getTournamentCalendarId() {
        return tournamentCalendarId;
    }

    public void setTournamentCalendarId(String tournamentCalendarId) {
        this.tournamentCalendarId = tournamentCalendarId;
    }

    public LocalDate getTournamentCalendarStartDate() {
        return tournamentCalendarStartDate;
    }

    public void setTournamentCalendarStartDate(LocalDate tournamentCalendarStartDate) {
        this.tournamentCalendarStartDate = tournamentCalendarStartDate;
    }

    public LocalDate getTournamentCalendarEndDate() {
        return tournamentCalendarEndDate;
    }

    public void setTournamentCalendarEndDate(LocalDate tournamentCalendarEndDate) {
        this.tournamentCalendarEndDate = tournamentCalendarEndDate;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public List<PersonDto> getPerson() {
        return person;
    }

    public void setPerson(List<PersonDto> person) {
        this.person = person;
    }
    
    public void addPerson(PersonDto personDto) {
        if (person == null) {
            person = new ArrayList<>();
        }
        person.add(personDto);
    }

    public String getTeamType() {
        return teamType;
    }

    public void setTeamType(String teamType) {
        this.teamType = teamType;
    }

}
