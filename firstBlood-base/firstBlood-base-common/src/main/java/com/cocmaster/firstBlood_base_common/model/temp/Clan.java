package com.cocmaster.firstBlood_base_common.model.temp;

public class Clan {
    private Integer clanid;

    private String clannamestring;

    private String clantag;

    private Byte clantype;

    private Byte warfrequency;

    private Integer memberscount;

    private Integer totalpoints;

    private Integer warswon;

    private Integer requiredtrophies;

    private Integer location;

    public Integer getClanid() {
        return clanid;
    }

    public void setClanid(Integer clanid) {
        this.clanid = clanid;
    }

    public String getClannamestring() {
        return clannamestring;
    }

    public void setClannamestring(String clannamestring) {
        this.clannamestring = clannamestring == null ? null : clannamestring.trim();
    }

    public String getClantag() {
        return clantag;
    }

    public void setClantag(String clantag) {
        this.clantag = clantag == null ? null : clantag.trim();
    }

    public Byte getClantype() {
        return clantype;
    }

    public void setClantype(Byte clantype) {
        this.clantype = clantype;
    }

    public Byte getWarfrequency() {
        return warfrequency;
    }

    public void setWarfrequency(Byte warfrequency) {
        this.warfrequency = warfrequency;
    }

    public Integer getMemberscount() {
        return memberscount;
    }

    public void setMemberscount(Integer memberscount) {
        this.memberscount = memberscount;
    }

    public Integer getTotalpoints() {
        return totalpoints;
    }

    public void setTotalpoints(Integer totalpoints) {
        this.totalpoints = totalpoints;
    }

    public Integer getWarswon() {
        return warswon;
    }

    public void setWarswon(Integer warswon) {
        this.warswon = warswon;
    }

    public Integer getRequiredtrophies() {
        return requiredtrophies;
    }

    public void setRequiredtrophies(Integer requiredtrophies) {
        this.requiredtrophies = requiredtrophies;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }
}