package com.dangdang.po;

import java.io.Serializable;
import java.util.Date;

/**
 * dangdang_comment
 * @author 
 */
public class DangdangComment implements Serializable {
    private Integer duId;

    private Integer dpId;

    private String duCommentName;

    private String duContent;

    private String duAnswerContent;

    private Date duCreateTime;

    private Date duReplyTime;

    private static final long serialVersionUID = 1L;

    public Integer getDuId() {
        return duId;
    }

    public void setDuId(Integer duId) {
        this.duId = duId;
    }

    public Integer getDpId() {
        return dpId;
    }

    public void setDpId(Integer dpId) {
        this.dpId = dpId;
    }

    public String getDuCommentName() {
        return duCommentName;
    }

    public void setDuCommentName(String duCommentName) {
        this.duCommentName = duCommentName;
    }

    public String getDuContent() {
        return duContent;
    }

    public void setDuContent(String duContent) {
        this.duContent = duContent;
    }

    public String getDuAnswerContent() {
        return duAnswerContent;
    }

    public void setDuAnswerContent(String duAnswerContent) {
        this.duAnswerContent = duAnswerContent;
    }

    public Date getDuCreateTime() {
        return duCreateTime;
    }

    public void setDuCreateTime(Date duCreateTime) {
        this.duCreateTime = duCreateTime;
    }

    public Date getDuReplyTime() {
        return duReplyTime;
    }

    public void setDuReplyTime(Date duReplyTime) {
        this.duReplyTime = duReplyTime;
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
        DangdangComment other = (DangdangComment) that;
        return (this.getDuId() == null ? other.getDuId() == null : this.getDuId().equals(other.getDuId()))
            && (this.getDpId() == null ? other.getDpId() == null : this.getDpId().equals(other.getDpId()))
            && (this.getDuCommentName() == null ? other.getDuCommentName() == null : this.getDuCommentName().equals(other.getDuCommentName()))
            && (this.getDuContent() == null ? other.getDuContent() == null : this.getDuContent().equals(other.getDuContent()))
            && (this.getDuAnswerContent() == null ? other.getDuAnswerContent() == null : this.getDuAnswerContent().equals(other.getDuAnswerContent()))
            && (this.getDuCreateTime() == null ? other.getDuCreateTime() == null : this.getDuCreateTime().equals(other.getDuCreateTime()))
            && (this.getDuReplyTime() == null ? other.getDuReplyTime() == null : this.getDuReplyTime().equals(other.getDuReplyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDuId() == null) ? 0 : getDuId().hashCode());
        result = prime * result + ((getDpId() == null) ? 0 : getDpId().hashCode());
        result = prime * result + ((getDuCommentName() == null) ? 0 : getDuCommentName().hashCode());
        result = prime * result + ((getDuContent() == null) ? 0 : getDuContent().hashCode());
        result = prime * result + ((getDuAnswerContent() == null) ? 0 : getDuAnswerContent().hashCode());
        result = prime * result + ((getDuCreateTime() == null) ? 0 : getDuCreateTime().hashCode());
        result = prime * result + ((getDuReplyTime() == null) ? 0 : getDuReplyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", duId=").append(duId);
        sb.append(", dpId=").append(dpId);
        sb.append(", duCommentName=").append(duCommentName);
        sb.append(", duContent=").append(duContent);
        sb.append(", duAnswerContent=").append(duAnswerContent);
        sb.append(", duCreateTime=").append(duCreateTime);
        sb.append(", duReplyTime=").append(duReplyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}