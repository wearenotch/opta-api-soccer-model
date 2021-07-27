package com.ag04.opta.soccer.sdapi.match;

import java.time.ZonedDateTime;

public class MatchPeriod {
    Integer id;
    ZonedDateTime start;
    ZonedDateTime end;
    Integer lengthMin;
    Integer lengthSec;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ZonedDateTime getStart() {
        return start;
    }

    public void setStart(ZonedDateTime start) {
        this.start = start;
    }

    public ZonedDateTime getEnd() {
        return end;
    }

    public void setEnd(ZonedDateTime end) {
        this.end = end;
    }

    public Integer getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(Integer lengthMin) {
        this.lengthMin = lengthMin;
    }

    public Integer getLengthSec() {
        return lengthSec;
    }

    public void setLengthSec(Integer lengthSec) {
        this.lengthSec = lengthSec;
    }

    @Override
    public String toString() {
        return "MatchPeriod [end=" + end + ", id=" + id + ", lengthMin=" + lengthMin + ", lengthSec=" + lengthSec
                + ", start=" + start + "]";
    }
    
}
