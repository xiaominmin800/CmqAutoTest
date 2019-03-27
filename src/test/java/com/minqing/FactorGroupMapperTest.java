package com.minqing;

import com.cmq.HttpClientUtil;
import com.cmq.HttpResponse;
import com.minqing.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
/**
 * created by chenminqing
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Example.class)
@Slf4j
public class FactorGroupMapperTest extends AbstractTestNGSpringContextTests {

    @Autowired
    //private FactorGroupMapper factorGroupMapper;
    private GroupService groupService;
    @org.testng.annotations.Test
    public void getFactor() throws Exception {
        HttpClientUtil httpUtils = new HttpClientUtil();
        HttpResponse hre = httpUtils.httpGet("http://47.97.171.60:30026/eaglehorn-risk-data/api/v1/node/1" , null, null, null);
        log.info(hre.getBody());
        log.info(groupService.getFactor("1"));
    }



}
