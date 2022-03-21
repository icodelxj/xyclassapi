package com.luoxiaojiang.api.wxapi;

import com.luoxiaojiang.util.decrypt.DecryptPhoneUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

@WebServlet("/wx/getphone")
public class getphoneApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String encryptData= URLDecoder.decode(req.getParameter("encryptData"),"utf-8");
        String sessionKey=URLDecoder.decode(req.getParameter("sessionKey"),"utf-8");
        String iv=URLDecoder.decode(req.getParameter("iv"),"utf-8");
        DecryptPhoneUtils tool=new DecryptPhoneUtils();
        String result=tool.decryptData(encryptData,sessionKey,iv);
        resp.getWriter().print(result);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
