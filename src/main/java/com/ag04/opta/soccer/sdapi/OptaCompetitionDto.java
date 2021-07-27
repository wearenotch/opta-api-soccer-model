package com.ag04.opta.soccer.sdapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OptaCompetitionDto extends CompetitionDto {
    String competitionCode;
    String displayOrder;
    String country;
    String countryId;
    String countryCode;
    String isFriendly;
    String competitionFormat;
    String type;
    List<TournamentCalendarDto> tournamentCalendar = new ArrayList<>();
   
    public String getCompetitionCode() {
        return competitionCode;
    }

    public void setCompetitionCode(String competitionCode) {
        this.competitionCode = competitionCode;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIsFriendly() {
        return isFriendly;
    }

    public void setIsFriendly(String isFriendly) {
        this.isFriendly = isFriendly;
    }

    public String getCompetitionFormat() {
        return competitionFormat;
    }

    public void setCompetitionFormat(String competitionFormat) {
        this.competitionFormat = competitionFormat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TournamentCalendarDto> getTournamentCalendar() {
        return tournamentCalendar;
    }

    public void setTournamentCalendar(List<TournamentCalendarDto> tournamentCalendar) {
        this.tournamentCalendar = tournamentCalendar;
    }

    @Override
    public String toString() {
        return "OptaCompetitionDto{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", ocId='" + getOcId() + "'" +
            ", competitionCode='" + getCompetitionCode() + "'" +
            ", country='" + getCountry() + "'" +
            ", countryId='" + getCountryId() + "'" +
            ", countryCode='" + getCountryCode() + "'" +
            ", competitionFormat='" + getCompetitionFormat() + "'" +
            ", type='" + getType() + "'" +
            ", isFriendly='" + getIsFriendly() + "'" +
            ", displayOrder='" + getDisplayOrder() + "'" +
            "}";
    }
}

