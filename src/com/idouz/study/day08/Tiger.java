package com.idouz.study.day08;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/11 10:34
 */
//父类
/*
方法的覆盖：
两小：

 */
interface IWalkable {
    void walk() throws RuntimeException;
}

//子类方法不能抛出新的异常
public class Tiger implements IWalkable{
    public static void main(String[] args){

    }

    @Override
    public void walk() throws RuntimeException {

    }
}
