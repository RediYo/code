package com.idouz.study.day09;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/12 14:32
 * 推荐使用接口和lambda,不推荐使用类继承实现线程
 */
public class InnerClassDemo {
    public static void main(String[] args) {

    }
    private static void text2(){
        for (int i = 0; i < 50; i++) {
            System.out.println("打游戏"+i);
            System.out.println("打游戏"+i);
        }
    }
    private static void text3 (){
        for (int i = 0; i < 50; i++) {
            System.out.println("打游戏...");
            if (i == 10) {
                new Thread(()->{
                    for (int j = 0; j < 50; j++) {
                        System.out.println("听音乐"+j);
                    }
                }).start();
            }
        }
    }

}

