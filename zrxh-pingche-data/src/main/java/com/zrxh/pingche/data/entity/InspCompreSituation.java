package com.zrxh.pingche.data.entity;

import java.util.Date;

public class InspCompreSituation implements java.io.Serializable {
    private String id;

    private String createuser;

    private String createdept;

    private Date createtime;

    private String updateuser;

    private String updatedept;

    private Date updatetime;

    private String carinfoid;

    private String idleradio;

    private String idletext;

    private String idlebox;

    private String startingradio;

    private String startingtext;

    private String startingbox;

    private String steeringradio;

    private String steeringtext;

    private String steeringbox;

    private String brakeradio;

    private String braketext;

    private String brakebox;

    private String engineradio;

    private String enginetext;

    private String enginebox;

    private String transmissionradio;

    private String transmissiontext;

    private String transmissionbox;

    private String clutchradio;

    private String clutchtext;

    private String clutchbox;

    private String remark;

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

    public String getIdleradio() {
        return idleradio;
    }

    public void setIdleradio(String idleradio) {
        this.idleradio = idleradio == null ? null : idleradio.trim();
    }

    public String getIdletext() {
        return idletext;
    }

    public void setIdletext(String idletext) {
        this.idletext = idletext == null ? null : idletext.trim();
    }

    public String getIdlebox() {
        return idlebox;
    }

    public void setIdlebox(String idlebox) {
        this.idlebox = idlebox == null ? null : idlebox.trim();
    }

    public String getStartingradio() {
        return startingradio;
    }

    public void setStartingradio(String startingradio) {
        this.startingradio = startingradio == null ? null : startingradio.trim();
    }

    public String getStartingtext() {
        return startingtext;
    }

    public void setStartingtext(String startingtext) {
        this.startingtext = startingtext == null ? null : startingtext.trim();
    }

    public String getStartingbox() {
        return startingbox;
    }

    public void setStartingbox(String startingbox) {
        this.startingbox = startingbox == null ? null : startingbox.trim();
    }

    public String getSteeringradio() {
        return steeringradio;
    }

    public void setSteeringradio(String steeringradio) {
        this.steeringradio = steeringradio == null ? null : steeringradio.trim();
    }

    public String getSteeringtext() {
        return steeringtext;
    }

    public void setSteeringtext(String steeringtext) {
        this.steeringtext = steeringtext == null ? null : steeringtext.trim();
    }

    public String getSteeringbox() {
        return steeringbox;
    }

    public void setSteeringbox(String steeringbox) {
        this.steeringbox = steeringbox == null ? null : steeringbox.trim();
    }

    public String getBrakeradio() {
        return brakeradio;
    }

    public void setBrakeradio(String brakeradio) {
        this.brakeradio = brakeradio == null ? null : brakeradio.trim();
    }

    public String getBraketext() {
        return braketext;
    }

    public void setBraketext(String braketext) {
        this.braketext = braketext == null ? null : braketext.trim();
    }

    public String getBrakebox() {
        return brakebox;
    }

    public void setBrakebox(String brakebox) {
        this.brakebox = brakebox == null ? null : brakebox.trim();
    }

    public String getEngineradio() {
        return engineradio;
    }

    public void setEngineradio(String engineradio) {
        this.engineradio = engineradio == null ? null : engineradio.trim();
    }

    public String getEnginetext() {
        return enginetext;
    }

    public void setEnginetext(String enginetext) {
        this.enginetext = enginetext == null ? null : enginetext.trim();
    }

    public String getEnginebox() {
        return enginebox;
    }

    public void setEnginebox(String enginebox) {
        this.enginebox = enginebox == null ? null : enginebox.trim();
    }

    public String getTransmissionradio() {
        return transmissionradio;
    }

    public void setTransmissionradio(String transmissionradio) {
        this.transmissionradio = transmissionradio == null ? null : transmissionradio.trim();
    }

    public String getTransmissiontext() {
        return transmissiontext;
    }

    public void setTransmissiontext(String transmissiontext) {
        this.transmissiontext = transmissiontext == null ? null : transmissiontext.trim();
    }

    public String getTransmissionbox() {
        return transmissionbox;
    }

    public void setTransmissionbox(String transmissionbox) {
        this.transmissionbox = transmissionbox == null ? null : transmissionbox.trim();
    }

    public String getClutchradio() {
        return clutchradio;
    }

    public void setClutchradio(String clutchradio) {
        this.clutchradio = clutchradio == null ? null : clutchradio.trim();
    }

    public String getClutchtext() {
        return clutchtext;
    }

    public void setClutchtext(String clutchtext) {
        this.clutchtext = clutchtext == null ? null : clutchtext.trim();
    }

    public String getClutchbox() {
        return clutchbox;
    }

    public void setClutchbox(String clutchbox) {
        this.clutchbox = clutchbox == null ? null : clutchbox.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}