package com.ma.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.domain.CommonResult
 * @description DOTO
 * @since 2020/7/25 12:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }

}
