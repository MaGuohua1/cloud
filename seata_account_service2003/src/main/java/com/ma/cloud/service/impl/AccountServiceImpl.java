package com.ma.cloud.service.impl;

import com.ma.cloud.mapper.AccountMapper;
import com.ma.cloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.service.impl.AccountServiceImpl
 * @description DOTO
 * @since 2020/7/26 11:18
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper mapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------->account-service中扣减账户余额开始");

        mapper.decrease(userId, money);
        log.info("------->account-service中扣减账户余额结束");
    }
}
