package com.sym.service;


import com.sym.dao.UserDao;
import com.sym.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Package: com.service
 * @fileName: UserService
 * @Description:
 * @Author Suyiming3333@gmail.com
 * @Created in 10:14 2018/2/28 0028
 */

@Service("userService")
public class UserService {

    @Resource
    private UserDao userDao;

    public User getUser(){
        return userDao.getUser();
    }


}
