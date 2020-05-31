package com.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocBeanName implements BeanNameAware, ApplicationContextAware {
    private String beanName;

    public void setBeanName(String s) {
        this.beanName = s;
        System.out.println("MoocBeanName:" + s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(" setApplicationContext:" + applicationContext.getBean(beanName));
    }
}
