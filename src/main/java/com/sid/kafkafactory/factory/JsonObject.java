package com.sid.kafkafactory.factory;

import org.apache.kafka.common.protocol.types.Field;

import java.io.Serializable;

public class JsonObject  {
    String data ;

    public JsonObject() {

    }
    public JsonObject(String data) {
        this.data = data;
    }
}
