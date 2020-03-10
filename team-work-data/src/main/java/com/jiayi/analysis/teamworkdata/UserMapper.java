package com.jiayi.analysis.teamworkdata;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select(" select * from user where name = '张三' ")
    User getUser();

}
