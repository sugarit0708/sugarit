package com.sugarit.day210814;

/**
 * @description:
 * @author: lxx
 * @time: 2021/8/14 18:30
 */
public class EqualsDemo {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Hello");
        String s3=s2;
        System.out.println(s1==s2);//        false
        System.out.println(s1==s3);//        false
        System.out.println(s2==s3);//        true
        System.out.println(s1.equals(s2));//        true
        System.out.println(s1.equals(s2));//        true
        System.out.println(s2.equals(s3));//        true
    }
}
