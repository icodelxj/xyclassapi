package com.luoxiaojiang.api.userapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luoxiaojiang.pojo.User;
import com.luoxiaojiang.service.UserService;
import com.luoxiaojiang.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/user/select")
public class selectApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Uid=req.getParameter("uid");
        UserService tool=new UserServiceImpl();
        List<Map<String,Object>> a=tool.selectUserById(Uid);
        if(a!=null)
        {
            resp.setContentType("charset=utf-8");
            resp.setCharacterEncoding("utf-8");
            ObjectMapper mapper = new ObjectMapper();
            //将我们的对象解析成为json格式
            String str = mapper.writeValueAsString(a);
            //String result = "{\"msg\":\"1\"}";
            System.out.println(Uid);
            System.out.println(str);
            resp.getWriter().print(str);
        }else{
            resp.setContentType("charset=utf-8");
            resp.setCharacterEncoding("utf-8");
            System.out.println(Uid);
            String result = "{\"msg\":\"0\"}";
            resp.getWriter().print(result);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
