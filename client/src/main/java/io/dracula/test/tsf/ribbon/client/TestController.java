package io.dracula.test.tsf.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dk
 */
@RestController
public class TestController {

    @Autowired
    private ToServerService toServerService;

    @GetMapping("feign")
    public String feign(){
        return toServerService.sayHello();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("rest")
    public String rest(){
        return restTemplate.getForObject("http://test-server/hello", String.class);
    }

}
