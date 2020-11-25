package com.liuwjg.innerclass;

/**
 * @author liuwjg
 */
public class Main {
    public static void main(String[] args) {
        //所线程测试，静态内部类单例是线程安全的
        Integer count = 100;
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
