package com.liuwjg.staticfactory;

/**
 * 惠普笔记本
 *
 * @author liuwjg
 */
public class HpComputer implements Computer {
    @Override
    public void start() {
        System.out.println("惠普笔记本启动");
    }
}
