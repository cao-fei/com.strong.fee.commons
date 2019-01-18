package com.strong.fee.cloudconsumer.api.asm;

import org.objectweb.asm.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static jdk.internal.org.objectweb.asm.Opcodes.ASM4;

public class AsmReader extends ClassVisitor {
    private Logger logger = LoggerFactory.getLogger(AsmReader.class);

    private static final Integer VALUE = 1;

    public AsmReader() {
        super(ASM4);
    }

    public AsmReader(int api) {
        super(api);
    }

    public AsmReader(int api, ClassVisitor classVisitor) {
        super(api, classVisitor);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        String interfacesStr = interfaces == null ? "" : Arrays.asList(interfaces).stream().reduce((o, b) -> String.format("%s,%s", o, b)).orElse("");
        logger.info("{} {} extends {} implements {} {", access, name, superName, interfacesStr);
    }

    @Override
    public void visitSource(String source, String debug) {
        super.visitSource(source, debug);
    }

    @Override
    public ModuleVisitor visitModule(String name, int access, String version) {
        return super.visitModule(name, access, version);
    }

    @Override
    public void visitNestHost(String nestHost) {
        super.visitNestHost(nestHost);
    }

    @Override
    public void visitOuterClass(String owner, String name, String descriptor) {
        super.visitOuterClass(owner, name, descriptor);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        return super.visitAnnotation(descriptor, visible);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
        return super.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }

    @Override
    public void visitAttribute(Attribute attribute) {
        super.visitAttribute(attribute);
    }

    @Override
    public void visitNestMember(String nestMember) {
        super.visitNestMember(nestMember);
    }

    @Override
    public void visitInnerClass(String name, String outerName, String innerName, int access) {
        super.visitInnerClass(name, outerName, innerName, access);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        logger.info("{} {} {} {} {}", access, name, descriptor, signature, value);
        return super.visitField(access, name, descriptor, signature, value);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        String exceptionsStr = exceptions == null ? "" : Arrays.asList(exceptions).stream().reduce((o, b) -> String.format("%s,%s", o, b)).orElse("");
        logger.info("{} {} {} {} {}", access, name, descriptor, signature, exceptionsStr);
        return super.visitMethod(access, name, descriptor, signature, exceptions);
    }

    @Override
    public void visitEnd() {
        logger.info("}");
        super.visitEnd();
    }
}
