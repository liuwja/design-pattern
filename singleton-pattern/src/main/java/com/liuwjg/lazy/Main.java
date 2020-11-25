package com.liuwjg.lazy;

/**
 * @author liuwjg
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 多线程破坏懒汉式单例
         */
        Integer count = 100;
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(lazySingleton);
            }, "thread" + i).start();
        }
    }

}
