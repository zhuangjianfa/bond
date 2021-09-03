package com.owner.bond;

import com.owner.bond.manager.BondLogManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BondApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class BaseTest {

    @Resource
    private BondLogManager bondLogManager;

    @Test
    public void test(){
        bondLogManager.getById(1);
    }

}