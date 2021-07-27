package com.ag04.opta.soccer.sdapi.tm2;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeamStageDto implements Serializable {
    String id;
    String name;
    String formatId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
    LocalDate startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'Z'")
    LocalDate endDate;

    List<TeamDivisionDto> division = new ArrayList<>();

    public TeamStageDto() {
        //
    }

    public TeamStageDto(String id, String name, String formatId, LocalDate startDate, LocalDate endDate, List<TeamDivisionDto> division) {
        this.id = id;
        this.name = name;
        this.formatId = formatId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.division = division;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormatId() {
        return formatId;
    }

    public void setFormatId(String formatId) {
        this.formatId = formatId;
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

    public List<TeamDivisionDto> getDivision() {
        return division;
    }

    public void setDivision(List<TeamDivisionDto> division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "TeamStageDto{" +
            "id='" + id + ", name='" + name + ", formatId='" + formatId + ", startDate=" + startDate + ", endDate=" +
            endDate + ", divisions=" + division.toString() + '}';
    }
}

