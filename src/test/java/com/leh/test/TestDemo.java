package com.leh.test;

import com.leh.basetest.SpringTestCase;
import com.leh.service.EhCacheTestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: Administrator
 * @Date: 2018/5/23 09:48
 * @Description:
 */
public class TestDemo extends SpringTestCase{

    @Autowired
    private EhCacheTestService ehCacheTestService;

    @Test
    public void get() throws Exception{
        System.out.println("第一次调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(2000);

        System.out.println("2秒之后调用："
                + ehCacheTestService.getTimestamp("param"));

        Thread.sleep(11000);

        System.out.println("再过11秒之后调用："
                + ehCacheTestService.getTimestamp("param"));
    }

    //当前时间：1527041699000
    //第一次调用：1527041699000
    //2秒之后调用：1527041699000
    //当前时间：1527041712015
    //再过11秒之后调用：1527041712015

}
