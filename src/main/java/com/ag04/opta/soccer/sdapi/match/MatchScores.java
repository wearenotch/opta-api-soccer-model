package com.ag04.opta.soccer.sdapi.match;

public class MatchScores {
    PeriodScore ht = new PeriodScore();
    PeriodScore ft = new PeriodScore();
    PeriodScore total = new PeriodScore();

    public PeriodScore getHt() {
        return ht;
    }

    public void setHt(PeriodScore ht) {
        this.ht = ht;
    }

    public PeriodScore getFt() {
        return ft;
    }

    public void setFt(PeriodScore ft) {
        this.ft = ft;
    }

    public PeriodScore getTotal() {
        return total;
    }

    public void setTotal(PeriodScore total) {
        this.total = total;
    }

}
