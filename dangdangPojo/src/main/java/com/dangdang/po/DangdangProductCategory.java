package com.dangdang.po;

import java.io.Serializable;

/**
 * dangdang_product_category
 * @author 
 */
public class DangdangProductCategory implements Serializable {
    private Integer dpcId;

    private String dpcName;

    private Integer dpcParentId;

    private static final long serialVersionUID = 1L;

    public Integer getDpcId() {
        return dpcId;
    }

    public void setDpcId(Integer dpcId) {
        this.dpcId = dpcId;
    }

    public String getDpcName() {
        return dpcName;
    }

    public void setDpcName(String dpcName) {
        this.dpcName = dpcName;
    }

    public Integer getDpcParentId() {
        return dpcParentId;
    }

    public void setDpcParentId(Integer dpcParentId) {
        this.dpcParentId = dpcParentId;
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
        DangdangProductCategory other = (DangdangProductCategory) that;
        return (this.getDpcId() == null ? other.getDpcId() == null : this.getDpcId().equals(other.getDpcId()))
            && (this.getDpcName() == null ? other.getDpcName() == null : this.getDpcName().equals(other.getDpcName()))
            && (this.getDpcParentId() == null ? other.getDpcParentId() == null : this.getDpcParentId().equals(other.getDpcParentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpcId() == null) ? 0 : getDpcId().hashCode());
        result = prime * result + ((getDpcName() == null) ? 0 : getDpcName().hashCode());
        result = prime * result + ((getDpcParentId() == null) ? 0 : getDpcParentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dpcId=").append(dpcId);
        sb.append(", dpcName=").append(dpcName);
        sb.append(", dpcParentId=").append(dpcParentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}