package com.alix.infosystem.application.service.impl;

import com.alix.infosystem.application.mapper.TestMapper;
import com.alix.infosystem.application.model.dto.TestDto;
import com.alix.infosystem.application.model.entity.TestModel;
import com.alix.infosystem.application.model.vo.TestVo;
import com.alix.infosystem.application.service.ITestService;
import com.alix.infosystem.common.utils.StringUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 11:24
 */

@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;


    @Override
    public List<TestVo> queryVOList(TestDto queryDto) {
        return null;
    }

    @Override
    public TestVo loadById(String id) {
        TestVo testVo = new TestVo();
        TestModel testModel = testMapper.selectById(id);
        BeanUtils.copyProperties(testModel,testVo);
        return testVo;
    }

    @Override
    public int save(TestDto testDto) {
        TestModel testModel = new TestModel();
        BeanUtils.copyProperties(testDto,testModel);
        if(null == testDto.getId()){
            return testMapper.insert(testModel);
        }else {
            return  testMapper.updateById(testModel);
        }
    }

    @Override
    public int deleteById(String id) {
        return testMapper.deleteById(id);
    }
}
