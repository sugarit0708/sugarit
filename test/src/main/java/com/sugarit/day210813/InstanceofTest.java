package com.sugarit.day210813;

/**
 * @description:
 * @author: lxx
 * @time: 2021/8/13 16:32
 */
public class InstanceofTest {
    public static void main(String[] args) {
        Integer anInt = 1;
        boolean result = anInt instanceof Integer;
        System.out.println(result);//true
        System.out.println(null instanceof Object);//false
    }
}
