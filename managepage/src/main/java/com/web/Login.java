package com.web;

import com.pojo.User;
import com.service.Userservice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private Userservice userservice=new Userservice();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名和密码
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(password);
        //
        //调用service查询

        User user = null;
        try {
            user = userservice.login(username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("hello");
        //判断
        if (user!=null){
            //若用户勾选了记住我
            String i=req.getParameter("remember");
            if("1".equals(i)){
                //创建cookie并发送cookie
                Cookie cookie=new Cookie("username",username);
                Cookie cookie1=new Cookie("password",password);
                cookie.setMaxAge(60*60*24*7);
                cookie1.setMaxAge(60*60*24*7);
                resp.addCookie(cookie);
                resp.addCookie(cookie1);
            }
            //Session
            HttpSession httpSession=req.getSession();
            httpSession.setAttribute("username",username);
            //重定向至其它页面
            String context=req.getContextPath();
            System.out.println(context);
            resp.sendRedirect(context+"/page");
        }else{
               //回到登录界面并显示提示信息
            req.setAttribute("failure","用户名或密码错误");
            req.getRequestDispatcher("/jsp/login.jsp").forward(req,resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);

    }
}
