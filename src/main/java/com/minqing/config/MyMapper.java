package com.minqing.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * created by chenminqing
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
