package com.idouz.study.firstcode;

/*
面向过程编程-》很注重逻辑
面向对象编程-》类 对象 封装 继承 多态
面向接口的编程-》对外的接口 接口的实现
--------------------------------------
使用try-catch捕获异常：
捕获多个异常的时候
try{
    可能出现异常代码;
}catch(异常类型A e){

}catch(异常类型B e){

}
------------------------
注意点：
1.一个catch语句，只能捕获一种类型的异常，如果需要捕获多种异常，就得使用多个catch语句
2.代码在一瞬间只能出现一种类型的异常，只需要一个catch捕获，不可能出现多个异常。
注意点2：
try{

}catch(Exception e)必须放最后
 */
//捕获多个异常
public class MultiCatchDemo {
    public static void main(String[] args) {
        String sNum1 = "10";
        String sNum2 = "0";


/*        //两个整数相除，可能出现的问题
        int ret=num1/num2;
        System.out.println("结果"+ret);*/
//使用try-catch
        try {
            int num1 = Integer.parseInt(sNum1);
            int num2 = Integer.parseInt(sNum2);
            int ret = num1 / num2;
        } catch (NumberFormatException e) {
            System.out.println("类型转换异常");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("除数为0异常");
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
