package com.idouz.study.day09;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/12 15:14
 */
public class ExtendsDemo {
    public static void main(String[] args) {

        //创建三个进程吃苹果
        new Student1("小A").start();
        new Student1("小B").start();
        new Student1("小C").start();
    }
}
class  Student1 extends Thread{
    private Integer nums=50;
    private String name="";

    public Student1(String name) {

        super(name);

    }

}
