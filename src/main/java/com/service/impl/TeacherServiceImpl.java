package com.service.impl;

import com.dao.TeacherMapper;
import com.model.pojo.Teacher;
import com.service.ITeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> findMsg() {
        return teacherMapper.getTeacher();
    }
}
