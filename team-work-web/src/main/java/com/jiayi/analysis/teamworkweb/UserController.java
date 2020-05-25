package com.jiayi.analysis.teamworkweb;

import com.jiayi.analysis.teamworkdata.User;
import com.jiayi.analysis.teamworkdata.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/ip.jsp")
    public User getUser(@RequestParam("ip") String ip){
        System.out.println(" >> " + ip);
        return userMapper.getUser();
    }

}
