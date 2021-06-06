package com.dangdang.po;

import java.io.Serializable;
import java.util.Date;

/**
 * dangdang_order
 * @author 
 */
public class DangdangOrder implements Serializable {
    private Integer doId;

    private String doUserId;

    private String doUserName;

    private String doUserTel;

    private String doUserAddress;

    private Integer doCost;

    private Date doCreateTime;

    private Integer doStatus;

    private Integer doType;

    private static final long serialVersionUID = 1L;

    public Integer getDoId() {
        return doId;
    }

    public void setDoId(Integer doId) {
        this.doId = doId;
    }

    public String getDoUserId() {
        return doUserId;
    }

    public void setDoUserId(String doUserId) {
        this.doUserId = doUserId;
    }

    public String getDoUserName() {
        return doUserName;
    }

    public void setDoUserName(String doUserName) {
        this.doUserName = doUserName;
    }

    public String getDoUserTel() {
        return doUserTel;
    }

    public void setDoUserTel(String doUserTel) {
        this.doUserTel = doUserTel;
    }

    public String getDoUserAddress() {
        return doUserAddress;
    }

    public void setDoUserAddress(String doUserAddress) {
        this.doUserAddress = doUserAddress;
    }

    public Integer getDoCost() {
        return doCost;
    }

    public void setDoCost(Integer doCost) {
        this.doCost = doCost;
    }

    public Date getDoCreateTime() {
        return doCreateTime;
    }

    public void setDoCreateTime(Date doCreateTime) {
        this.doCreateTime = doCreateTime;
    }

    public Integer getDoStatus() {
        return doStatus;
    }

    public void setDoStatus(Integer doStatus) {
        this.doStatus = doStatus;
    }

    public Integer getDoType() {
        return doType;
    }

    public void setDoType(Integer doType) {
        this.doType = doType;
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
        DangdangOrder other = (DangdangOrder) that;
        return (this.getDoId() == null ? other.getDoId() == null : this.getDoId().equals(other.getDoId()))
            && (this.getDoUserId() == null ? other.getDoUserId() == null : this.getDoUserId().equals(other.getDoUserId()))
            && (this.getDoUserName() == null ? other.getDoUserName() == null : this.getDoUserName().equals(other.getDoUserName()))
            && (this.getDoUserTel() == null ? other.getDoUserTel() == null : this.getDoUserTel().equals(other.getDoUserTel()))
            && (this.getDoUserAddress() == null ? other.getDoUserAddress() == null : this.getDoUserAddress().equals(other.getDoUserAddress()))
            && (this.getDoCost() == null ? other.getDoCost() == null : this.getDoCost().equals(other.getDoCost()))
            && (this.getDoCreateTime() == null ? other.getDoCreateTime() == null : this.getDoCreateTime().equals(other.getDoCreateTime()))
            && (this.getDoStatus() == null ? other.getDoStatus() == null : this.getDoStatus().equals(other.getDoStatus()))
            && (this.getDoType() == null ? other.getDoType() == null : this.getDoType().equals(other.getDoType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoId() == null) ? 0 : getDoId().hashCode());
        result = prime * result + ((getDoUserId() == null) ? 0 : getDoUserId().hashCode());
        result = prime * result + ((getDoUserName() == null) ? 0 : getDoUserName().hashCode());
        result = prime * result + ((getDoUserTel() == null) ? 0 : getDoUserTel().hashCode());
        result = prime * result + ((getDoUserAddress() == null) ? 0 : getDoUserAddress().hashCode());
        result = prime * result + ((getDoCost() == null) ? 0 : getDoCost().hashCode());
        result = prime * result + ((getDoCreateTime() == null) ? 0 : getDoCreateTime().hashCode());
        result = prime * result + ((getDoStatus() == null) ? 0 : getDoStatus().hashCode());
        result = prime * result + ((getDoType() == null) ? 0 : getDoType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doId=").append(doId);
        sb.append(", doUserId=").append(doUserId);
        sb.append(", doUserName=").append(doUserName);
        sb.append(", doUserTel=").append(doUserTel);
        sb.append(", doUserAddress=").append(doUserAddress);
        sb.append(", doCost=").append(doCost);
        sb.append(", doCreateTime=").append(doCreateTime);
        sb.append(", doStatus=").append(doStatus);
        sb.append(", doType=").append(doType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}