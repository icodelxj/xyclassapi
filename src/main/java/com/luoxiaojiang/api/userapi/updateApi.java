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


@WebServlet(urlPatterns = "/user/update")
public class updateApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("uid");
        String name=req.getParameter("name");
        String style=req.getParameter("style");
        UserService tool=new UserServiceImpl();
        if(tool.updateUser(id,name,style)){
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
        doGet(req,resp);
    }
}
