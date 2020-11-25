package com.liuwjg.innerclass;

/**
 * 静态内部类实现单例
 *
 * @author liuwjg
 */
public class InnerClassSingleton {
    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
        System.out.println("私有构造方法被调用");
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
