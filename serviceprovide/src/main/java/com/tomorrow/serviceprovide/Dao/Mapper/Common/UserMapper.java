package com.tomorrow.serviceprovide.Dao.Mapper.Common;

import com.tomorrow.serviceprovide.Entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
	
	@Select("SELECT * FROM users")
	List<UserEntity> getAll();
	
	@Select("SELECT * FROM users WHERE id = #{id}")
	UserEntity getOne(Long id);

	@Insert("INSERT INTO users(id,userName,passWord,userSex,nickName,createDate,createUser,createUserName,lastChangeDate,lastChangeUser,lastChangeUserName) " +
			"VALUES(#{id},#{userName}, #{passWord}, #{userSex},#{nickName},#{createDate},#{createUser},#{createUserName},#{lastChangeDate},#{lastChangeUser},#{lastChangeUserName})")
	void insertEntity(UserEntity user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void updateEntity(UserEntity user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

}