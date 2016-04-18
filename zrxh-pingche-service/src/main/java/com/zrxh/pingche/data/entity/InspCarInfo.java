package com.zrxh.pingche.data.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "InspCarInfo") 
@XmlAccessorType (XmlAccessType.FIELD)
public class InspCarInfo implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String businesstype;

    private String businesstypesub;

    private String platenumber;

    private String carowner;

    private String telephone;
    
    private String address;

    private String cartype;

    private String caroutput;

    private String vincode;

    private String enginenumber;

    private String registrationdate;

    private String factorydate;

    private String environstandards;

    private String mileage;

    private String fueltype;

    private String speedtype;

    private String drivingmode;

    private String bodycolor;

    private String carkeys;

    private String auditperson;

    private String auditstatus;

    private Date audittime;

    private String createuser;

    private String createdept;

    private Date createtime;

    private String updateuser;

    private String updatedept;

    private Date updatetime;

    private String remark;

    private String userid;

    private String name;

    private String carnumtype;

    private String plateprovince;

    private String platesz;

    private String trimid;

    private String currentlable;

    private String ispassexamine;

    private String continueormodify;

    private String styleid;

    private String milesecond;

    private String idphoto;

    private Boolean isdel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getBusinesstypesub() {
        return businesstypesub;
    }

    public void setBusinesstypesub(String businesstypesub) {
        this.businesstypesub = businesstypesub == null ? null : businesstypesub.trim();
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber == null ? null : platenumber.trim();
    }

    public String getCarowner() {
        return carowner;
    }

    public void setCarowner(String carowner) {
        this.carowner = carowner == null ? null : carowner.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getCaroutput() {
        return caroutput;
    }

    public void setCaroutput(String caroutput) {
        this.caroutput = caroutput == null ? null : caroutput.trim();
    }

    public String getVincode() {
        return vincode;
    }

    public void setVincode(String vincode) {
        this.vincode = vincode == null ? null : vincode.trim();
    }

    public String getEnginenumber() {
        return enginenumber;
    }

    public void setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber == null ? null : enginenumber.trim();
    }

    public String getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(String registrationdate) {
        this.registrationdate = registrationdate == null ? null : registrationdate.trim();
    }

    public String getFactorydate() {
        return factorydate;
    }

    public void setFactorydate(String factorydate) {
        this.factorydate = factorydate == null ? null : factorydate.trim();
    }

    public String getEnvironstandards() {
        return environstandards;
    }

    public void setEnvironstandards(String environstandards) {
        this.environstandards = environstandards == null ? null : environstandards.trim();
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage == null ? null : mileage.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public String getSpeedtype() {
        return speedtype;
    }

    public void setSpeedtype(String speedtype) {
        this.speedtype = speedtype == null ? null : speedtype.trim();
    }

    public String getDrivingmode() {
        return drivingmode;
    }

    public void setDrivingmode(String drivingmode) {
        this.drivingmode = drivingmode == null ? null : drivingmode.trim();
    }

    public String getBodycolor() {
        return bodycolor;
    }

    public void setBodycolor(String bodycolor) {
        this.bodycolor = bodycolor == null ? null : bodycolor.trim();
    }

    public String getCarkeys() {
        return carkeys;
    }

    public void setCarkeys(String carkeys) {
        this.carkeys = carkeys == null ? null : carkeys.trim();
    }

    public String getAuditperson() {
        return auditperson;
    }

    public void setAuditperson(String auditperson) {
        this.auditperson = auditperson == null ? null : auditperson.trim();
    }

    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus == null ? null : auditstatus.trim();
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCarnumtype() {
        return carnumtype;
    }

    public void setCarnumtype(String carnumtype) {
        this.carnumtype = carnumtype == null ? null : carnumtype.trim();
    }

    public String getPlateprovince() {
        return plateprovince;
    }

    public void setPlateprovince(String plateprovince) {
        this.plateprovince = plateprovince == null ? null : plateprovince.trim();
    }

    public String getPlatesz() {
        return platesz;
    }

    public void setPlatesz(String platesz) {
        this.platesz = platesz == null ? null : platesz.trim();
    }

    public String getTrimid() {
        return trimid;
    }

    public void setTrimid(String trimid) {
        this.trimid = trimid == null ? null : trimid.trim();
    }

    public String getCurrentlable() {
        return currentlable;
    }

    public void setCurrentlable(String currentlable) {
        this.currentlable = currentlable == null ? null : currentlable.trim();
    }

    public String getIspassexamine() {
        return ispassexamine;
    }

    public void setIspassexamine(String ispassexamine) {
        this.ispassexamine = ispassexamine == null ? null : ispassexamine.trim();
    }

    public String getContinueormodify() {
        return continueormodify;
    }

    public void setContinueormodify(String continueormodify) {
        this.continueormodify = continueormodify == null ? null : continueormodify.trim();
    }

    public String getStyleid() {
        return styleid;
    }

    public void setStyleid(String styleid) {
        this.styleid = styleid == null ? null : styleid.trim();
    }

    public String getMilesecond() {
        return milesecond;
    }

    public void setMilesecond(String milesecond) {
        this.milesecond = milesecond == null ? null : milesecond.trim();
    }

    public String getIdphoto() {
        return idphoto;
    }

    public void setIdphoto(String idphoto) {
        this.idphoto = idphoto == null ? null : idphoto.trim();
    }

    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}