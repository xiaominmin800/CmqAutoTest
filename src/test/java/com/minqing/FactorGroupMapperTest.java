package com.minqing;

import com.minqing.mappers.FactorGroupMapper;
import com.minqing.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.List;
import java.util.Map;

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
    public void getFactor() {
        log.info(groupService.getFactor("1"));
    }

}
