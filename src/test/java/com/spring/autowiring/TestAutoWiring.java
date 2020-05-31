package com.spring.autowiring;


import com.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {

    public TestAutoWiring(){
        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void testSay(){
        AutoWiringService autoWiringService = super.getBean("autoWiringService");
        autoWiringService.say("this is a test");
    }
}
