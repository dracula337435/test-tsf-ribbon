package io.dracula.test.tsf.ribbon.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.tsf.annotation.EnableTsf;

/**
 * @author dk
 */
@EnableFeignClients
@EnableTsf
@SpringBootApplication
public class TestTsfRibbonClientMainApp {

    public static void main(String[] args){
        SpringApplication.run(TestTsfRibbonClientMainApp.class, args);
    }

}
