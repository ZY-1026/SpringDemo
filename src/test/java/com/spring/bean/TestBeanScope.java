package com.spring.bean;

import com.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

    public TestBeanScope(){
        super("classpath*:spring.xml");
    }

    @Test
    public void testSay(){

        /**
         * 测试单例模式，即每一个容器中只有一个bean
         *
         * 如果两次输出的结果一致，说明容器中只有一个bean
         */
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testSay2(){
        /**
         * 测试prototype模式
         *
         * 每次请求都会创建新的实例
         */

        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }
}
