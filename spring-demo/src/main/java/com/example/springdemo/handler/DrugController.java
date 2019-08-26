package com.example.springdemo.handler;

import com.example.springdemo.pojo.DrugCustom;
import com.example.springdemo.pojo.DrugQueryVo;
import com.example.springdemo.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class DrugController {
    @Autowired
    private DrugService drugService;
    @RequestMapping("/queryDrugs")
    public ModelAndView queryDrugs(DrugQueryVo drugQueryVo) throws Exception {
        List<DrugCustom> drugList=drugService.findall(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("drugList",drugList);


        modelAndView.setViewName("drugsList");
        return modelAndView;
    }
    @RequestMapping("/findDrugbyName.action")
    public ModelAndView findDrugByName( String drugname) throws Exception{
        System.out.println(drugname);
        List<DrugCustom> drugList=drugService.findDrugByName(drugname);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("drugList",drugList);


        modelAndView.setViewName("drugsList");
        return modelAndView;
    }
    @RequestMapping("/deletedrug.action")
    public ModelAndView deleteById(int drugid) throws Exception {
        drugService.deleteById(drugid);
        List<DrugCustom> drugList=drugService.findall(null);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("drugList",drugList);


        modelAndView.setViewName("drugsList");
        return modelAndView;
    }
}
