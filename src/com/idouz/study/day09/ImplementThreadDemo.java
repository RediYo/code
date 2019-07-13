package com.idouz.study.day09;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/12 15:31
 * 面试题：分析继承方式和实现方式的区别
 * 继承方式：
 * 1.java中类是单继承，如果继承了Thread了，该类就不能再有其他的直接父类。
 * 2.从操作性上分析，继承方式更简单，获取线程名字也简单。
 * 3.从线程共享同一个资源上分析，继承方式不能做到。
 * 实现方式：
 * 1.java中类可以实现多个接口，此时类还可以继承其他类，并且还可以实现其他接口（设计上更优雅）
 * 2.从操作性上分析，实现方式稍微复杂，获取线程名字也比较复杂，使用Thread.currentThread来获取当前线程的引用
 * 3.从多线程共享同一个资源上分析，实现方式可以做到。
 * -----------------------
 * 1）从完成功能上来说：都可以
 * 2）从简单易用上来说：继承稍微简单
 * 3）从共享同一份资源：实现方式可以
 * 4）从多态的角度：java是单继承，实现更合理
 * 什么时候使用：
 * 1）如果该类还需要及继承其他类
 * 2）多个线程需要共享资源
 * 此时只能使用实现方式，其他情况，任选，一般推荐使用实现方式。
 */
public class ImplementThreadDemo {
    public static void main(String[] args) {

        Apple a = new Apple();
        new Thread(a, "小A").start();
        new Thread(a, "小B").start();
        new Thread(a, "小C").start();

    }
}

class Apple implements Runnable {
    private Integer nums = 50;


    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {

            System.out.println(Thread.currentThread().getName() + "当前拿走第" + i++ + "苹果");
        }
    }
}
