package com.telefonica.gal.dynamicconf.spain.td.routing.dto;

public class RoutingKey_SPAIN_TD {

    private String operationTD;

    public RoutingKey_SPAIN_TD(String operationTD) {
        this.operationTD = operationTD;
    }

    public String getOperationTD() {
        return operationTD;
    }

    public void setOperationTD(String operationTD) {
        this.operationTD = operationTD;
    }

    @Override
    public String toString() {
        return "RoutingKey_SPAIN_TD{" +
                "operationTD='" + operationTD + '\'' +
                '}';
    }
}
