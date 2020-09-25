package es.toni.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2ConsoleConfig {
	
    @Bean
    public ServletRegistrationBean h2Console() {
        String path = "/h2-console";
        String urlMapping = (path.endsWith("/") ? path + "*" : path + "/*");
        return new ServletRegistrationBean(new WebServlet(), urlMapping);
    }
}