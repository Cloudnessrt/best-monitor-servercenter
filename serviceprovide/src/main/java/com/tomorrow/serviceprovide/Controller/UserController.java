package com.tomorrow.serviceprovide.Controller;

import com.tomorrow.serviceprovide.Common.UserSexEnum;
import com.tomorrow.serviceprovide.Entity.UserEntity;
import com.tomorrow.serviceprovide.Mapper.Common.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userMapper.getAll();
		return users;
	}
	
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
    	UserEntity user=userMapper.getOne(1l);
        return user;
    }
    
    @RequestMapping("/add")
    public void save(UserEntity user) {

        userMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
    }
    
    @RequestMapping(value="update")
    public void update() {
        UserEntity user=userMapper.getOne(1l);
        user.setUserName("AA");
        userMapper.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {

        userMapper.delete(1l);
    }
    
    
}