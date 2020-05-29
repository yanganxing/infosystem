package com.alix.infosystem.application.controller;

import com.alix.infosystem.application.model.dto.TestDto;
import com.alix.infosystem.application.model.vo.TestVo;
import com.alix.infosystem.application.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 11:38
 */
@RestController
@RequestMapping("test")
@Api(value = "testController",tags = "测试Controller")
@Slf4j
public class TestController {

    @Autowired
    private ITestService testService;

    @ApiOperation("根据Id查询实体")
    @GetMapping("/loadById")
    public TestVo loadById(@NonNull String id){
        log.info("请求参数如下：{}",id);
        return  testService.loadById(id);
    }

    @ApiOperation("新增/修改")
    @PostMapping("/save")
    public int save(@RequestBody TestDto testDto){
        log.info("请求参数如下：{}",testDto);
        return testService.save(testDto);
    }

}
