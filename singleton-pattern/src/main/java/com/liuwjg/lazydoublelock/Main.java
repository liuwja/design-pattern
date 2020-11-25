package com.liuwjg.lazydoublelock;

/**
 * @author liuwjg
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 多线程模拟，饿汉式双重锁单例是线程安全的
         */
        Integer count = 100;
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                LazySingletonDoubleLock instance = LazySingletonDoubleLock.getInstance();
                System.out.println(instance);
            }).start();
        }

    }
}
