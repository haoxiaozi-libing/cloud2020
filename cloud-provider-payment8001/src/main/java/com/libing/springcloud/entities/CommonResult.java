package com.libing.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author libing
 * @create 2021-03-01 22:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T result;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
