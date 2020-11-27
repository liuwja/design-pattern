package com.liuwjg.observerpattern;

public class Client {
    public static void main(String[] args) {
        //1.创建目标
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //2.创建观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        observer1.setObserverName("小刘");
        observer1.setRemindThing("下雨啦");
        ConcreteObserver observer2 = new ConcreteObserver();
        observer2.setObserverName("小黄");
        observer2.setRemindThing("不管下雨下雪，都不出门");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setWeatherContent("下雪");
    }
}
