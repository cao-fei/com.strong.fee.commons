package com.strong.fee.research.demo.service;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * author: 小殊
 * create: 2018/7/29 下午4:07
 */
@Service
@Data
public class UserService implements IUserService {
    private Integer value = (int) (Math.random() * 1000);


    @Override
    public Integer getValue() {
        return value;
    }
}
