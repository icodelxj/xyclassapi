package com.luoxiaojiang.api.userapi;

import com.luoxiaojiang.service.UserService;
import com.luoxiaojiang.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/user/certification")
public class certificationApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("uid");
        String realname=req.getParameter("realname");
        String school=req.getParameter("school");
        String telephone=req.getParameter("telephone");
        UserService tool=new UserServiceImpl();
        if(tool.certification(id,realname,school,telephone)){
            resp.setContentType("charset=utf-8");
            String result = "{\"msg\":\"1\"}";
            resp.getWriter().print(result);
        }else
        {
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
