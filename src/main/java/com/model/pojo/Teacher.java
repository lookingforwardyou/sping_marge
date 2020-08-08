package com.model.pojo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Teacher {
    private Integer teacherId;
    private String  teacherName;
    private Double money;

    public Teacher() {
    }

    public Teacher(Integer teacherId, String teacherName, Double money) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.money = money;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", money=" + money +
                '}';
    }
}
