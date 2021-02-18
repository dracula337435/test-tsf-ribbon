package io.dracula.test.tsf.ribbon.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }

}
