package com.example.todolist.common.log;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;

/**
 * Created by timxia on 2017/4/4.
 */
public class RequestPatternLayoutEncoder extends PatternLayoutEncoder {

    public static final String REQUEST_PATTERN = "reqId";

    public void start() {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.getDefaultConverterMap().put(REQUEST_PATTERN, ReqIdConverter.class.getName());
        patternLayout.setContext(context);
        patternLayout.setPattern(getPattern());
        patternLayout.setOutputPatternAsHeader(outputPatternAsHeader);
        patternLayout.start();
        this.layout = patternLayout;
        this.started = true;
    }
}