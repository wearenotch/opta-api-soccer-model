package com.ag04.opta.soccer.sdapi.match;

public class MatchCompetition {
    String id;
    String name;
    String competitionCode;
    String competitionFormat;
    MatchCountryDto country = new MatchCountryDto();

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

    public String getCompetitionCode() {
        return competitionCode;
    }

    public void setCompetitionCode(String competitionCode) {
        this.competitionCode = competitionCode;
    }

    public String getCompetitionFormat() {
        return competitionFormat;
    }

    public void setCompetitionFormat(String competitionFormat) {
        this.competitionFormat = competitionFormat;
    }

    public MatchCountryDto getCountry() {
        return country;
    }

    public void setCountry(MatchCountryDto country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "MatchCompetition [competitionCode=" + competitionCode + ", competitionFormat=" + competitionFormat
                + ", id=" + id + ", name=" + name + ", country=" + country + "]";
    }
    
}
