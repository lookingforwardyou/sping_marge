package com.controller;

import com.model.pojo.Teacher;
import com.service.ITeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private ITeacherService iTeacherService;

    @RequestMapping("/showList")
    public String findMsg(Model model){
        List<Teacher> list=new ArrayList<Teacher>();
        list=iTeacherService.findMsg();
        model.addAttribute("teacher",list);
        return "teaList";
    }
    @RequestMapping("/nihao")
    public String nihao(){
        return "success";
    }
}
