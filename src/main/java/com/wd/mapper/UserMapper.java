package com.wd.mapper;

import com.wd.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 用户的持久层接口
 */
public interface UserMapper {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
