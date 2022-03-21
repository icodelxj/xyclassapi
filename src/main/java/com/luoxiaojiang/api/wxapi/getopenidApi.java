package com.luoxiaojiang.api.wxapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luoxiaojiang.util.http.HttpUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
@WebServlet("/wx/getopenid")
public class getopenidApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String APPID="wxae202e59feef1d5a";
        String SECRET="2c43d78b9fad2afed34b9d58d0a5e930";
        String JSCODE=req.getParameter("code");
        String httpUrl="https://api.weixin.qq.com/sns/jscode2session?appid="+APPID+"&secret="+SECRET+"&js_code="+JSCODE+"&grant_type=authorization_code";
        HttpUtils tool=new HttpUtils();
        String jg=tool.doGet(httpUrl);
        resp.getWriter().print(jg);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
