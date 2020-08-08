package com.test;

import com.utils.TestSpring;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring.xml"})
public class Test {
    @Resource
    private TestSpring testSpring;

    @org.junit.Test
    public void test(){
        testSpring.test();
    }
}
