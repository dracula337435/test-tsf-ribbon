package io.dracula.test.tsf.ribbon.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.tsf.annotation.EnableTsf;
import org.springframework.web.client.RestTemplate;

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

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
