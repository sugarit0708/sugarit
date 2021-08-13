package com.sugarit.day210813;

/**
 * @description:重载
 * @author: lxx
 * @time: 2021/8/13 16:56
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest overload = new OverloadTest();
        overload.sayHello();//Hello
        overload.sayHello("Son");//Hello,Son
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayHello(String name) {
        System.out.println("Hello," + name);
    }
}
