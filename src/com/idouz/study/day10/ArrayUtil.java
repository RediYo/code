package com.idouz.study.day10;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/13 15:21
 * 单例模式
 */
public class ArrayUtil {
    private ArrayUtil(){

    }
    private static ArrayUtil instance=null;
    public static ArrayUtil getInstance(){
        if (instance == null) {
            synchronized (ArrayUtil.class) {
                instance=new ArrayUtil();
            }
        }
        return instance;
    }
}
