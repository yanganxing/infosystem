package com.alix.infosystem.application.service;

import com.alix.infosystem.application.model.dto.TestDto;
import com.alix.infosystem.application.model.vo.TestVo;

import java.util.List;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 11:24
 */

public interface ITestService {

    /**
     * @param testDto
     * @deprecated 新增、修改
     * */
    int save(TestDto testDto);

    int deleteById(String id);

    /**
     * 条件查询
     * */
    List<TestVo> queryVOList(TestDto queryDto);

    /**
     * 根据id获取
     * @param id
     * */
    TestVo loadById(String id);




}
