package com.web;

import com.service.Userservice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/Register")
public class Register extends HttpServlet {
    private Userservice userservice=new Userservice();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(username);
        int t=-1;
        try {
             t=userservice.register(username,password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if(t==1){
            //注册成功
            req.setAttribute("ifi",1);
            req.getRequestDispatcher("/jsp/register.jsp").forward(req,resp);

        }else{
            System.out.println("lose");
            req.setAttribute("ifi",3);
            req.getRequestDispatcher("/jsp/register.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        doGet(req,resp);
    }
}
