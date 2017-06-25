package com.example.todolist.common;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by timxia on 2017/4/4.
 */
public class RequestFilter implements Filter {
    public static final String REQUEST_HEADER_NAME = "X-REQUEST-UUID";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String id = httpServletRequest.getHeader(REQUEST_HEADER_NAME);

        if (id == null || "".equals(id)) {
            id = UUID.randomUUID().toString();
        }

        RequestContext.getContext().setId(id);

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
