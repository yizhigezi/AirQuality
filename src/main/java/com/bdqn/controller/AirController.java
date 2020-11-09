package com.bdqn.controller;

import com.bdqn.pojo.Airindex;
import com.bdqn.pojo.District;
import com.bdqn.pojo.Superlei;
import com.bdqn.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AirController {
    @Autowired
    AirService as;

    @RequestMapping("/getAll")
    public String getAll(Integer index, Integer size, HttpServletRequest request){
        if (index==null){
            index=1;
        }else {
            index=Integer.parseInt(request.getParameter("index"));
        }

        int num = as.count();
        int page = num%2==0?(num/2):(num/2+1);

        if (index<=0){
            index=1;
        }
        if (index>=page){
            index=page;
        }
        List<Superlei> list = as.sel(index,2);
        request.getSession().setAttribute("list",list);
        request.getSession().setAttribute("page",page);
        request.getSession().setAttribute("index",index);
        return "index.jsp";
    }

    @RequestMapping("/del")
    public String del(int id){
        int num = as.del(id);
        return "/getAll";
    }

    @RequestMapping("/Dsel")
    public String Dsel(HttpServletRequest request){
        List<District> dlist = as.Dsel();
        request.getSession().setAttribute("dlist",dlist);
        return "ins.jsp";
    }

    @RequestMapping("/ins")
    public String ins(Airindex a){
        int num = as.ins(a);
        return "/getAll";
    }
}
