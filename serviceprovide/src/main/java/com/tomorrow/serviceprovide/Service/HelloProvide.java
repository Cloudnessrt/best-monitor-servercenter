package com.futurn.serviceprovide_1.Service;

import com.futurn.serviceprovide_1.VO.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloProvide {

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/hi1",method = RequestMethod.GET)
    public String hi1(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    public User hi2(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name,age);
    }

    @RequestMapping(value = "/hi3",method = RequestMethod.POST)
    public String hi3(@RequestBody User user) {
        return user.getName();
    }
}
