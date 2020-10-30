package com.xxxxx.demo.server1.dao;


import com.xxxxx.common.spring.mybatis.BaseMapper;
import com.xxxxx.demo.server1.pojo.vo.TestOneVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jinshiqiang
 */
@Mapper
public interface TestOneMapper extends BaseMapper<TestOneVO> {
}
