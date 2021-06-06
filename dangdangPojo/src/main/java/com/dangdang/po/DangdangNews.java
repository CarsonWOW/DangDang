package com.dangdang.po;

import java.io.Serializable;
import java.util.Date;

/**
 * dangdang_news
 * @author 
 */
public class DangdangNews implements Serializable {
    private Integer dnId;

    private String dnTitle;

    private String dnContent;

    private Date dnCreateTime;

    private static final long serialVersionUID = 1L;

    public Integer getDnId() {
        return dnId;
    }

    public void setDnId(Integer dnId) {
        this.dnId = dnId;
    }

    public String getDnTitle() {
        return dnTitle;
    }

    public void setDnTitle(String dnTitle) {
        this.dnTitle = dnTitle;
    }

    public String getDnContent() {
        return dnContent;
    }

    public void setDnContent(String dnContent) {
        this.dnContent = dnContent;
    }

    public Date getDnCreateTime() {
        return dnCreateTime;
    }

    public void setDnCreateTime(Date dnCreateTime) {
        this.dnCreateTime = dnCreateTime;
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
        DangdangNews other = (DangdangNews) that;
        return (this.getDnId() == null ? other.getDnId() == null : this.getDnId().equals(other.getDnId()))
            && (this.getDnTitle() == null ? other.getDnTitle() == null : this.getDnTitle().equals(other.getDnTitle()))
            && (this.getDnContent() == null ? other.getDnContent() == null : this.getDnContent().equals(other.getDnContent()))
            && (this.getDnCreateTime() == null ? other.getDnCreateTime() == null : this.getDnCreateTime().equals(other.getDnCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDnId() == null) ? 0 : getDnId().hashCode());
        result = prime * result + ((getDnTitle() == null) ? 0 : getDnTitle().hashCode());
        result = prime * result + ((getDnContent() == null) ? 0 : getDnContent().hashCode());
        result = prime * result + ((getDnCreateTime() == null) ? 0 : getDnCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dnId=").append(dnId);
        sb.append(", dnTitle=").append(dnTitle);
        sb.append(", dnContent=").append(dnContent);
        sb.append(", dnCreateTime=").append(dnCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}