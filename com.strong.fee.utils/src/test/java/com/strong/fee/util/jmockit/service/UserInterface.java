package com.strong.fee.util.jmockit.service;

/**
 * author: 小殊
 * create: 2018/7/23 下午2:48
 */
public class UserInterface {

    private InterfaceWithDefault interfaceWithDefault;

    public UserInterface(InterfaceWithDefault interfaceWithDefault) {
        this.interfaceWithDefault = interfaceWithDefault;
    }

    public int add() {
        return interfaceWithDefault.fun() + interfaceWithDefault.defaultInt();
    }
}
