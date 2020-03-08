package com.controller;

public class userServiceImpl implements userService {

    private userDao userDao;

    public void setUserDao(userDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public void show() {
        userDao.say();
       System.out.println("123");
    }
}
