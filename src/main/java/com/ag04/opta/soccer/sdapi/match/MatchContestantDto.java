package com.ag04.opta.soccer.sdapi.match;

import com.ag04.opta.soccer.sdapi.BaseContestant;

public class MatchContestantDto extends BaseContestant {
   
    String position;
    MatchCountryDto country = new MatchCountryDto();

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public MatchCountryDto getCountry() {
        return country;
    }

    public void setCountry(MatchCountryDto country) {
        this.country = country;
    }

}
