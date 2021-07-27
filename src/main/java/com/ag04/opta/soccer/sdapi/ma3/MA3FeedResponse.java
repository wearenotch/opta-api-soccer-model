package com.ag04.opta.soccer.sdapi.ma3;

import java.io.Serializable;

import com.ag04.opta.soccer.sdapi.match.MatchInfoDto;

public class MA3FeedResponse implements Serializable {
    private MatchInfoDto matchInfo;
    private LiveDataEventsDto liveData;

    public MatchInfoDto getMatchInfoDto() {
        return matchInfo;
    }

    public void setMatchInfoDto(MatchInfoDto matchInfo) {
        this.matchInfo = matchInfo;
    }

    public LiveDataEventsDto getLiveData() {
        return liveData;
    }

    public void setLiveDataEventsDto(LiveDataEventsDto liveData) {
        this.liveData = liveData;
    }
}
