package com.idouz.study.day08;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/11 14:20
 */
/*
异常的分类：
Throwable
Error
Exception->两类
1）RuntimeException->运行期异常-》可以不处理（JVM处理）
2）非RuntimeException
必须要处理：IOException SQLException
两种方式
1.throws
2.try-catch
--------------
为什么需要自定义异常？
我们说了早java中不同的异常类，分别表示着某一种具体的异常情况，那么在开发中总是有些异常情况是SUN公司没有定义好的
此时我们需要根据自己业务的异常情况来定义异常类。
---------------
什么是自定义异常:
在开发中根据自己业务的异常来定义的异常类
----------------
如果在父类中没有声明异常，那么在子类中就不能对其进行覆盖来声明异常
 */
public class LogicException extends Exception {
    public LogicException(String message) {
        super(message);
    }

    //异常信息
    //message 表示当前异常的信息
    //cause 表示异常的根本信息
    public LogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicException() {
        super();

    }

    public static void main(String[] args) {

    }
}
