package com.xxxxx.demo.server1.dao;


import com.xxxxx.common.spring.mybatis.BaseMapper;
import com.xxxxx.demo.server1.pojo.vo.TestOneVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jinshiqiang
 */
@Mapper
public interface TestOneMapper extends BaseMapper<TestOneVO> {

    /**
     * 获取全部数据
     *
     * @return
     */
    List<TestOneVO> findAll();
}
