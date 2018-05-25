package com.tomorrow.serviceprovide.Service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tomorrow.serviceprovide.Dao.Mapper.Common.UserMapper;
import com.tomorrow.serviceprovide.Entity.UserEntity;
import com.tomorrow.serviceprovide.Service.IUserEntityService;
import com.tomorrow.serviceprovide.VO.Common.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

/**
 * 用户实现
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-18
 **/
@Service
public class UserEntityService implements IUserEntityService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JedisCluster jedisCluster;

    public Page<UserEntity> getList(int currentPage, int pageSize, UserEntity userEntity){
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(1, 10);
        Page<UserEntity> pageData =userMapper.getAll();
        PageInfo<UserEntity> pageInfo = new PageInfo<>(pageData);
        jedisCluster.set("1","1");
        jedisCluster.set("2","2");
        jedisCluster.set("3","3");
        jedisCluster.set("4","4");
        jedisCluster.set("5","5");
        jedisCluster.set("6","6");

        String a=jedisCluster.get("1");
        a=jedisCluster.get("2");
        a=jedisCluster.get("3");
        a=jedisCluster.get("4");
        a=jedisCluster.get("5");
        a=jedisCluster.get("6");
        return pageData;
    }

    private void getCurrentUserInfo(){
        
    }
}
