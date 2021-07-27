package com.ag04.opta.soccer.sdapi.ma1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MA1FeedResponse implements Serializable {
    
    List<MatchDto> match = new ArrayList<>();

    public List<MatchDto> getMatch() {
        return match;
    }

    public void setMatch(List<MatchDto> match) {
        this.match = match;
    }
}
