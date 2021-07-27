package com.ag04.opta.soccer.sdapi.ma2;

import com.ag04.opta.soccer.sdapi.BasePerson;

public class TeamOfficialDto extends BasePerson {
    private String id;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TeamOfficialDto [id=" + id + 
            ", firstName=" + firstName + 
            ", lastName=" + lastName +
            ", type=" + type + 
            "]";
    }

    
}
