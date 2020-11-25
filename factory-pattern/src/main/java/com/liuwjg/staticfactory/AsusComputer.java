package com.liuwjg.staticfactory;

/**
 * 华硕笔记本
 *
 * @author liuwjg
 */
public class AsusComputer implements Computer {
    @Override
    public void start() {
        System.out.println("华硕笔记本启动!!!");
    }
}
