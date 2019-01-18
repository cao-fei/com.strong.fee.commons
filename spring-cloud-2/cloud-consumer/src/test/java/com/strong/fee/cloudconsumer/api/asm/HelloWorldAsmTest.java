package com.strong.fee.cloudconsumer.api.asm;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;

import static org.objectweb.asm.ClassReader.SKIP_CODE;

public class HelloWorldAsmTest {
    @Test
    public void test001() throws Exception {
        ClassWriter classWriter = new ClassWriter(0);
        String className = "com/sunchao/asm/HelloWorld";
        classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, className, null,
                "java/lang/Object", null);


        MethodVisitor initVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>",
                "()V", null, null);
        initVisitor.visitCode();
        initVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        initVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>",
                "V()", false);
        initVisitor.visitInsn(Opcodes.RETURN);
        initVisitor.visitMaxs(1, 1);
        initVisitor.visitEnd();

        MethodVisitor helloVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "sayHello",
                "()V;", null, null);
        helloVisitor.visitCode();
        helloVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out",
                "Ljava/io/PrintStream;");
        helloVisitor.visitLdcInsn("hello world!");
        helloVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream",
                "println", "(Ljava/lang/String;)V", false);
        helloVisitor.visitInsn(Opcodes.RETURN);
        helloVisitor.visitMaxs(1, 1);
        helloVisitor.visitEnd();

        classWriter.visitEnd();
        byte[] code = classWriter.toByteArray();
        File file = new File("./HelloWorld.class");
        FileOutputStream output = new FileOutputStream(file);
        output.write(code);
        output.close();
    }

    @Test
    public void test002() throws Exception {
        AsmReader asmReader = new AsmReader();

        ClassReader classReader = new ClassReader("com.strong.fee.cloudconsumer.api.asm.AsmReader");
        classReader.accept(asmReader, 0);
    }

    @Test
    public void test003() throws Exception {
        AsmWriter.write();
    }

    @Test
    public void test004() throws Exception {
        ClassWriter cw = new ClassWriter(0);
        TraceClassVisitor visitor = new TraceClassVisitor(cw, new PrintWriter(System.out));

        ClassReader classReader = new ClassReader("com.strong.fee.cloudconsumer.api.asm.AsmDomain");
        classReader.accept(visitor, 0);

    }

    @Test
    public void test005() throws Exception {
        ClassWriter cw = new ClassWriter(0);
        CheckClassAdapter visitor = new CheckClassAdapter(cw);

        ClassReader classReader = new ClassReader("com.strong.fee.cloudconsumer.api.asm.AsmDomain");
        classReader.accept(visitor, 0);

    }

}
