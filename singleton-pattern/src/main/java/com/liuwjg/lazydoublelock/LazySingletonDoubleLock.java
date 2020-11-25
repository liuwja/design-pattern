package com.liuwjg.lazydoublelock;

/**
 * 双重锁校验单例
 *
 * @author liuwjg
 */
public class LazySingletonDoubleLock {
    private static LazySingletonDoubleLock instance = null;

    private LazySingletonDoubleLock() {
        System.out.println("调用私有构造方法");
    }

    public static LazySingletonDoubleLock getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleLock.class) {
                if (instance == null) {
                    instance = new LazySingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}
