package com.www.pojo;

import java.io.Serializable;

public class Scenic implements Serializable {
    private Integer id;

    private String scName;

    private Integer scLocaId;

    private String scDesc;

    private String scRemark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Integer getScLocaId() {
        return scLocaId;
    }

    public void setScLocaId(Integer scLocaId) {
        this.scLocaId = scLocaId;
    }

    public String getScDesc() {
        return scDesc;
    }

    public void setScDesc(String scDesc) {
        this.scDesc = scDesc == null ? null : scDesc.trim();
    }

    public String getScRemark() {
        return scRemark;
    }

    public void setScRemark(String scRemark) {
        this.scRemark = scRemark == null ? null : scRemark.trim();
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
        Scenic other = (Scenic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScName() == null ? other.getScName() == null : this.getScName().equals(other.getScName()))
            && (this.getScLocaId() == null ? other.getScLocaId() == null : this.getScLocaId().equals(other.getScLocaId()))
            && (this.getScDesc() == null ? other.getScDesc() == null : this.getScDesc().equals(other.getScDesc()))
            && (this.getScRemark() == null ? other.getScRemark() == null : this.getScRemark().equals(other.getScRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScName() == null) ? 0 : getScName().hashCode());
        result = prime * result + ((getScLocaId() == null) ? 0 : getScLocaId().hashCode());
        result = prime * result + ((getScDesc() == null) ? 0 : getScDesc().hashCode());
        result = prime * result + ((getScRemark() == null) ? 0 : getScRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scName=").append(scName);
        sb.append(", scLocaId=").append(scLocaId);
        sb.append(", scDesc=").append(scDesc);
        sb.append(", scRemark=").append(scRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}