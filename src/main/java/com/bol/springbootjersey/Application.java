package com.bol.springbootjersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Bean
    public ServletRegistrationBean jaxRs1() {
        final ResourceConfig config = new ResourceConfig();
        config.registerClasses(JaxRsController1.class);
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(config));
        registration.addUrlMappings("/jax-rs1/*");
        registration.setName("JaxRs1");
        registration.setLoadOnStartup(0);
        return registration;
    }

    @Bean
    public ServletRegistrationBean jaxRs2() {
        final ResourceConfig config = new ResourceConfig();
        config.registerClasses(JaxRsController2.class);
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(config));
        registration.addUrlMappings("/jax-rs2/*");
        registration.setName("JaxRs2");
        registration.setLoadOnStartup(1);
        return registration;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
