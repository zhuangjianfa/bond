package com.owner.bond.service;

import com.owner.bond.BaseTest;
import com.owner.bond.model.BondLog;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 数据抓取
 *
 * @author zhuangjf
 * @date 2021/9/3
 */
public class BondCatch extends BaseTest {

    @Resource
    private RestTemplate restTemplate;

    @Test
    public void test(){
        restTemplate.getForObject("http://api.jisuapi.com/illegal/carorg2?appkey=de394933e1a3e2db", BondLog.class);
    }
}
