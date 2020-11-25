package com.liuwjg.enumz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liuwjg
 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {

        /**
         * 多线程模拟,枚举单例是线程安全的
         */

//        Integer count = 100;
//        for (int i = 0; i < count; i++) {
//            new Thread(() -> {
//                EnumSingleton instance = EnumSingleton.INSTANCE;
//                System.out.println(instance);
//            }).start();
//        }

        /**
         * 反射模拟，枚举单例无法通过反射获取实例
         */
//        Class clazz = EnumSingleton.class;
        Class<Enum> clazz = (Class<Enum>) Class.forName("com.liuwjg.enumz.EnumSingleton");
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton enumSingleton = (EnumSingleton) constructor.newInstance();
        System.out.println(enumSingleton);


    }
}
