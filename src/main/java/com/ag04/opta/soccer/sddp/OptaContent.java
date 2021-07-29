package com.ag04.opta.soccer.sddp;

import java.io.Serializable;

/**
 * 
 * M - specific feed MatchDetails implementation ie. MA2, MA3 ...
 */
public class OptaContent<M> implements Serializable {
    protected OptaLiveData<M> liveData;

    public OptaContent() {
        // default constructor ...
    }

    public OptaContent(OptaLiveData<M> liveData) {
        this.liveData = liveData;
    }

    // --- set / get methods --------------------------------------------------

    public OptaLiveData<M> getLiveData() {
        return liveData;
    }

    public void setLiveData(OptaLiveData<M> liveData) {
        this.liveData = liveData;
    }
}
