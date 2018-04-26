package com.sym.controller;

import com.sym.entity.User;
import com.sym.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package: com.sym.controller
 * @fileName: MybatisDemo
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 22:04 2018/4/1 0001
 */
public class MybatisDemo {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("springmybatis.xml");
        UserService us = (UserService) ac.getBean("userService");
        User user = us.getUser();
        System.out.println(user);
    }
}
