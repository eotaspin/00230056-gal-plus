package com.telefonica.gal.configuration;

import com.telefonica.gal.servicesConsolidation.request.SERVICESCONSOLIDATIONREQUEST;
import org.apache.logging.log4j.message.Message;
import org.json.JSONObject;

import java.util.HashMap;

public class ConsolidationServiceMessage implements Message {

    private static final String TYPE = "type";
    private static final String BODY = "body";

    private final SERVICESCONSOLIDATIONREQUEST requestBody;

    public ConsolidationServiceMessage(SERVICESCONSOLIDATIONREQUEST requestBody) {
        this.requestBody = requestBody;
    }

    @Override
    public String getFormattedMessage() {
        JSONObject jsonBody = new JSONObject(requestBody);
        JSONObject jsonToLog = new JSONObject(new HashMap<String, Object>() {{
            put(TYPE, "messageRequest");
            put(BODY, jsonBody);
        }});

        return jsonToLog.toString();
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public Object[] getParameters() {
        return new Object[0];
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }
}
