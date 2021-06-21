package com.show.bgm.web.controller;

import com.show.bgm.api.CommomResult;
import com.show.bgm.core.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * test提交
     * @param name
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public User test(@RequestParam(value = "name")String name){
        CommomResult cr = new CommomResult();
        User user = new User();
        user.setId(cr.id);
        user.setName(name);
        return user;
    }
}
