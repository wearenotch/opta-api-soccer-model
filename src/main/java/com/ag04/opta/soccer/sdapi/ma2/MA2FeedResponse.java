package com.ag04.opta.soccer.sdapi.ma2;

import java.io.Serializable;

import com.ag04.opta.soccer.sdapi.BaseLiveDataDto;
import com.ag04.opta.soccer.sdapi.match.MatchInfoDto;

public class MA2FeedResponse implements Serializable {
    private MatchInfoDto matchInfo;
    private BaseLiveDataDto liveData;

    public MatchInfoDto getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfoDto matchInfo) {
        this.matchInfo = matchInfo;
    }

    public BaseLiveDataDto getLiveData() {
        return liveData;
    }

    public void setLiveData(BaseLiveDataDto liveData) {
        this.liveData = liveData;
    }

}
