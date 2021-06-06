package com.dangdang.po;

import java.io.Serializable;

/**
 * dangdang_shopping
 * @author 
 */
public class DangdangShopping implements Serializable {
    private Integer dodId;

    private Integer doUserId;

    private Integer dpId;

    private Integer dodQuantity;

    private Double dodCost;

    private Integer doState;

    private static final long serialVersionUID = 1L;

    public Integer getDodId() {
        return dodId;
    }

    public void setDodId(Integer dodId) {
        this.dodId = dodId;
    }

    public Integer getDoUserId() {
        return doUserId;
    }

    public void setDoUserId(Integer doUserId) {
        this.doUserId = doUserId;
    }

    public Integer getDpId() {
        return dpId;
    }

    public void setDpId(Integer dpId) {
        this.dpId = dpId;
    }

    public Integer getDodQuantity() {
        return dodQuantity;
    }

    public void setDodQuantity(Integer dodQuantity) {
        this.dodQuantity = dodQuantity;
    }

    public Double getDodCost() {
        return dodCost;
    }

    public void setDodCost(Double dodCost) {
        this.dodCost = dodCost;
    }

    public Integer getDoState() {
        return doState;
    }

    public void setDoState(Integer doState) {
        this.doState = doState;
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
        DangdangShopping other = (DangdangShopping) that;
        return (this.getDodId() == null ? other.getDodId() == null : this.getDodId().equals(other.getDodId()))
            && (this.getDoUserId() == null ? other.getDoUserId() == null : this.getDoUserId().equals(other.getDoUserId()))
            && (this.getDpId() == null ? other.getDpId() == null : this.getDpId().equals(other.getDpId()))
            && (this.getDodQuantity() == null ? other.getDodQuantity() == null : this.getDodQuantity().equals(other.getDodQuantity()))
            && (this.getDodCost() == null ? other.getDodCost() == null : this.getDodCost().equals(other.getDodCost()))
            && (this.getDoState() == null ? other.getDoState() == null : this.getDoState().equals(other.getDoState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDodId() == null) ? 0 : getDodId().hashCode());
        result = prime * result + ((getDoUserId() == null) ? 0 : getDoUserId().hashCode());
        result = prime * result + ((getDpId() == null) ? 0 : getDpId().hashCode());
        result = prime * result + ((getDodQuantity() == null) ? 0 : getDodQuantity().hashCode());
        result = prime * result + ((getDodCost() == null) ? 0 : getDodCost().hashCode());
        result = prime * result + ((getDoState() == null) ? 0 : getDoState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dodId=").append(dodId);
        sb.append(", doUserId=").append(doUserId);
        sb.append(", dpId=").append(dpId);
        sb.append(", dodQuantity=").append(dodQuantity);
        sb.append(", dodCost=").append(dodCost);
        sb.append(", doState=").append(doState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}