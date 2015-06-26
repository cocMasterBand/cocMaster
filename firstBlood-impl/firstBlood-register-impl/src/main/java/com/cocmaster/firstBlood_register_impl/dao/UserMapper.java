package com.cocmaster.firstBlood_register_impl.dao;

import org.springframework.stereotype.Service;

import com.cocmaster.firstBlood_base_common.model.Do.User;

@Service
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}