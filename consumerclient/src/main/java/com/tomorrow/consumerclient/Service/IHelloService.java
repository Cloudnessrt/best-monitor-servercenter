package com.tomorrow.consumerclient.Service;

import com.tomorrow.consumerclient.VO.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "serviceprovide")
public interface IHelloService {

    @RequestMapping(value = "/hi1",method = RequestMethod.GET)
    public String hi1(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    public User hi2(@RequestHeader(value = "name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hi3",method = RequestMethod.POST)
    public String hi3(@RequestBody User user);
}
