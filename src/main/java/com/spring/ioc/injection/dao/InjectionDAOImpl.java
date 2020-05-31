package com.spring.ioc.injection.dao;

import com.spring.ioc.injection.dao.InjectionDAO;

public class InjectionDAOImpl implements InjectionDAO {
    public void save(String arg) {
        System.out.println("保存数据：" + arg);
    }
}
