package com.jiujiangwebinfo.demo1.util;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class JsonValueProcessorImpl implements JsonValueProcessor {
    private String format ="yyyy-MM-dd HH:mm:ss";

    public JsonValueProcessorImpl() {

    }

    public JsonValueProcessorImpl(String format) {
        this.format = format;
    }

    @Override
    public Object processArrayValue(Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    @Override
    public Object processObjectValue(String s, Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    private Object process(Object value){
        return null;
    }
}
