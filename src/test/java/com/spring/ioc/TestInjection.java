package com.spring.ioc;

import com.spring.base.UnitTestBase;
import com.spring.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
    public TestInjection(){
        super("classpath*:spring.xml");
    }

    @Test
    public void testSetter(){
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("保存的数据");
    }

    @Test
    public void testConstructor(){
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("保存的数据");
    }
}
