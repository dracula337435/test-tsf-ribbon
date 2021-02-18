package io.dracula.test.tsf.ribbon.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.tsf.annotation.EnableTsf;

/**
 * @author dk
 */
@EnableTsf
@SpringBootApplication
public class TestTsfRibbonServerMainApp {

    public static void main(String[] args){
        SpringApplication.run(TestTsfRibbonServerMainApp.class, args);
    }

}
