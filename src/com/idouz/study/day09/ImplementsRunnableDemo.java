package com.idouz.study.day09;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/12 14:17
 * 实现Runnable接口
 */

public class ImplementsRunnableDemo {
    public static void main(String[] args) {
        //主线程
        System.out.println("开始了...");
        new Thread(new MusicThread()).start();
        //游戏
        for (int i = 0; i < 50; i++) {
            System.out.println("打游戏"+i);
            if(i==10){
                //创建线程并启动
                Runnable target= new MusicRunnable();
                Thread t = new Thread(target);
                t.start();
            }
        }
    }
}
class MusicRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("听音乐");
        }
    }
}