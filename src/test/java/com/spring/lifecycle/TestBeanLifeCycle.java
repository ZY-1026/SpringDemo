package com.spring.lifecycle;

import com.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {

    public TestBeanLifeCycle(){
        super("classpath*:spring.xml");
    }


    @Test
    public void test1(){
        super.getBean("beanLifeCycle");
    }
}
