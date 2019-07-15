package com.idouz.study.day11;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/14 9:14
 * 模板方法设计模式-》总体的算法骨架，子类不能更改
 */
public class TextDemo01 {
    public static void main(String[] args) {
        //统计
        long time = new StringOperate().getTotalTime();
    }
}

abstract class AbstractOperateTimeLate{
    public long getTotalTime(){
        //开始时间
        long begin = System.currentTimeMillis();
        //具体操作
        //结束时间
        long end=System.currentTimeMillis();
        //结束时间减去开始时间
        long time = end - begin;
        //返回时间差
        return time;
    }
}
class StringOperate extends AbstractOperateTimeLate{

}
/**
 * 模板方法设计模式：
 * 在父类的一个方法中定义一个总体的算法骨架，而将某一些步骤延迟到子类中，因为不同的子类实现细节不同，模板方法使得子类可以在不
 * 改变算法结果的情况下，重新定义算法中的某些步骤。
 *
 * 抽象类
 * 抽象父类负责定义操作中的业务骨架，而把某些具体的实现步骤延迟到子类中去实现
 *
 * 注意：抽象父类提供的模板方法只是定义了一个通用的算法，其实现必须依赖子类的辅助。
 * 模板方法作为模板样式不准被修改
 */
