package com.idouz.study.day10;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/13 10:33
 *
 * 1.同步代码块
 * 语法：
 * synchronized（同步锁）{
 *     需要同步操的代码；
 * }
 * java引进了线程同步机制
 * 同步监听对象，同步锁，同步监听器，互斥锁
 * 对象同步锁只是一个概念，可以想象为对象上标记了一个锁，
 * java程序允许使用任何对象作为同步监听对象，但是一般我们把当前并发访问的共同资源作为同步监听对象。
 * 注意：在任何时候，最多程序一个线程拥有同步锁，谁拿到就进入代码块，其他线程只能等待。
 * 原子性操作：不能分割，必须同步进行。
 */
public class SynchronizeDemo {
    public static void main(String[] args) throws InterruptedException {
        Apple2 a = new Apple2();
        new Thread(a,"小A").start();
        new Thread(a,"小B").start();
        new Thread(a,"小C").start();

    }
}
class Apple2 implements Runnable{
    private Integer nums=50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            synchronized (this){
                if (nums > 0) {
                    try {
                        //子类覆盖父类的方法
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "当前拿走第" + nums-- + "苹果");
                }
            }

        }
    }
}
