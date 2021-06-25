package com.show.bgm.web.controller;

import com.show.bgm.api.CommonResult;
import com.show.bgm.core.model.UmsAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "TestController",description = "测试用例")
@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

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

}
