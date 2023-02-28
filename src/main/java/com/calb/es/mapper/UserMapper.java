package com.calb.es.mapper;

import com.calb.es.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author pandeng.li
 */
@Mapper
@Repository
public interface UserMapper
{
    public User queryUserByName(String name);
}
