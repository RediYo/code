package com.idouz.study.day10;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/13 9:26
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Apple a = new Apple();
        new Thread(a,"小A").start();
        new Thread(a,"小B").start();
        new Thread(a,"小C").start();
        System.out.println("begin...");
        for (int i = 0; i < 50; i++) {
            System.out.println("i="+i);
            Thread.sleep(1000);
        }
        System.out.println("end...");
    }
}
class Apple implements Runnable{
        private Integer nums=50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
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