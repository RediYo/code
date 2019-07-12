package com.idouz.study.day08;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/11 15:24
 */
/*
 * 什么是异常：非正常的，不同于平常的
 * 程序中代码出现错误-》终止运行
 *
 * 异常指的是什么
 * 异常并不是语法错误，语法错误，编译不通过
 * 不会产生字节码文件，根本不能运行。
 *
 * 为什么要学异常机制
 * 异常处理衡量一门语言是否成熟的标准之一
 * java，c++，c#等都有异常处理机制
 * 异常处理机制可以让程序有更好的容错性
 *
 * c语言没有异常，特定返回值来表示异常情况
 * 使用if语句来判断正常和非正常的关系。
 *
 *
 * if-else 其实就是异常的一种，没有异常处理机制，代码中将充斥着大量的if-else
 *
 * 没有异常存在的缺点
 * 1）使用方法的返回值来表示异常情况有限，无法穷举所有的异常情况
 * 2）异常流程和正常代码混合在一起，增大了程序的复杂性，可读性不好
 * 3）随着系统规模扩大，程序的可维护性极低
 */
public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car car= new Car();
        Worker work = new Worker(car);
        new Worker(car);
        new Worker(car);

    }

}
class Worker{
    public static final int LATE=0;
    public static final int IN_TIME=0;

    private Car car=null;
    public Worker(Car car){
        this.car=car;
    }
    public int gotoWork(){
        if(car.run()==Car.NO_OK){
            walk();
            return LATE;
        }else{
            System.out.println("开车去上班");
            return IN_TIME;
        }
    }

    public void walk(){
        System.out.println("走路去上班");
    }
}
class Car{
    public static final int NO_OK=0;
    public static final int OK=1;

    public int run(){
        int a=0;
        if(a==0){
            System.out.println("爆胎了");
            return NO_OK;
        }else{

        }
        System.out.println("开车去上班");
        return OK;
    }

}

