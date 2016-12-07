package com.zrxh.pingche.data.entity;

import java.util.Date;

public class InspIllegalCategory implements java.io.Serializable {
    private Integer id;

    private String province;

    private String city;

    private String lsprefix;

    private String lsnum;

    private String carorg;

    private String frameno;

    private String engineno;

    private Integer citylevel;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLsprefix() {
        return lsprefix;
    }

    public void setLsprefix(String lsprefix) {
        this.lsprefix = lsprefix == null ? null : lsprefix.trim();
    }

    public String getLsnum() {
        return lsnum;
    }

    public void setLsnum(String lsnum) {
        this.lsnum = lsnum == null ? null : lsnum.trim();
    }

    public String getCarorg() {
        return carorg;
    }

    public void setCarorg(String carorg) {
        this.carorg = carorg == null ? null : carorg.trim();
    }

    public String getFrameno() {
        return frameno;
    }

    public void setFrameno(String frameno) {
        this.frameno = frameno == null ? null : frameno.trim();
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno == null ? null : engineno.trim();
    }

    public Integer getCitylevel() {
        return citylevel;
    }

    public void setCitylevel(Integer citylevel) {
        this.citylevel = citylevel;
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