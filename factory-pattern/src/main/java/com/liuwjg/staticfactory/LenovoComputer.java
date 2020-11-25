package com.liuwjg.staticfactory;

/**
 * 联想电脑
 *
 * @author liuwjg
 */
public class LenovoComputer implements Computer {
    @Override
    public void start() {
        System.out.println("联想电脑启动啦!!!");
    }
}
