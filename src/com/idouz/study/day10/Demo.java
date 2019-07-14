package com.idouz.study.day10;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/13 14:28
 * 不使用synchronised直接修饰run方法，修饰某一个线程就执行完了所有的功能，好比是多个线程串行。
 * 解决方法：把需要同步的代码定义在一个新的方法中，并且该方法使用synchronized修饰，再在run方法中调用即可
 *
 * synchronized好与坏：
 * 好处：保证了多线程并发访问时的同步操作，避免了线程安全性问题。
 * 缺点：要使用synchronized的方法/代码块的性能比不使用要低一点。
 * 建议：尽量减少synchronized的作用域。
 *
 * 面试题：
 * 1.StringBuilder 和 StringBuffer的区别
 * 2.说说ArrayList和Vector的区别
 * 3.说说HashMap
 */
public class Demo {
    public static void main(String[] args) {
        Apple1 a = new Apple1();
        new Thread(a,"小A").start();
        new Thread(a,"小B").start();
        new Thread(a,"小C").start();
    }
}
class Apple1 implements Runnable{
    private Integer nums=50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            eat();
        }
    }
    synchronized public void eat(){
        if (nums > 0) {
            System.out.println(Thread.currentThread().getName() + "当前拿走第" + nums-- + "苹果");
            try {
                //子类覆盖父类的方法
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
