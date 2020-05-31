package com.spring.ioc.injection.service;

import com.spring.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {
    private InjectionDAO injectionDAO;

    // 设值注入时必须含有set方法
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    // 构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void save(String arg) {
        System.out.println("Service接收参数：" + arg);
        arg = arg + "+" + this.hashCode();
        injectionDAO.save(arg);
    }
}
