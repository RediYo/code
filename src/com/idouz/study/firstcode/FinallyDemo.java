package com.idouz.study.firstcode;

/*finally,表示一个代码块
特点：无论是否有异常，最终都会执行finally代码块
目的：释放资源
--------------------
什么时候的代码必须最终执行
当我们的try语句中开了一个物理资源（例如 数据库，网络）
我们都得在使用完之后，最终关闭打开的资源
-------------------------
finally两种语法：
1）try...catch...finally:此时要么有catch来捕获异常，因为此时根据应用场景，我们会抛出异常，自己不处理。
2）try...catch...finally:自身需要处理异常，最终还等关闭资源
注意点：finally不能单独使用
--------------------------
当只有try或者catch中调用退出JVM的方法，此时finally才不会执行，否则finally执行
-------------------
1)finally带return-》面试题
2)说说Error和Exception的区别
3）final、finally、finalize三者的区别
final:修饰符
finally:语句块
finalize:方法
4）无论是否有异常，finally代码块中的代码都会执行，这句话对吗？错
有特殊情况：JVM退出
 */
public class FinallyDemo {
    public static void main(String[] args) {
        //text();

        System.out.println( text2());
    }
    private static void text(){
        System.out.println("begin...");
        try {
            int ret = 10 / 0;
            System.out.println("结果" + ret);
        } catch (Exception e) {
            System.out.println("出现异常了");
            System.exit(0);
        }finally{
            System.out.println("关闭资源");
        }
        System.out.println("end...");
    }
    //演示：如果finally语句也带有return语句
    //永远返回finally的值

    private static int text2(){
        try{
            System.out.println("aa");
            return 1;
        }finally {
            System.out.println("bb");
            return 100;
        }
    }
    private static int text3(){
        int a=1;
        int d=0;
        try{
            return a;
        }finally {
            return d=(++a)+4;
        }
    }
}
