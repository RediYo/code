package com.idouz.study.day10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/13 15:28
 * 同步锁（Lock）
 */
public class LockDemo {
    public static void main(String[] args) {
        Apple3 a = new Apple3();
        new Thread(a, "小A").start();
        new Thread(a, "小B").start();
        new Thread(a, "小C").start();
    }
}

class Apple3 implements Runnable {
    private Integer nums = 50;
    //创建一个锁对象
    private final Lock lock=new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            eat();
        }
    }

    /**
     * 同步锁：
     * Lock机制提供了比synchronized代码块和方法更广发的操作，同步代码块/同步方法具有的功能，Lock都有，
     * 除此之外更强大，更体现面向对象
     *
     * ReentrantLock：一个可以重入的互斥锁Lock，它具有与使用synchronized方法和语句所访问的隐式监视器锁相同的一些基本行为和语义，
     * 但功能更强大
     * 语法结构：
     * 1.创建锁
     * 2.需要同步的方法，获取锁，加锁
     * 3.
     */
    public void eat() {
        lock.lock();
        if (nums > 0) {
            try {
                //子类覆盖父类的方法
                System.out.println(Thread.currentThread().getName() + "当前拿走第" + nums + "苹果");
                Thread.sleep(100);
                nums--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    /**
     * 小结：
     * 1.什么式并发/并行
     * 2.进程和线程的区别（面试题）
     * 3.创建线程。。。
     * 4.解决多线程并发时。。。
     */
}


