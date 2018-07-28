package com.strong.fee.util.jmockit.service;

/**
 * author: 小殊
 * create: 2018/7/23 下午2:27
 */
public interface InterfaceWithDefault {

    int fun();

    default int defaultInt() {
        return 1;
    }

    default int add() {
        return fun() + defaultInt();
    }
}
