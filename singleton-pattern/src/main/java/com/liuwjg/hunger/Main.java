package com.liuwjg.hunger;

/**
 * @author liuwjg
 * @since 2020年11月25日09:41:05
 */
public class Main {
    public static void main(String[] args) {
//        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
//        System.out.println(hungerSingleton);

        //多线程模拟饿汉单例,饿汉式单例是线程安全的
        Integer size = 20;
        for (int i = 0; i < size; i++) {
            new Thread(() -> {
                HungerSingleton hungerSingleton = HungerSingleton.getInstance();
                System.out.println(hungerSingleton);
            }).start();
        }
    }
}
