package com.cocmaster.firstBlood_base_common.constant;

/**
 * @author di
 * 关于部落的常量
 * 
 * */
public class ClanKey {
	//部落状态 需要申请 关闭 任何人可以加入
	public static final int CLAN_TYPE_INVITE_ONLY = 1;
	public static final int CLAN_TYPE_CLOSED = 2;
	public static final int CLAN_TYPE_ANYONE_CAN_JOIN = 3;
	public static final int CLAN_TYPE_NOT_SET = 4;
	
	//部落站频率
	public static final int CLAN_WAR_FREQUENCY_ALWAYS = 51;
	public static final int CLAN_WAR_FREQUENCY_NEVER = 52;
	public static final int CLAN_WAR_FREQUENCY_TWICE_A_WEEK = 53;
	public static final int CLAN_WAR_FREQUENCY_ONCE_A_WEEK = 54;
	public static final int CLAN_WAR_FREQUENCY_RARELY = 55;
	public static final int CLAN_WAR_FREQUENCY_NOT_SET = 56;
	
	//部落所在国家
	public static final int CLAN_LOCATION_CHINA = 101;
	public static final int CLAN_LOCATION_OTHERS = 102;
	
}
