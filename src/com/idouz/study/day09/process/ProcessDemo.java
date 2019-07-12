package com.idouz.study.day09.process;

import java.io.IOException;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/12 10:57
 */
//在java中开启一个进程
public class ProcessDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime.toString());
        runtime.exec("notopad");

        ProcessBuilder pb = new ProcessBuilder("notopad");
        pb.start();
    }
}
