package com.idouz.study.firstcode;

/*
异常体系：
针对上述没有异常机制的缺点，我们提出
解决方案：
1）把不同类型的异常情况描述成不同类（称为异常类）
2）分离异常流程代码和正确流程代码。
3）灵活处理异常，如果当前方法处理不了，应该交给调用者处理
-------------------------------------------------------
非正常情况：
1）Error：表示错误，一般指JVM相关的不可修复的代码，如系统崩溃，内存溢出，JVM错误等
由JVM抛出，我们不需要处理，几乎所有的子类都是以Error作为类的后缀。
2）Exception：表示异常，指程序中出现不正常的情况，该问题可以修复（处理异常），几乎所有的子类都是以Exception作为类型的后缀。
-------------------------------------------------------
为了方便管理所有异常

-------------------
如果异常出现的话

使用try-catch捕获单个异常，语法如下：
try{
    编写可能会出现的异常代码；
}catch（异常类型 e）{
处理异常的代码；
//记录日志 打印异常信息 继续抛出异常
}
注意：try和catch不能单独使用
-----------------------------
如何获取异常信息
1.getMessage()
提示给用户的时候，就提示错误原因。
2.toString()
获取异常的类型和异常描述信息
3.printStackTrace()
打印异常的跟踪栈信息，并且输出到控制台，包括异常的类型，异常的原因，还包括异常出现的位置，在开发和调试阶段都得使用printStackTrace();
 */
public class Demo {
    public static void main(String[] args) {
        // StackOverflowError
        //因为递归太深而发生堆栈溢出，抛出该异常
        //Demo.main(args);

        //int[] arr=null;
        //System.out.println(arr.length);
        int a = 0;
        System.out.println(a);
        System.out.println("begin....");
        try {
            int ret = 10 / 0;
            System.out.println("结果" + ret);
        } catch (ArithmeticException e) {

            System.out.println("出现异常了" + e.getMessage());
            System.out.println("出现异常了" + e.toString());
            //打印信息到控制台
            e.printStackTrace();
        }
        System.out.println("end...");
        System.out.println("try-catch捕获异常");
    }
    public static void fly(){
        System.out.println("我要飞的更高");
    }

}
class fly{
    public fly() {
    }
}
