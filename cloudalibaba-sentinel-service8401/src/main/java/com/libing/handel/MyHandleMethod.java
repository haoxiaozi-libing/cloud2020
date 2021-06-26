package com.libing.handel;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.libing.springcloud.entities.CommonResult;

/**
 * @author lvlibing
 * @create 2021-06-26 21:39
 */
public class MyHandleMethod {


    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1","");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2","");
    }



}
