package com.minqing.service;

import com.minqing.mappers.FactorGroupMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

/**
 * created by chenminqing
 */
@Slf4j
@Service
public class GroupService {
    @Autowired
    private FactorGroupMapper factorGroupMapper;
    public String getFactor(String name){
        List<Map> groups = factorGroupMapper.findListByNameIfAbsent(name);
        log.info("这个数据是：：：："+groups.toString());

        if (CollectionUtils.isEmpty(groups)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (Map map : groups) {
            sb.append(map.get("name")).append(", ");
        }

        return sb.toString();
    }

}
