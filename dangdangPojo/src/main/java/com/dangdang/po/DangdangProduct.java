package com.dangdang.po;

import java.io.Serializable;

/**
 * dangdang_product
 * @author 
 */
public class DangdangProduct implements Serializable {
    private Integer dpId;

    private String dpName;

    private String dpDescription;

    private Double dpPrice;

    private Integer dpStock;

    private Integer dpcChildId;

    private String dpFileName;

    private static final long serialVersionUID = 1L;

    public Integer getDpId() {
        return dpId;
    }

    public void setDpId(Integer dpId) {
        this.dpId = dpId;
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

    public String getDpDescription() {
        return dpDescription;
    }

    public void setDpDescription(String dpDescription) {
        this.dpDescription = dpDescription;
    }

    public Double getDpPrice() {
        return dpPrice;
    }

    public void setDpPrice(Double dpPrice) {
        this.dpPrice = dpPrice;
    }

    public Integer getDpStock() {
        return dpStock;
    }

    public void setDpStock(Integer dpStock) {
        this.dpStock = dpStock;
    }

    public Integer getDpcChildId() {
        return dpcChildId;
    }

    public void setDpcChildId(Integer dpcChildId) {
        this.dpcChildId = dpcChildId;
    }

    public String getDpFileName() {
        return dpFileName;
    }

    public void setDpFileName(String dpFileName) {
        this.dpFileName = dpFileName;
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
        DangdangProduct other = (DangdangProduct) that;
        return (this.getDpId() == null ? other.getDpId() == null : this.getDpId().equals(other.getDpId()))
            && (this.getDpName() == null ? other.getDpName() == null : this.getDpName().equals(other.getDpName()))
            && (this.getDpDescription() == null ? other.getDpDescription() == null : this.getDpDescription().equals(other.getDpDescription()))
            && (this.getDpPrice() == null ? other.getDpPrice() == null : this.getDpPrice().equals(other.getDpPrice()))
            && (this.getDpStock() == null ? other.getDpStock() == null : this.getDpStock().equals(other.getDpStock()))
            && (this.getDpcChildId() == null ? other.getDpcChildId() == null : this.getDpcChildId().equals(other.getDpcChildId()))
            && (this.getDpFileName() == null ? other.getDpFileName() == null : this.getDpFileName().equals(other.getDpFileName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpId() == null) ? 0 : getDpId().hashCode());
        result = prime * result + ((getDpName() == null) ? 0 : getDpName().hashCode());
        result = prime * result + ((getDpDescription() == null) ? 0 : getDpDescription().hashCode());
        result = prime * result + ((getDpPrice() == null) ? 0 : getDpPrice().hashCode());
        result = prime * result + ((getDpStock() == null) ? 0 : getDpStock().hashCode());
        result = prime * result + ((getDpcChildId() == null) ? 0 : getDpcChildId().hashCode());
        result = prime * result + ((getDpFileName() == null) ? 0 : getDpFileName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dpId=").append(dpId);
        sb.append(", dpName=").append(dpName);
        sb.append(", dpDescription=").append(dpDescription);
        sb.append(", dpPrice=").append(dpPrice);
        sb.append(", dpStock=").append(dpStock);
        sb.append(", dpcChildId=").append(dpcChildId);
        sb.append(", dpFileName=").append(dpFileName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}