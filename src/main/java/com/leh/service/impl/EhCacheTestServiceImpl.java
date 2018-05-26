package com.leh.service.impl;

import com.leh.service.EhCacheTestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Auther: Administrator
 * @Date: 2018/5/23 09:17
 * @Description:
 */
@Service
public class EhCacheTestServiceImpl implements EhCacheTestService{
    @Cacheable(value = "cacheTest", key="#param")
    @Override
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        System.out.println("当前时间：" + timestamp.toString());
        return timestamp.toString();
    }
}
