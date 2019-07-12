package com.idouz.study.day08;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Date;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/11 10:19
 */
public class ThrowsDemo {
    public static void main(String[] args) {

        int n=100;
        boolean b= false;

        System.out.println(new Date());
    }
    /*
    两个作用：
    1.在本方法中不处理某种类型的单个异常
    2.提醒调用者需要了解该异常
     */
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