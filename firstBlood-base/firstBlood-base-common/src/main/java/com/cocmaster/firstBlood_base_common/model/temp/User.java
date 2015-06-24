package com.cocmaster.firstBlood_base_common.model.temp;

import java.util.Date;

public class User {
    private Integer userid;

    private Integer openid;

    private String phone;

    private Byte isphonecheck;

    private String salt;

    private String passwd;

    private Byte userstatus;

    private Integer clanid;

    private Byte strongholdlevel;

    private Integer leaguelevel;

    private String troops;

    private Date createtime;

    private Date updatetime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOpenid() {
        return openid;
    }

    public void setOpenid(Integer openid) {
        this.openid = openid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Byte getIsphonecheck() {
        return isphonecheck;
    }

    public void setIsphonecheck(Byte isphonecheck) {
        this.isphonecheck = isphonecheck;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Byte getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Byte userstatus) {
        this.userstatus = userstatus;
    }

    public Integer getClanid() {
        return clanid;
    }

    public void setClanid(Integer clanid) {
        this.clanid = clanid;
    }

    public Byte getStrongholdlevel() {
        return strongholdlevel;
    }

    public void setStrongholdlevel(Byte strongholdlevel) {
        this.strongholdlevel = strongholdlevel;
    }

    public Integer getLeaguelevel() {
        return leaguelevel;
    }

    public void setLeaguelevel(Integer leaguelevel) {
        this.leaguelevel = leaguelevel;
    }

    public String getTroops() {
        return troops;
    }

    public void setTroops(String troops) {
        this.troops = troops == null ? null : troops.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}