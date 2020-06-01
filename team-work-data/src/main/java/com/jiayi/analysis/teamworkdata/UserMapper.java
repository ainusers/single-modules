package com.jiayi.analysis.teamworkdata;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select(" select count(1) from REG_TAG ")
    int getUser();

}
