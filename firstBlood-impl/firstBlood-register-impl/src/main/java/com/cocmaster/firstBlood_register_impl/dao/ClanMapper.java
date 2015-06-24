package com.cocmaster.firstBlood_register_impl.dao;

import com.cocmaster.firstBlood_base_common.model.Do.Clan;


public interface ClanMapper {
    int deleteByPrimaryKey(Integer clanid);

    int insert(Clan record);

    int insertSelective(Clan record);

    Clan selectByPrimaryKey(Integer clanid);

    int updateByPrimaryKeySelective(Clan record);

    int updateByPrimaryKey(Clan record);
}