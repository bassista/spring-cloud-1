package org.gradle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationServer.class).web(true).run(args);
    }

}
