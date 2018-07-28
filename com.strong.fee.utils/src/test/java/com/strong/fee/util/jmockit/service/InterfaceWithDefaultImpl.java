package com.strong.fee.util.jmockit.service;

/**
 * author: 小殊
 * create: 2018/7/23 下午2:29
 */
public class InterfaceWithDefaultImpl implements InterfaceWithDefault {
    @Override
    public int fun() {
        return 23;
    }

    @Override
    public int defaultInt() {
        return 34;
    }
}
