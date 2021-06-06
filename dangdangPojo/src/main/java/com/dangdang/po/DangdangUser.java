package com.dangdang.po;

import java.io.Serializable;
import java.util.Date;

/**
 * dangdang_user
 * @author 
 */
public class DangdangUser implements Serializable {
    private Integer duUserId;

    private String duEmail;

    private String duUserName;

    private String duPassword;

    private String duSex;

    private Date duBirthday;

    private String duIdentityCode;

    private String duMobile;

    private Date duCreatetime;

    private Date duCreateuser;

    private Date duUpdatetimetime;

    private Date duUpdatetimeuser;

    private Integer duStatus;

    private static final long serialVersionUID = 1L;

    public Integer getDuUserId() {
        return duUserId;
    }

    public void setDuUserId(Integer duUserId) {
        this.duUserId = duUserId;
    }

    public String getDuEmail() {
        return duEmail;
    }

    public void setDuEmail(String duEmail) {
        this.duEmail = duEmail;
    }

    public String getDuUserName() {
        return duUserName;
    }

    public void setDuUserName(String duUserName) {
        this.duUserName = duUserName;
    }

    public String getDuPassword() {
        return duPassword;
    }

    public void setDuPassword(String duPassword) {
        this.duPassword = duPassword;
    }

    public String getDuSex() {
        return duSex;
    }

    public void setDuSex(String duSex) {
        this.duSex = duSex;
    }

    public Date getDuBirthday() {
        return duBirthday;
    }

    public void setDuBirthday(Date duBirthday) {
        this.duBirthday = duBirthday;
    }

    public String getDuIdentityCode() {
        return duIdentityCode;
    }

    public void setDuIdentityCode(String duIdentityCode) {
        this.duIdentityCode = duIdentityCode;
    }

    public String getDuMobile() {
        return duMobile;
    }

    public void setDuMobile(String duMobile) {
        this.duMobile = duMobile;
    }

    public Date getDuCreatetime() {
        return duCreatetime;
    }

    public void setDuCreatetime(Date duCreatetime) {
        this.duCreatetime = duCreatetime;
    }

    public Date getDuCreateuser() {
        return duCreateuser;
    }

    public void setDuCreateuser(Date duCreateuser) {
        this.duCreateuser = duCreateuser;
    }

    public Date getDuUpdatetimetime() {
        return duUpdatetimetime;
    }

    public void setDuUpdatetimetime(Date duUpdatetimetime) {
        this.duUpdatetimetime = duUpdatetimetime;
    }

    public Date getDuUpdatetimeuser() {
        return duUpdatetimeuser;
    }

    public void setDuUpdatetimeuser(Date duUpdatetimeuser) {
        this.duUpdatetimeuser = duUpdatetimeuser;
    }

    public Integer getDuStatus() {
        return duStatus;
    }

    public void setDuStatus(Integer duStatus) {
        this.duStatus = duStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DangdangUser other = (DangdangUser) that;
        return (this.getDuUserId() == null ? other.getDuUserId() == null : this.getDuUserId().equals(other.getDuUserId()))
            && (this.getDuEmail() == null ? other.getDuEmail() == null : this.getDuEmail().equals(other.getDuEmail()))
            && (this.getDuUserName() == null ? other.getDuUserName() == null : this.getDuUserName().equals(other.getDuUserName()))
            && (this.getDuPassword() == null ? other.getDuPassword() == null : this.getDuPassword().equals(other.getDuPassword()))
            && (this.getDuSex() == null ? other.getDuSex() == null : this.getDuSex().equals(other.getDuSex()))
            && (this.getDuBirthday() == null ? other.getDuBirthday() == null : this.getDuBirthday().equals(other.getDuBirthday()))
            && (this.getDuIdentityCode() == null ? other.getDuIdentityCode() == null : this.getDuIdentityCode().equals(other.getDuIdentityCode()))
            && (this.getDuMobile() == null ? other.getDuMobile() == null : this.getDuMobile().equals(other.getDuMobile()))
            && (this.getDuCreatetime() == null ? other.getDuCreatetime() == null : this.getDuCreatetime().equals(other.getDuCreatetime()))
            && (this.getDuCreateuser() == null ? other.getDuCreateuser() == null : this.getDuCreateuser().equals(other.getDuCreateuser()))
            && (this.getDuUpdatetimetime() == null ? other.getDuUpdatetimetime() == null : this.getDuUpdatetimetime().equals(other.getDuUpdatetimetime()))
            && (this.getDuUpdatetimeuser() == null ? other.getDuUpdatetimeuser() == null : this.getDuUpdatetimeuser().equals(other.getDuUpdatetimeuser()))
            && (this.getDuStatus() == null ? other.getDuStatus() == null : this.getDuStatus().equals(other.getDuStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDuUserId() == null) ? 0 : getDuUserId().hashCode());
        result = prime * result + ((getDuEmail() == null) ? 0 : getDuEmail().hashCode());
        result = prime * result + ((getDuUserName() == null) ? 0 : getDuUserName().hashCode());
        result = prime * result + ((getDuPassword() == null) ? 0 : getDuPassword().hashCode());
        result = prime * result + ((getDuSex() == null) ? 0 : getDuSex().hashCode());
        result = prime * result + ((getDuBirthday() == null) ? 0 : getDuBirthday().hashCode());
        result = prime * result + ((getDuIdentityCode() == null) ? 0 : getDuIdentityCode().hashCode());
        result = prime * result + ((getDuMobile() == null) ? 0 : getDuMobile().hashCode());
        result = prime * result + ((getDuCreatetime() == null) ? 0 : getDuCreatetime().hashCode());
        result = prime * result + ((getDuCreateuser() == null) ? 0 : getDuCreateuser().hashCode());
        result = prime * result + ((getDuUpdatetimetime() == null) ? 0 : getDuUpdatetimetime().hashCode());
        result = prime * result + ((getDuUpdatetimeuser() == null) ? 0 : getDuUpdatetimeuser().hashCode());
        result = prime * result + ((getDuStatus() == null) ? 0 : getDuStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", duUserId=").append(duUserId);
        sb.append(", duEmail=").append(duEmail);
        sb.append(", duUserName=").append(duUserName);
        sb.append(", duPassword=").append(duPassword);
        sb.append(", duSex=").append(duSex);
        sb.append(", duBirthday=").append(duBirthday);
        sb.append(", duIdentityCode=").append(duIdentityCode);
        sb.append(", duMobile=").append(duMobile);
        sb.append(", duCreatetime=").append(duCreatetime);
        sb.append(", duCreateuser=").append(duCreateuser);
        sb.append(", duUpdatetimetime=").append(duUpdatetimetime);
        sb.append(", duUpdatetimeuser=").append(duUpdatetimeuser);
        sb.append(", duStatus=").append(duStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}