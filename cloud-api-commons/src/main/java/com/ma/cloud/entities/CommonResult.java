package com.ma.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class com.ma.cloud.entities.CommonResult
 * @Description DOTO
 * @Author MaGuohua
 * @Create 2020/6/24 9:39
 * @Version v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String massage;
    private T data;

    public CommonResult(Integer code, String massage) {
        this(code,massage,null);
    }
}
