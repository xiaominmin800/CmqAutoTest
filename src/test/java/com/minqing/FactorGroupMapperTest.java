package com.minqing;

import com.minqing.mappers.FactorGroupMapper;
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
    private FactorGroupMapper factorGroupMapper;

    @org.testng.annotations.Test
    public void getFactor(){
        String name="1";
        List<Map> groups = factorGroupMapper.findListByNameIfAbsent(name);
        log.info("这个数据是：：：："+groups.toString());

//        if (CollectionUtils.isEmpty(groups)) {
//            return null;
//        }

        StringBuilder sb = new StringBuilder();
        for (Map map : groups) {
            sb.append(map.get("name")).append(", ");
        }

//        return sb.toString();
    }

}
