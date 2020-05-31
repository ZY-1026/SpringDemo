package com.spring.ioc;

import com.spring.base.UnitTestBase;
import com.spring.ioc.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    public TestOneInterface() {
        super("classpath*:spring.xml");
    }

    @Test
    public void testSay() {
        OneInterface oneInterface = super.getBean("oneInterface");
        oneInterface.say("This is a test");
    }
}