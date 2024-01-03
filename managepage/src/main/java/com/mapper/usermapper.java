package com.mapper;

import com.pojo.Doctor;
import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface usermapper {

    //用户注册
    //void adduser(@Param("username")String username,@Param("password")String password);
    void adduser(User user);
    User selectByname(String username);
    //用户登录
    public User selectBynamepassword(@Param("username")String username,@Param("password")String password);
    //查看所有医生信息
    List<Doctor> selectdoctor();
}
