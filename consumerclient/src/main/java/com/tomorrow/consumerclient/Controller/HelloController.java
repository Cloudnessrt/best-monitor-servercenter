package com.tomorrow.consumerclient.Controller;

import com.tomorrow.consumerclient.VO.User;
import com.tomorrow.consumerclient.Service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    IHelloService iHelloService;

    @RequestMapping(value = "/hi1",method = RequestMethod.GET)
    public String hi1(@RequestParam(value = "name") String name){
        return iHelloService.hi1(name);
    }

    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    public User hi2(@RequestParam(value = "name") String name){
        User a=  iHelloService.hi2("name",11);
        return a;
    }

    @RequestMapping(value = "/hi3",method = RequestMethod.GET)
    public String hi3(@RequestParam(value = "name") String name){
        return iHelloService.hi3(new User("name",12));
    }
}
