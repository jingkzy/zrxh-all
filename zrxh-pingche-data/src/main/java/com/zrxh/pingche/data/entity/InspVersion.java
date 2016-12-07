package com.zrxh.pingche.data.entity;

import java.util.Date;

public class InspVersion implements java.io.Serializable {
    private Integer id;

    private String clientversion;

    private Integer clientcode;

    private Integer enablestatus;

    private String downurl;

    private String changelist;

    private Integer updateinstall;

    private String createuser;

    private Date createtime;

    private String platform;

    private String filename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientversion() {
        return clientversion;
    }

    public void setClientversion(String clientversion) {
        this.clientversion = clientversion == null ? null : clientversion.trim();
    }

    public Integer getClientcode() {
        return clientcode;
    }

    public void setClientcode(Integer clientcode) {
        this.clientcode = clientcode;
    }

    public Integer getEnablestatus() {
        return enablestatus;
    }

    public void setEnablestatus(Integer enablestatus) {
        this.enablestatus = enablestatus;
    }

    public String getDownurl() {
        return downurl;
    }

    public void setDownurl(String downurl) {
        this.downurl = downurl == null ? null : downurl.trim();
    }

    public String getChangelist() {
        return changelist;
    }

    public void setChangelist(String changelist) {
        this.changelist = changelist == null ? null : changelist.trim();
    }

    public Integer getUpdateinstall() {
        return updateinstall;
    }

    public void setUpdateinstall(Integer updateinstall) {
        this.updateinstall = updateinstall;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }
}