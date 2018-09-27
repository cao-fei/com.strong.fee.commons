package com.strong.fee.service.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * author: 小殊
 * create: 2018/9/15 下午11:57
 */
@Component
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("user", "cao-fei");
        request.setAttribute("requestId", "cao-fei");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
