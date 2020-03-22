package com.jiayi.analysis.teamworkweb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: tianyong
 * @time: 2020/3/22 18:37
 * @description:
 */
@Component
@PropertySource(value = {"classpath:mapper.yml"},factory = MixPropertySourceFactory.class)
@ConfigurationProperties(prefix="config")
public class TestConfig {

    private Map<String,Map<String,Object>> sqls = new HashMap<>();

    public Map<String, Map<String, Object>> getSqls() {
        return sqls;
    }

    public void setSqls(Map<String, Map<String, Object>> sqls) {
        this.sqls = sqls;
    }

    @Override
    public String toString() {
        return "TestConfig{" +
                "sqls=" + sqls +
                '}';
    }
}
