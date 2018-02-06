package com.tomorrow.serviceprovide.Service;

import com.tomorrow.serviceprovide.Entity.UserEntity;
import com.tomorrow.serviceprovide.Mapper.Common.UserMapper;
import com.tomorrow.serviceprovide.VO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloProvide {

    @Autowired
    private UserMapper userMapper;

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/hi1",method = RequestMethod.GET)
    public String hi1(@RequestParam String name) {
        List<UserEntity> users=userMapper.getAll();
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
