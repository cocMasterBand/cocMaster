package com.cocmaster.firstBlood_register_impl.dao;

import com.cocmaster.firstBlood_base_common.model.Do.User;


public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}