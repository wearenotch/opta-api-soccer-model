package com.ag04.opta.soccer.sdapi.ma2;

import java.io.Serializable;

import com.ag04.opta.soccer.sdapi.match.MatchInfoDto;

public class MA2FeedResponse implements Serializable {
    private MatchInfoDto matchInfo;
    private LiveDataDto liveData;

    public MatchInfoDto getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfoDto matchInfo) {
        this.matchInfo = matchInfo;
    }

    public LiveDataDto getLiveData() {
        return liveData;
    }

    public void setLiveData(LiveDataDto liveData) {
        this.liveData = liveData;
    }

}
