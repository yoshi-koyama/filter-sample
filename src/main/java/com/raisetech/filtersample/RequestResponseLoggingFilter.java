package com.raisetech.filtersample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class RequestResponseLoggingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);

    @Override
    public void init(final FilterConfig filterConfig) {
        logger.info("Initializing filter :{}", this);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        logger.info(
                "logging Request  {} : {}", request.getMethod(),
                request.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        logger.info(
                "logging Response :{}",
                response.getContentType());

    }

    @Override
    public void destroy() {
        logger.warn("Destructing filter :{}", this);
    }
}
