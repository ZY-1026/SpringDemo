package com.spring.resource;

import com.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {

    public TestResource(){
        super("classpath*:spring-resource.xml");
    }


    @Test
    public void testResource() throws IOException {
        MoocResource moocResource = super.getBean("MoocResource");
        moocResource.resource();
    }
}
