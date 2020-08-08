package com.model.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Ware {
    private Integer wareId;
    private String wareName;
    private String wareUnit;
    private Integer wareNum;

    public Ware() {
    }

    public Ware(Integer wareId, String wareName, String wareUnit, Integer wareNum) {
        this.wareId = wareId;
        this.wareName = wareName;
        this.wareUnit = wareUnit;
        this.wareNum = wareNum;
    }

    public Integer getWareId() {
        return wareId;
    }

    public void setWareId(Integer wareId) {
        this.wareId = wareId;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareUnit() {
        return wareUnit;
    }

    public void setWareUnit(String wareUnit) {
        this.wareUnit = wareUnit;
    }

    public Integer getWareNum() {
        return wareNum;
    }

    public void setWareNum(Integer wareNum) {
        this.wareNum = wareNum;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "wareId=" + wareId +
                ", wareName='" + wareName + '\'' +
                ", wareUnit='" + wareUnit + '\'' +
                ", wareNum=" + wareNum +
                '}';
    }
}
