package com.strong.fee.cloudconsumer.api.asm;

import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;

import static org.objectweb.asm.Opcodes.*;
import static org.objectweb.asm.Opcodes.V1_8;

public class AsmWriter {

    public static void write() throws Exception {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_8, ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE,
                "pkg/Comparable", null, "java/lang/Object",
                new String[]{"pkg/Mesurable"});
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "LESS", "I",
                null, new Integer(-1)).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "EQUAL", "I",
                null, new Integer(0)).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "GREATER", "I",
                null, new Integer(1)).visitEnd();
        cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT, "compareTo",
                "(Ljava/lang/Object;)I", null, null).visitEnd();
        cw.visitEnd();
        byte[] code = cw.toByteArray();
        File file = new File("./Comparable.class");
        FileOutputStream output = new FileOutputStream(file);
        output.write(code);
        output.close();
    }
}
