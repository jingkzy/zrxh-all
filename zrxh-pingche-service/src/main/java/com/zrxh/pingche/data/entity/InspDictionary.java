package com.zrxh.pingche.data.entity;

import java.util.Date;

public class InspDictionary implements java.io.Serializable {
    private String id;

    private String createuser;

    private String createdept;

    private Date createtime;

    private String updateuser;

    private String updatedept;

    private Date updatetime;

    private String dictcode;

    private String dictvalue;

    private String dicttype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getCreatedept() {
        return createdept;
    }

    public void setCreatedept(String createdept) {
        this.createdept = createdept == null ? null : createdept.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public String getUpdatedept() {
        return updatedept;
    }

    public void setUpdatedept(String updatedept) {
        this.updatedept = updatedept == null ? null : updatedept.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDictcode() {
        return dictcode;
    }

    public void setDictcode(String dictcode) {
        this.dictcode = dictcode == null ? null : dictcode.trim();
    }

    public String getDictvalue() {
        return dictvalue;
    }

    public void setDictvalue(String dictvalue) {
        this.dictvalue = dictvalue == null ? null : dictvalue.trim();
    }

    public String getDicttype() {
        return dicttype;
    }

    public void setDicttype(String dicttype) {
        this.dicttype = dicttype == null ? null : dicttype.trim();
    }
}