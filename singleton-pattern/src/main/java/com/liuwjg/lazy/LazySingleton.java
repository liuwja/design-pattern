package com.liuwjg.lazy;

/**
 * 懒汉式单例
 *
 * @author liuwjg
 * @since 2020年11月25日10:08:50
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println("构造方法被调用");
    }

    /**
     * 懒加载
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
