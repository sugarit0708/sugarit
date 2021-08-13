package com.sugarit.day210813;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:内存泄露
 * @author: lxx
 * @time: 2021/8/13 16:54
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
//            TimeUnit.MILLISECONDS.sleep(1);
            list.add(new OOMObject());
        }
    }
}
