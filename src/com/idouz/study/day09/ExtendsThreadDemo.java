package com.idouz.study.day09;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/12 11:10
 * 方式1：继承Thread类
 */
public class ExtendsThreadDemo {
    public static void main(String[] args) {
        System.out.println("开始了");
        //创建线程对象
        MusicThread music = new MusicThread();
        //启动线程
        music.start();
        //主线程中
        for (int i = 0; i < 50; i++) {
            System.out.println("打游戏"+i);
            if(i==10){
                MusicThread t = new MusicThread();
                t.start();
                t.run();//不能使用run
            }
        }
    }
}
class MusicThread extends java.lang.Thread{
    @Override
    public void run() {
        //super.run();
        for (int i = 0; i < 50; i++) {
            System.out.println("听音乐"+i);
        }
    }
}
