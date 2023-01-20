package com.ssl.note.sentinel8401.controller;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ssl.note.sentinel8401.handle.HotHandle;
import com.ssl.note.sentinel8401.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

@RestController
public class FlowLimitController {

    @Autowired
    private TestService testService;

    @GetMapping("/testA")
    public String testA() {
        System.out.println("testA");
        return "-----testA";
//        return testService.common();
    }

    @GetMapping("/testB")
    public String testB() {
//        return "-----testB";
        return testService.common();
    }

    /**
     * 热点规则：命中配置规则
     */
    @GetMapping("/testHotKey")
//    @SentinelResource(value = "testHotKey", blockHandler = "blockHandle")
    @SentinelResource(value = "testHotKey",
            blockHandlerClass = HotHandle.class,
            blockHandler = "handlerException1")
    public String testHotKey(@RequestParam(value = "hot1", required = false) String hot1,
                             @RequestParam(value = "hot2", required = false) String hot2,
                             @RequestParam(value = "hot3", required = false) String hot3) {
        return "----testHotKey";
    }


    /**
     * 热点规则：抛出Java异常
     */
    @GetMapping("/testHotKeyById/{id}")
    @SentinelResource(
            value = "falllback",
            fallback = "fallbackHandler",
            exceptionsToIgnore = {ArithmeticException.class}// 指定排除不用sentinel处理的Java异常
    )
    public String testHotKey(@PathVariable("id") Long id) {
        if (id < 3) {
            return "----testHotKeyById";
        }
        throw new NullPointerException("id>=3，抛出异常");
    }

    /**
     * 热点规则命中后接受到的异常的fallbackHandler
     * 必须是public的
     */
    public String fallbackHandler(Long id, Throwable exception) {
        // 这里可以返回一个json
        return "命中id>=3,抛出空指针异常";
    }

    /**
     * 热点规则命中后的blockHandler
     * 必须是public的
     */
    public String blockHandle(String hot1,
                              String hot2,
                              String hot3, BlockException exception) {
        return "系统繁忙！请稍后再试";
    }


    /**
     * 持久化配置
     */
    @GetMapping("/order/test1")
    @SentinelResource(value = "test1")
    public String test1() throws InterruptedException {
        return "test1 ";
    }

}
