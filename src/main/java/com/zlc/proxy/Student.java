package com.zlc.proxy;

/**
 * @author : ZLC
 * @create : 2018-09-17 17:05
 * @desc : 需要被代理的实际类
 **/
public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {

        try {
            //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费50元");

    }
}
