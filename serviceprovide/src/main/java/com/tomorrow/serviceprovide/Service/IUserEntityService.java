package com.tomorrow.serviceprovide.Service;

import com.github.pagehelper.Page;
import com.tomorrow.serviceprovide.Entity.UserEntity;

/**
 * 用户接口
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-18
 **/
public interface IUserEntityService {
    public Page<UserEntity> getList(int currentPage, int pageSize, UserEntity userEntity);
}
