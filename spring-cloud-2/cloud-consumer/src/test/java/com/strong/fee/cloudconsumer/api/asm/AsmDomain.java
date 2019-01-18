package com.strong.fee.cloudconsumer.api.asm;

public class AsmDomain {
    private static Float v1 = 1.0f;
    private Integer v2 = 2;
    private int v3 = 3;

    public AsmDomain getDomain() {
        AsmDomain asmDomain = new AsmDomain();
        asmDomain.v3 = -3;
        asmDomain.v2 = -2;
        AsmDomain.v1 = -1.0f;
        return asmDomain;
    }

    public static Float getV1() {
        return v1;
    }

    public static void setV1(Float v1) {
        AsmDomain.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }

    public void setV2(Integer v2) {
        this.v2 = v2;
    }

    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }
}
