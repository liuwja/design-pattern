package com.liuwjg;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class ConcreteObserver implements Observer {
    /**
     * 观察者名称
     */
    private String name;

    public void update(Observable o, Object arg) {
        System.out.println(name + "收到了:" + arg);
        System.out.println(name + "收到了:" + ((ConcreteSubject) o).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
