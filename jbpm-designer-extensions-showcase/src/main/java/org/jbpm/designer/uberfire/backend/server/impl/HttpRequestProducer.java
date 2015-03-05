package org.jbpm.designer.uberfire.backend.server.impl;

import java.io.IOException;

import javax.enterprise.inject.Produces;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class HttpRequestProducer implements Filter {
    private static ThreadLocal<HttpServletRequest> requests=new ThreadLocal<HttpServletRequest>();
    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
        try{
            requests.set((HttpServletRequest) arg0);
            arg2.doFilter(arg0, arg1);
        }finally{
            requests.set(null);
        }

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }
    @Produces
    public HttpServletRequest getCurrentRequest(){
        return requests.get();
    }

}
