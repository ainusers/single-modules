package com.jiayi.analysis.teamworkweb.controller;

import com.jiayi.analysis.teamworkweb.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: tianyong
 * @time: 2020/3/22 16:11
 * @description:
 */
@Controller
public class Test {

    @Autowired
    private TestConfig testConfig;


    @ResponseBody
    @RequestMapping("/test")
    public void test (){
        System.out.println(testConfig.getSqls().get("one"));
    }

}
