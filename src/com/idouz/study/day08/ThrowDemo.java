package com.idouz.study.day08;

import com.idouz.study.firstcode.Demo;


/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/11 9:09
 */

/*
异常：
两种：
Error-》堆栈溢出 JVM报错
Exception-》有很多的类-》字段和方法-》按照规定
异常的类-》编译器-》制定了规范
标准规范-》接口的实现的过程
JDBC SQL
面向接口的编程
--------------------
捕获和处理异常
当使用多个catch的时候，必须先接受子类的异常，最后再使用父类异常
--------------------
记录日志：
e.printStackTrack();
提示给调用者，出现了什么异常类型和原因以及位置
捕获多个异常的时候：
catch(Exception e)必须放到最后
否则调用者在调用时，不知道发生了具体的异常类型和原因
finally代码块-》必须执行的
抛出异常：
1）使用throw在方法内部抛出一个异常对象
2）使用throw在方法声明上抛出一个异常对象
---------------------
throw：用于给调用者返回一个异常对象，和return一样会结束当前方法。

throw：用于表示当前方法不处理异常，而是提醒该方法的调用者来处理异常（抛出异常）
----------------------
throw:
抛出一个具体的异常对象
throw是返回一个错误，返回给该方法的调用者
*/

public class ThrowDemo {

    public static void main(String[] args) {
        Demo.fly();
        int ret=divide(10,2);
        System.out.println(ret);
        System.out.println("----------");
        try{
            int ret2=divide(10,0);
            System.out.println(ret2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    private static int divide(int num1,int num2){
        System.out.println("begin...");
        if(num2==0){
            throw new ArithmeticException("除数不能为0");
        }
        try{
            int ret=num1/num2;
            System.out.println("结果"+ret);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("end...");
        return 0;
    }
}
