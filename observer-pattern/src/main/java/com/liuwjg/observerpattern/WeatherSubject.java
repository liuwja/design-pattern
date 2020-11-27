package com.liuwjg.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气目标对象
 */
public abstract class WeatherSubject {
    public List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 提醒方法
     */
    protected abstract void notifyObservers();
}
