package com.ag04.opta.soccer.sdapi.ma1;

import java.io.Serializable;

import com.ag04.opta.soccer.sdapi.BaseLiveDataDto;
import com.ag04.opta.soccer.sdapi.match.MatchInfoDto;

public class MatchDto implements Serializable {
    
    public MatchInfoDto matchInfo = new MatchInfoDto();

    public BaseLiveDataDto liveData = new BaseLiveDataDto();

	//--- set / get methods ---------------------------------------------------

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
