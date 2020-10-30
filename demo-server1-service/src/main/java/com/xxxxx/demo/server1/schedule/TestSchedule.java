package com.xxxxx.demo.server1.schedule;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author jinshiqiang
 */
@JobHandler("test")
@Component
public class TestSchedule extends IJobHandler {
    private final Logger log = LoggerFactory.getLogger(TestSchedule.class);

    @Override
    public ReturnT<String> execute(String s) {
        log.info("jobParams:" + s);
        return ReturnT.SUCCESS;
    }
}
