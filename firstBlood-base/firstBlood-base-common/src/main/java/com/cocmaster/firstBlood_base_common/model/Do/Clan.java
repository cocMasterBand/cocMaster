package com.cocmaster.firstBlood_base_common.model.Do;

/**
 * @author di 系统中的部落
 * 
 * */
public class Clan {

	private int clanId;
	
	//部落的昵称
	private String clanNameString;

	// coc官方的唯一标识
	private String clanTag;

	// 部落的状态 未知0 需要申请1 关闭2 任何人可入3
	private int clanType;

	// 部落站频率 未知0 ALWAYS1 NEVER2 2/WEEK 3 1/WEEK 4 RARELY 5
	private int warFrequency;

	// 部落的人数
	private int membersCount;

	// 部落奖杯
	private int totalPoints;

	// 部落站胜利次数
	private int warsWon;

	// 部落站加入门槛奖杯数
	private int requiredTrophies;

	// 部落所在位置 0CHINA 1 OTHERS
	private int location;

	public int getClanId() {
		return clanId;
	}

	public void setClanId(int clanId) {
		this.clanId = clanId;
	}

	public String getClanTag() {
		return clanTag;
	}

	public void setClanTag(String clanTag) {
		this.clanTag = clanTag;
	}

	public int getClanType() {
		return clanType;
	}

	public void setClanType(int clanType) {
		this.clanType = clanType;
	}

	public int getWarFrequency() {
		return warFrequency;
	}

	public void setWarFrequency(int warFrequency) {
		this.warFrequency = warFrequency;
	}

	public int getMembersCount() {
		return membersCount;
	}

	public void setMembersCount(int membersCount) {
		this.membersCount = membersCount;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public int getWarsWon() {
		return warsWon;
	}

	public void setWarsWon(int warsWon) {
		this.warsWon = warsWon;
	}

	public int getRequiredTrophies() {
		return requiredTrophies;
	}

	public void setRequiredTrophies(int requiredTrophies) {
		this.requiredTrophies = requiredTrophies;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Clan [clanId=" + clanId + ", clanTag=" + clanTag
				+ ", clanType=" + clanType + ", warFrequency=" + warFrequency
				+ ", membersCount=" + membersCount + ", totalPoints="
				+ totalPoints + ", warsWon=" + warsWon + ", requiredTrophies="
				+ requiredTrophies + ", location=" + location + "]";
	}

}
