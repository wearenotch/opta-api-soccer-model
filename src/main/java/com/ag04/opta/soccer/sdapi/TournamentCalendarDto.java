package com.ag04.opta.soccer.sdapi;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TournamentCalendarDto implements Serializable {
    String id;
    String ocId;
    String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
    LocalDate startDate; // "2021-09-24Z",

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
    LocalDate endDate; // "2021-10-16Z",

    String active;
    ZonedDateTime lastUpdated;
    String includesVenues;
    String includesStandings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIncludesVenues() {
        return includesVenues;
    }

    public void setIncludesVenues(String includesVenues) {
        this.includesVenues = includesVenues;
    }

    public String getOcId() {
        return ocId;
    }

    public void setOcId(String ocId) {
        this.ocId = ocId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getIncludesStandings() {
        return includesStandings;
    }

    public void setIncludesStandings(String includesStandings) {
        this.includesStandings = includesStandings;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TournamentCalendarDto [active=" + active + ", endDate=" + endDate + ", id=" + id
                + ", includesStandings=" + includesStandings + ", includesVenues=" + includesVenues + ", lastUpdated="
                + lastUpdated + ", name=" + name + ", ocId=" + ocId + ", startDate=" + startDate + "]";
    }
}
