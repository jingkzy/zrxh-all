package com.zrxh.pingche.data.entity;

public class InspPhotoresult implements java.io.Serializable {
    private String id;

    private String carinfoid;

    private String paintphotourl;

    private String skeletonleftphotourl;

    private String skeletonrightphotourl;

    private String exteriorupurl;

    private String exteriorlefturl;

    private String exteriorcenterurl;

    private String exteriorrighturl;

    private String exteriordownurl;

    private String interiorurl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCarinfoid() {
        return carinfoid;
    }

    public void setCarinfoid(String carinfoid) {
        this.carinfoid = carinfoid == null ? null : carinfoid.trim();
    }

    public String getPaintphotourl() {
        return paintphotourl;
    }

    public void setPaintphotourl(String paintphotourl) {
        this.paintphotourl = paintphotourl == null ? null : paintphotourl.trim();
    }

    public String getSkeletonleftphotourl() {
        return skeletonleftphotourl;
    }

    public void setSkeletonleftphotourl(String skeletonleftphotourl) {
        this.skeletonleftphotourl = skeletonleftphotourl == null ? null : skeletonleftphotourl.trim();
    }

    public String getSkeletonrightphotourl() {
        return skeletonrightphotourl;
    }

    public void setSkeletonrightphotourl(String skeletonrightphotourl) {
        this.skeletonrightphotourl = skeletonrightphotourl == null ? null : skeletonrightphotourl.trim();
    }

    public String getExteriorupurl() {
        return exteriorupurl;
    }

    public void setExteriorupurl(String exteriorupurl) {
        this.exteriorupurl = exteriorupurl == null ? null : exteriorupurl.trim();
    }

    public String getExteriorlefturl() {
        return exteriorlefturl;
    }

    public void setExteriorlefturl(String exteriorlefturl) {
        this.exteriorlefturl = exteriorlefturl == null ? null : exteriorlefturl.trim();
    }

    public String getExteriorcenterurl() {
        return exteriorcenterurl;
    }

    public void setExteriorcenterurl(String exteriorcenterurl) {
        this.exteriorcenterurl = exteriorcenterurl == null ? null : exteriorcenterurl.trim();
    }

    public String getExteriorrighturl() {
        return exteriorrighturl;
    }

    public void setExteriorrighturl(String exteriorrighturl) {
        this.exteriorrighturl = exteriorrighturl == null ? null : exteriorrighturl.trim();
    }

    public String getExteriordownurl() {
        return exteriordownurl;
    }

    public void setExteriordownurl(String exteriordownurl) {
        this.exteriordownurl = exteriordownurl == null ? null : exteriordownurl.trim();
    }

    public String getInteriorurl() {
        return interiorurl;
    }

    public void setInteriorurl(String interiorurl) {
        this.interiorurl = interiorurl == null ? null : interiorurl.trim();
    }
}