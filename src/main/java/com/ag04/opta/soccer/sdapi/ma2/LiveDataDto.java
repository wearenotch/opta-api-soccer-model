package com.ag04.opta.soccer.sdapi.ma2;

import java.util.List;

import com.ag04.opta.soccer.sdapi.BaseLiveDataDto;

public class LiveDataDto extends BaseLiveDataDto {

    private List<GoalDto> goal;
    //private List<MissedPenDto> missedPen;
    private List<CardDto> card;
    private List<SubstituteDto> substitute;
    private List<LineupDto> lineUp;
    private MatchDetailsExtraDto matchDetailsExtra;

    public List<GoalDto> getGoal() {
        return goal;
    }

    public void setGoal(List<GoalDto> goal) {
        this.goal = goal;
    }

    /*
    public List<MissedPenDto> getMissedPen() {
        return missedPen;
    }

    public void setMissedPen(List<MissedPenDto> missedPen) {
        this.missedPen = missedPen;
    }

     */

    public List<CardDto> getCard() {
        return card;
    }

    public void setCard(List<CardDto> card) {
        this.card = card;
    }

    public List<SubstituteDto> getSubstitute() {
        return substitute;
    }

    public void setSubstitute(List<SubstituteDto> substitute) {
        this.substitute = substitute;
    }

    public List<LineupDto> getLineup() {
        return lineUp;
    }

    public void setLineup(List<LineupDto> lineUp) {
        this.lineUp = lineUp;
    }

    public MatchDetailsExtraDto getMatchDetailsExtra() {
        return matchDetailsExtra;
    }

    public void setMatchDetailsExtra(MatchDetailsExtraDto matchDetailsExtra) {
        this.matchDetailsExtra = matchDetailsExtra;
    }
}
