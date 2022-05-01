package com.vine.boot.config;

import com.vine.boot.filter.MyFilter;
import com.vine.boot.servlet.MyServlet2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletRegistration;

/**
 * servlet配置
 *
 * @author cao
 * @date 2020-07-14 5:49 PM
 */
@Configuration
public class ServletRegistrationConfig {
    @Bean
    public ServletRegistrationBean myServlet2() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.addUrlMappings("/myServlet2");
        servletRegistrationBean.setServlet(new MyServlet2());
        return servletRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean MyFilter() {
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.addUrlPatterns("/myServlet/*");
        filterRegistration.setFilter(new MyFilter());
        return filterRegistration;
    }
}
