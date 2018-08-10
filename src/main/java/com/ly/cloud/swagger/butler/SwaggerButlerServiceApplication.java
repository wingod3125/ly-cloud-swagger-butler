package com.ly.cloud.swagger.butler;

import com.didispace.swagger.butler.EnableSwaggerButler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * Description:
 * @author wanggang
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwaggerButler
public class SwaggerButlerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerButlerServiceApplication.class, args);
    }
}
