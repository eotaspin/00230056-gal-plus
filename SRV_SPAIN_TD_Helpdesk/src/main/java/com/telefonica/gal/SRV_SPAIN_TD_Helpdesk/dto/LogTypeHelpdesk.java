package com.telefonica.gal.SRV_SPAIN_TD_Helpdesk.dto;

import java.io.Serializable;

public class LogTypeHelpdesk implements Serializable {
    private String system = "Funtional";
    private String type = "Error";

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
