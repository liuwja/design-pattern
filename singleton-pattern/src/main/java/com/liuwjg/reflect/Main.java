package com.liuwjg.reflect;

import com.liuwjg.innerclass.InnerClassSingleton;
import com.liuwjg.lazydoublelock.LazySingletonDoubleLock;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏线程安全的单例
 *
 * @author liuwjg
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class clazz = LazySingletonDoubleLock.class;
//        Constructor constructor = clazz.getDeclaredConstructor(null);
//        constructor.setAccessible(true);
//        LazySingletonDoubleLock instance1 = (LazySingletonDoubleLock) constructor.newInstance();
//        LazySingletonDoubleLock instance2 = (LazySingletonDoubleLock) constructor.newInstance();
//        System.out.println(instance1);
//        System.out.println(instance2);


        Class clazz = InnerClassSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        InnerClassSingleton innerClassSingleton1 = (InnerClassSingleton) constructor.newInstance();
        InnerClassSingleton innerClassSingleton2 = (InnerClassSingleton) constructor.newInstance();
        System.out.println(innerClassSingleton1 == innerClassSingleton2);
    }
}
