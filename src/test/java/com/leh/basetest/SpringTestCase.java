package com.leh.basetest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Administrator
 * @Date: 2018/5/23 09:44
 * @Description:
 */
//指定bean注入的配置文件
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@ContextConfiguration(locations="classpath:application.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestCase extends AbstractJUnit4SpringContextTests{

}
