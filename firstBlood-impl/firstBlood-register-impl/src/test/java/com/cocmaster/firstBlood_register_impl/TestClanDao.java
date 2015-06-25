package com.cocmaster.firstBlood_register_impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cocmaster.firstBlood_base_common.model.Do.Clan;
import com.cocmaster.firstBlood_base_common.model.Do.User;
import com.cocmaster.firstBlood_register_impl.dao.ClanMapper;
import com.cocmaster.firstBlood_register_impl.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/database-config.xml"})
public class TestClanDao {

	@Autowired 
	private ClanMapper clanMapper;
	
	private UserMapper userMapper;
	
	@Test
	public void test() {
		
		Clan clan = clanMapper.selectByPrimaryKey(1);
		System.out.println("result :" + clan.toString());
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println("user:"+ user.toString());
	}

}
