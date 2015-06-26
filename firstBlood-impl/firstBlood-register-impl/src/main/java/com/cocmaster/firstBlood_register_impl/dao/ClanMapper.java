package com.cocmaster.firstBlood_register_impl.dao;

import org.springframework.stereotype.Service;

import com.cocmaster.firstBlood_base_common.model.Do.Clan;

@Service
public interface ClanMapper {
    int deleteByPrimaryKey(Integer clanid);

    int insert(Clan record);

    int insertSelective(Clan record);

    Clan selectByPrimaryKey(Integer clanId);

    int updateByPrimaryKeySelective(Clan record);

    int updateByPrimaryKey(Clan record);
}