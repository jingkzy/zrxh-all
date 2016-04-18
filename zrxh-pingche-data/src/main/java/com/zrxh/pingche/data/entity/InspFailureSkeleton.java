package com.zrxh.pingche.data.entity;

import java.util.Date;

public class InspFailureSkeleton implements java.io.Serializable {
    private String id;

    private String createuser;

    private String createdept;

    private Date createtime;

    private String updateuser;

    private String updatedept;

    private Date updatetime;

    private String carinfoid;

    private String partcode;

    private String partname;

    private String crashbeam;

    private String damagedegree;

    private Integer carid;

    private Integer xaxis;

    private Integer yaxis;

    private String color;

    private String partName;

    private String skeletonbox;

    private String photourl;

    private String englishpartName;

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

    public String getCarinfoid() {
        return carinfoid;
    }

    public void setCarinfoid(String carinfoid) {
        this.carinfoid = carinfoid == null ? null : carinfoid.trim();
    }

    public String getPartcode() {
        return partcode;
    }

    public void setPartcode(String partcode) {
        this.partcode = partcode == null ? null : partcode.trim();
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname == null ? null : partname.trim();
    }

    public String getCrashbeam() {
        return crashbeam;
    }

    public void setCrashbeam(String crashbeam) {
        this.crashbeam = crashbeam == null ? null : crashbeam.trim();
    }

    public String getDamagedegree() {
        return damagedegree;
    }

    public void setDamagedegree(String damagedegree) {
        this.damagedegree = damagedegree == null ? null : damagedegree.trim();
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getXaxis() {
        return xaxis;
    }

    public void setXaxis(Integer xaxis) {
        this.xaxis = xaxis;
    }

    public Integer getYaxis() {
        return yaxis;
    }

    public void setYaxis(Integer yaxis) {
        this.yaxis = yaxis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getSkeletonbox() {
        return skeletonbox;
    }

    public void setSkeletonbox(String skeletonbox) {
        this.skeletonbox = skeletonbox == null ? null : skeletonbox.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getEnglishpartName() {
        return englishpartName;
    }

    public void setEnglishpartName(String englishpartName) {
        this.englishpartName = englishpartName == null ? null : englishpartName.trim();
    }
}