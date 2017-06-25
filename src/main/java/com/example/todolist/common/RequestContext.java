package com.example.todolist.common;

/**
 * Created by timxia on 2017/4/4.
 */
public class RequestContext {
    private static final ThreadLocal<RequestContext> CONTEXT = new ThreadLocal<>();

    private String id;

    public static RequestContext getContext() {
        RequestContext result = CONTEXT.get();

        if (result == null) {
            result = new RequestContext();
            CONTEXT.set(result);
        }

        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
