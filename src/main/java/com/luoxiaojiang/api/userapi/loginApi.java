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
@WebServlet("/user/login")
public class loginApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uid=req.getParameter("uid");
        User a=new User();
        UserService tool=new UserServiceImpl();
        if(tool.selectUserById(uid)!=null)
        {
            resp.setContentType("charset=utf-8");
            String result = "{\"msg\":\"1\"}";
            resp.getWriter().print(result);
        }else{
            resp.setContentType("charset=utf-8");
            String result = "{\"msg\":\"0\"}";
            resp.getWriter().print(result);
        }
    }
}
