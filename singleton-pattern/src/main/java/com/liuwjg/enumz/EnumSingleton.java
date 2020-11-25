package com.liuwjg.enumz;

/**
 * @author liuwjg
 */

public enum EnumSingleton {
    /**
     * 实例
     */
    INSTANCE("liuwjg"),INSTANCE_1;

    /**
     * name
     */
    private String name;
    EnumSingleton(){

    }
    EnumSingleton(String name) {
        System.out.println("构造方法调用");
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
