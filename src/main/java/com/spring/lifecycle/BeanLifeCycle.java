package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("Bean stop.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean start.");
    }
//    private void start() {
//        System.out.println("Bean start.");
//    }
//
//    private void stop() {
//        System.out.println("Bean stop.");
//    }
}
