package com.strong.fee.cloudconsumer.api.asm;

import java.security.ProtectionDomain;

public class AsmClassLoader extends ClassLoader {
    public Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }


}
