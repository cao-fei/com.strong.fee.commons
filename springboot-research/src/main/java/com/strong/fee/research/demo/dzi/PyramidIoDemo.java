package com.strong.fee.research.demo.dzi;

import gov.nist.isg.archiver.DirectoryArchiver;
import gov.nist.isg.archiver.FilesArchiver;
import gov.nist.isg.pyramidio.BufferedImageReader;
import gov.nist.isg.pyramidio.PartialImageReader;
import gov.nist.isg.pyramidio.ScalablePyramidBuilder;

import java.io.File;

public class PyramidIoDemo {
    public static void write() {
        try {
            ScalablePyramidBuilder spb = new ScalablePyramidBuilder(1024,1,"png","dzi");
            FilesArchiver archiver = new DirectoryArchiver(new File("/Users/caofei/Downloads/dzi-jpg"));
            PartialImageReader pir=new BufferedImageReader(new File("/Users/caofei/Downloads/2017-01-15-02-55-11_2.tif"));
            spb.buildPyramid(pir,"name",archiver);
        } catch (Throwable e) {
        }
    }
}
