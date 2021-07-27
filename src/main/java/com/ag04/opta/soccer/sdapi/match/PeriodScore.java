package com.ag04.opta.soccer.sdapi.match;

public class PeriodScore {
    Integer home;
    Integer away;

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getAway() {
        return away;
    }

    public void setAway(Integer away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return "PeriodScore [away=" + away + ", home=" + home + "]";
    }

}
