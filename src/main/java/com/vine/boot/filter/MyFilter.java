package com.vine.boot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * servlet测试
 *
 * @author cao
 * @date 2020-07-14 5:18 PM
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("---------myFilter");
        chain.doFilter(request, response);
    }
}
