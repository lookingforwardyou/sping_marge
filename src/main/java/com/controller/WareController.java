package com.controller;

import com.model.pojo.Ware;
import com.service.IWareService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ware")
public class WareController {
    @Resource
    private IWareService iWareService;

    @RequestMapping("/seeWare")
    public String seeWare(Model model,Ware ware){
        List<Ware> list=new ArrayList<Ware>();
        list=iWareService.getWare(ware);
        model.addAttribute("selectWare",ware);
        model.addAttribute("ware",list);
        return "wareShow";
    }
    @RequestMapping("/doUpdate")
    public String doUpdate(Ware ware, HttpSession session){
        System.out.println(ware);
        boolean flag=iWareService.updateWare(ware);
        if(flag){
            session.setAttribute("message","修改商品成功");
            return "redirect:/ware/seeWare";
        }else{
            return "err";
        }
    }
    @RequestMapping("/addWare")
    public String addWare(){
        return "addWare";
    }
    @RequestMapping("/doAddWare")
    public String doAddWare(Ware ware,HttpSession session){
        boolean flag=iWareService.addWare(ware);
        if(flag){
            session.setAttribute("message","添加商品成功");
            return "redirect:/ware/seeWare";
        }else{
            return "err";
        }
    }
    @RequestMapping("/deleteWare")
    public String deleteWare(Integer wid,HttpSession session){
        boolean flag=iWareService.delectWare(wid);
        if(flag){
            session.setAttribute("message","删除商品成功");
            return "redirect:/ware/seeWare";
        }else{
            return "err";
        }
    }
    @RequestMapping("piliangcaozuo")
    public String piliangcaozuo(String check[]){
        System.out.println(check);
        return "err";
    }
}
