package com.ssl.note.sentinel8401.handle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author: SongShengLin
 * @Date: 2023/01/20 15:27
 * @Describe: 自定义热点处理器
 */
public class HotHandle {
    public static String handlerException1(String hot1,
                                           String hot2,
                                           String hot3, BlockException exception) {
        return "handlerException1：系统异常，请稍后重试！";
    }

    public static String handlerException2(String hot1,
                                           String hot2,
                                           String hot3, BlockException exception) {
        return "handlerException2：网络崩溃了，请稍后重试！";
    }
}
