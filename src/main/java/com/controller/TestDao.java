package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao userDao= (userDao) applicationContext.getBean("userDao");
        userDao.say();
    }
}
