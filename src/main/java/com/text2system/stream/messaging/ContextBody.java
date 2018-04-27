package com.text2system.stream.messaging;

public class ContextBody {
    public String from;
    public String context;
    public String timestamp;

    public ContextBody(String from, String context, String Timestamp) {
        this.from = from;
        this.context = context;
        this.timestamp = Timestamp;
    }
}
