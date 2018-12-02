package com.www.pojo;

import java.io.Serializable;

public class Tour implements Serializable {
    private Integer tourId;

    private String tourName;

    private String tourDate;

    private static final long serialVersionUID = 1L;

    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName == null ? null : tourName.trim();
    }

    public String getTourDate() {
        return tourDate;
    }

    public void setTourDate(String tourDate) {
        this.tourDate = tourDate == null ? null : tourDate.trim();
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
        Tour other = (Tour) that;
        return (this.getTourId() == null ? other.getTourId() == null : this.getTourId().equals(other.getTourId()))
            && (this.getTourName() == null ? other.getTourName() == null : this.getTourName().equals(other.getTourName()))
            && (this.getTourDate() == null ? other.getTourDate() == null : this.getTourDate().equals(other.getTourDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTourId() == null) ? 0 : getTourId().hashCode());
        result = prime * result + ((getTourName() == null) ? 0 : getTourName().hashCode());
        result = prime * result + ((getTourDate() == null) ? 0 : getTourDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tourId=").append(tourId);
        sb.append(", tourName=").append(tourName);
        sb.append(", tourDate=").append(tourDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}