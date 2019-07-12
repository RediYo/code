package com.idouz.study.day08;

/**
 * @author idouz
 * @version 1.0
 * @date 2019/7/11 14:36
 */
/*
异常链：把原始的异常包装为新的异常类，从而形成了多个异常的有序序列，有助于查找异常的根本原因
 */
@SuppressWarnings("ALL")
public class Register {

    private static String[] names={"baba","mama","yaya"};
    public static void main(String[] args) {
        try {
            checkUserName("baba");
            System.out.println("注册成功");
        } catch (LogicException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param username
     * @throws LogicException
     */
    public static void checkUserName(String username) throws LogicException{
        for (String name:names){
            if(name.equals(username)){
                throw new LogicException("亲，"+"name"+"已经注册了");
            }
        }

    }
}
