package com.ag04.opta.soccer.sddp;

import java.io.Serializable;

/**
 * Top Level element of push api hierarchy.
 * M - specific MatchDetails implementation.
 * 
 */
public class OptaData<M> implements Serializable {
    protected OptaContent<M> content;

    public OptaData() {
        // default constructor ...
    }

    public OptaData(OptaContent<M> content) {
        this.content = content;
    }

    public OptaContent<M> getContent() {
        return content;
    }

    public void setContent(OptaContent<M> content) {
        this.content = content;
    }

}
