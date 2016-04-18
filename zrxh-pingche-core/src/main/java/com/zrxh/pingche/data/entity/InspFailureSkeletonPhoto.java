package com.zrxh.pingche.data.entity;

import java.util.Date;

public class InspFailureSkeletonPhoto implements java.io.Serializable {
    private String id;

    private String createuser;

    private String createdept;

    private Date createtime;

    private String updateuser;

    private String updatedept;

    private Date updatetime;

    private String carinfoid;

    private String skeletonid;

    private String photourl;

    private Date phototime;

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

    public String getSkeletonid() {
        return skeletonid;
    }

    public void setSkeletonid(String skeletonid) {
        this.skeletonid = skeletonid == null ? null : skeletonid.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public Date getPhototime() {
        return phototime;
    }

    public void setPhototime(Date phototime) {
        this.phototime = phototime;
    }
}