package com.example.todolist.common.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.example.todolist.common.RequestContext;

/**
 * Created by timxia on 2017/4/4.
 */
public class ReqIdConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        String id = RequestContext.getContext().getId();
        return id == null ? "---" : id;
    }
}
