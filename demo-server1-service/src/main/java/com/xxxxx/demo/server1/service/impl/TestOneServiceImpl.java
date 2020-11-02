package com.xxxxx.demo.server1.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.xxxxx.demo.server1.dao.TestOneMapper;
import com.xxxxx.demo.server1.pojo.vo.TestOneVO;
import com.xxxxx.demo.server1.service.inner.TestOneService;
import com.xxxxx.demo.server2.pojo.po.TestTwoVO;
import com.xxxxx.demo.server2.rpc.TestTwoRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author jinshiqiang
 */
@Service
public class TestOneServiceImpl implements TestOneService {

    private final TestOneMapper testOneMapper;
    private final TestTwoRpc testTwoRpc;

    @Autowired
    public TestOneServiceImpl(TestOneMapper testOneMapper, TestTwoRpc testTwoRpc) {
        this.testOneMapper = testOneMapper;
        this.testTwoRpc = testTwoRpc;
    }

    @Override
    @LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    public TestOneVO testOne() {
        TestTwoVO t2 = new TestTwoVO();
        t2.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        t2.setValue(UUID.randomUUID().toString().replaceAll("-", ""));
        testTwoRpc.sendTestTwo(t2);
        testOneMapper.findAll();
        TestOneVO t = new TestOneVO();
        t.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        t.setValue(UUID.randomUUID().toString().replaceAll("-", ""));
        testOneMapper.insert(t);
//        int i = 0;
//        i = i / i;
        return t;
    }
}
