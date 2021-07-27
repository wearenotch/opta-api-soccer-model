package com.ag04.opta.soccer;

public class OptaApiConstants {
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String TEAM_DEFUNCT = "defunct";
    public static final String PLAYER_TYPE = "player";

    // Player Statistics and Rankings feed
    public static final String GOALS = "total goals";
    public static final String GOALS_RANK = "total goals ranking";
    public static final String ASSISTS = "total assists";
    public static final String ASSISTS_RANK = "total assists ranking";
    public static final String SHOTS_ON_TARGET = "total ontarget attempt";
    public static final String SHOTS_ON_TARGET_RANK = "total ontarget attempt ranking";
    public static final String TOUCHES = "total touches in opposition box";
    public static final String TOUCHES_RANK = "total touches in opposition box ranking";
    public static final String ACCURATE_PASSES = "total accurate pass";
    public static final String ACCURATE_PASSES_RANK = "total accurate pass ranking";
    public static final String TOTAL_PASSES = "total pass";
    public static final String TOTAL_PASSES_RANK = "total pass ranking";
    public static final String LOST_DUELS = "total duels lost";
    public static final String LOST_DUELS_RANK = "total duels lost ranking";
    public static final String WON_DUELS = "total duels won";
    public static final String WON_DUELS_RANK = "total duels won ranking";
    public static final String FOULS = "total fouls";
    public static final String FOULS_RANK = "total fouls ranking";
    public static final String BLOCKED_SHOTS = "total blocked scoring att";
    public static final String BLOCKED_SHOTS_RANK = "total blocked scoring att ranking";
    public static final String TOTAL_TACKLES = "total tackle";
    public static final String TOTAL_TACKLES_RANK = "total tackle ranking";
    public static final String WON_TACKLES = "total won tackle";
    public static final String WON_TACKLES_RANK = "total won tackle ranking";
    public static final String CATCHES = "total good high claim";
    public static final String CATCHES_RANK = "total good high claim ranking";
    public static final String SAVES = "total saves";
    public static final String SAVES_RANK = "total saves ranking";
    public static final String CLEAN_SHEETS = "total clean sheet";
    public static final String CLEAN_SHEETS_RANK = "total clean sheet ranking";
    public static final String GOALS_CONCEDED = "total goals conceded";
    public static final String GOALS_CONCEDED_RANK = "total goals conceded ranking";
    public static final String PLAYED_MATCHES = "total games";
    public static final String PLAYED_MATCHES_RANK = "total games ranking";
    public static final String TOTAL_MINUTES = "total mins played";
    public static final String TOTAL_MINUTES_RANK = "total mins played ranking";
    public static final String SUBBED_ON = "total sub on";
    public static final String SUBBED_ON_RANK = "total sub on ranking";
    public static final String SUBBED_OFF = "total sub off";
    public static final String SUBBED_OFF_RANK = "total sub off ranking";

    public static Boolean toBoolean(String val) {
        if (YES.equals(val)) {
            return true;
        } else if (NO.equals(val)) {
            return false;
        }
        return null;
    }
}
