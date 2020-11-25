package com.liuwjg.hunger;

/**
 * 饿汉式单例
 *
 * @author liuwjg
 * @since 2020年11月25日09:37:24
 */
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();

    //构造方法私有化
    private HungerSingleton() {
        System.out.println("构造方法被调用");
    }

    public static HungerSingleton getInstance() {
        return instance;
    }
}
