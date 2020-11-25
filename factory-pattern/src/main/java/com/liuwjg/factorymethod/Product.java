package com.liuwjg.factorymethod;

/**
 * @author liuwjg
 */
public interface Product {
    /**
     * 生产方法
     */
    void produce();

    /**
     * 检验方法
     */
    void check();

    /**
     * 完成方法
     */
    void finish();
}
