package com.cocmaster.firstBlood_base_common.model.Do;

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
	private String phone;
	
	//手机号是否通过验证 目前不验证
	private boolean isPhoneCheck;
	
	//salt
	private String salt;
	
	//加盐MD5后的密码
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isPhoneCheck() {
		return isPhoneCheck;
	}

	public void setPhoneCheck(boolean isPhoneCheck) {
		this.isPhoneCheck = isPhoneCheck;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public int getClanId() {
		return clanId;
	}

	public void setClanId(int clanId) {
		this.clanId = clanId;
	}

	public int getStrongHoldLevel() {
		return strongHoldLevel;
	}

	public void setStrongHoldLevel(int strongHoldLevel) {
		this.strongHoldLevel = strongHoldLevel;
	}

	public int getLeagueLevel() {
		return leagueLevel;
	}

	public void setLeagueLevel(int leagueLevel) {
		this.leagueLevel = leagueLevel;
	}

	public String getTroops() {
		return troops;
	}

	public void setTroops(String troops) {
		this.troops = troops;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", openId=" + openId + ", phone="
				+ phone + ", isPhoneCheck=" + isPhoneCheck + ", salt=" + salt
				+ ", passwd=" + passwd + ", userStatus=" + userStatus
				+ ", clanId=" + clanId + ", strongHoldLevel=" + strongHoldLevel
				+ ", leagueLevel=" + leagueLevel + ", troops=" + troops
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
	
	
	
}
