package io.dracula.test.tsf.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class TestController {

    @Autowired
    private ToServerService toServerService;

    @GetMapping("server")
    public String toServer(){
        return toServerService.sayHello();
    }

}
