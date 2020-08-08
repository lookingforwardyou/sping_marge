package com.dao;

import com.model.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherMapper {
    List<Teacher> getTeacher();
}
