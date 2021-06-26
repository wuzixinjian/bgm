package com.show.bgm.web.controller;

import com.show.bgm.api.CommonResult;
import com.show.bgm.core.model.UmsAdmin;
import com.show.bgm.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "TestController",description = "测试用例")
@RestController
public class TestController {

    @Autowired
    RedisService redisService;
    /**
     * test提交
     * @param name
     * @return
     */
    @ApiOperation("测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public CommonResult<UmsAdmin> test(@RequestParam(value = "name")String name) throws Exception {
        UmsAdmin u = new UmsAdmin();
        u.setNickName(name);
        return CommonResult.success(u);
    }

    @ApiOperation("测试redis")
    @RequestMapping(value = "/testRedis", method = RequestMethod.GET)
    public CommonResult<Object> testRedis(){
        String prefix = "bgm:test:";
        redisService.set(prefix+"testPrefixKey","testPrefixValue");
        return CommonResult.success(redisService.get(prefix+"testPrefixKey"));
    }
}
