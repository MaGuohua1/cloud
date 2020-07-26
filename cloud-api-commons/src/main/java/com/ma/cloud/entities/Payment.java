package com.ma.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Class com.ma.cloud.entities.Payment
 * @Description DOTO
 * @Author MaGuohua
 * @Create 2020/6/24 9:33
 * @Version v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
