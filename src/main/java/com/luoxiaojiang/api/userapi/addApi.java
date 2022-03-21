package com.luoxiaojiang.api.userapi;

import com.luoxiaojiang.pojo.User;
import com.luoxiaojiang.service.UserService;
import com.luoxiaojiang.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/user/add")
public class addApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String Uid=req.getParameter("uid");
        String Name=req.getParameter("name");
        String Image=req.getParameter("image");
        String Sex=req.getParameter("sex");
        String School=req.getParameter("school");
        String Telephone=req.getParameter("telephone");
        String RealName=req.getParameter("realname");
        String Style=req.getParameter("style");
        if(Sex.equals("1")){Sex="男";}
        if(Sex.equals("0")){Sex="女";}
        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String Add_time=formatter.format(date);
        String Type="未认证";
        int Money=10;
        User now=new User(Uid,Name,Image,Sex,School,Telephone,RealName,Style,Add_time,Type,Money);
        UserService tool=new UserServiceImpl();
        System.out.println(now.toString());
        if(tool.addUser(now)){
            resp.setContentType("charset=utf-8");
            String result = "{\"msg\":\"1\"}";
            resp.getWriter().print(result);
        }else{
            resp.setContentType("charset=utf-8");
            String result = "{\"msg\":\"0\"}";
            resp.getWriter().print(result);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
