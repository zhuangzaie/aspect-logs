package com.crane.aspect.log.service.impl;

import com.crane.aspect.log.service.TestService;
import com.crane.aspect.log.domain.OperLogEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: crane
 * @create: 2023-03-12
 **/
@Service
public class TestServiceImpl implements TestService {

    /**
     * 操作日志记录
     *
     * @param operLogEvent 操作日志事件
     */
    @Async
    @EventListener
    public void recordOper(OperLogEvent operLogEvent) throws InterruptedException {
        System.out.println(operLogEvent.toString());
        Thread.sleep(3000L);
    }
}
