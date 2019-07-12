package com.idouz.study.day09;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/12 9:13
 */

/**
 * 引子：
 * 程序的运行流程：
 * 在没有流程控制的前提下，代码都是从上而下逐行执行的
 */
public class WhyDemo {
    public static void main(String[] args) {

        System.out.println("音乐");
        System.out.println("打游戏");
        playGame();
        playMusic();
        System.out.println("end...");
        /**
         * 造成该问题的原因：
         * 顺序结构：至上而下的一行一行执行
         * 无法完成我们的需求
         * 两个概念：微观的概念
         * 并行和并发-》相似又有区别
         * 并行：指两个或者多个事件在同一时刻发生：强调时间点
         * 并发：指两个或者多个事件在同一个时间段肯发生：强调时间段
         * --------------------------
         *线程是并行运行的，但是从微观角度分析确是串行运行的-》即一个线程一个线程的去运行
         * 当系统只有一个CPU时，线程会以某种顺序执行多个线程，称之为多线程调度
         * ------------------
         * 要解决多个程序并发操作-》进程和线程
         * 进程->指的是一个内存中运行中的应用程序。
         * 每一个进程都有自己独立的一块内存空间，一个应用程序可以同时启动多个线程
         *--------------------
         * 面试题：进程和线程的区别
         * 进程：有独立的空间，进程中的数据存放空间（堆和栈空间），至少有一个线程。
         * 线程：堆空间是共享的，栈空间是独立的，线程消耗的资源也比进程小，相互之间可以影响，又称为轻型进程或进程元。
         * --------------------
         * 因为一个进程中的多个线程是并发运行的，那么从微观角度来考虑也是有先后顺序的，那么哪个线程执行取决于CPU调度器，
         * 程序员控制不了，我们可以把多线程在瞬间抢CPU资源，谁抢到资源就运行谁，这也就造就了多线程的随机性。
         * java程序的进程里至少包含主线程和垃圾回收线程（后台线程）
         *---------------------
         * 多线程的优势：
         *1）提高应用程序的响应
         * 比如说：图形界面
         */
    }
    //打游戏方法
    private static void playGame(){
        for (int i = 0; i < 50; i++) {
            System.out.println("打游戏");

        }
    }
    //听音乐方法
    private static void playMusic(){
        for (int i = 0; i < 50; i++) {
            System.out.println("听音乐");

        }
    }

}
