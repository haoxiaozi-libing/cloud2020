package com.libing.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author libing
 * @create 2021-03-01 22:14
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T result;

    public CommonResult(Integer code, String message,T result) {
        this.code = code;
        this.message = message;
        this.result=result;
    }
}
