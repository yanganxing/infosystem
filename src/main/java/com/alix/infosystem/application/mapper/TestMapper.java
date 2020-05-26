package com.alix.infosystem.application.mapper;

import com.alix.infosystem.application.model.entity.TestModel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 杨安星(Alix)
 * @create 2020-05-26 11:22
 */
@Mapper
public interface TestMapper extends BaseMapper<TestModel> {

    String insertModel(TestModel testModel);
}
