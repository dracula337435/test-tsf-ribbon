package io.dracula.test.tsf.ribbon.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("test-server")
public interface ToServerService {

    @GetMapping("hello")
    String sayHello();

}
