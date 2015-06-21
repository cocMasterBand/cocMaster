package com.cocmaster.firstBlood_base_common.model;

import java.sql.Timestamp;

/**
 * @author di
 * 用户类
 * 密码+salt 拼接后 md5
 * salt目前写死 原谅这么蠢 #cocMaster666
 * */
public class User {
	//用户id 
	private int userId;
	
	//微信的openid
	private String openId;
	
	//手机号
	private int phone;
	
	//手机号是否通过验证 目前不验证
	private boolean isPhoneCheck;
	
	//salt
	private String salt;
	
	//MD5后的密码
	private String passwd;
	
	//用户种类	这里是指在部落中的(长老.首领 副手...)
	private int userStatus;
	
	//所在部落id	如果是未加入任何部落的user 默认这里是 -1
	private int clanId;
	
	//stronghold 等级 大本营
	private int strongHoldLevel;
	
	//游戏中奖杯数
	private int leagueLevel;
	
	//troops 兵种信息 TroopsMap序列化成String放在这里 感觉会比专门开一个troops表好一点
	//TODO 工具类 直接序列化和反序列化TroopsMap
	private String troops;
	
	//create time
	private Timestamp createTime;
	
	//last active time
	private Timestamp updateTime;
	
}
