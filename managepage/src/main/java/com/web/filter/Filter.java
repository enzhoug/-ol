package com.web.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebFilter("/*")
public class Filter implements jakarta.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //jakarta.servlet.Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        String url = req.getRequestURL().toString();
        String urls[]={"/css/","/login.jsp","/register.jsp","/register.js","/usermapper.xml","/Login","/Register","/Userservice","/User","/mapper"};
        for(String s:urls){
            if(url.contains(s)){
                filterChain.doFilter(servletRequest,servletResponse);
                return;
            }
        }
        System.out.println(url);
        HttpSession session= req.getSession();
        Object user = session.getAttribute("username");
        if(user!=null){
            //放行
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            //跳到登陆界面
            req.setAttribute("warn","没有登录，无操作权限");
            req.getRequestDispatcher("/jsp/login.jsp").forward(req,servletResponse);
        }

    }

    @Override
    public void destroy() {
        jakarta.servlet.Filter.super.destroy();
    }
}
