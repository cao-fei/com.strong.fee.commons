package com.module1;

import org.junit.Test;

public class HellJniTest {
    @Test
    public void test001(){
        System.loadLibrary("hellojni");
        HellJni hellJni=new HellJni();
        hellJni.testHello();
    }
}
