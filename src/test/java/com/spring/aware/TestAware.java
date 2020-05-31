package com.spring.aware;

import com.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

    public TestAware(){
        super("classpath:spring.xml");
    }

    @Test
    public void testMoocApplicationContext(){
        System.out.println("Test:" + super.getBean("MoocApplicationContext").hashCode());
    }

    @Test
    public void  testMoocBeanName(){
        System.out.println("testMoocBeanName" + super.getBean("MoocBeanName"));
    }
}
