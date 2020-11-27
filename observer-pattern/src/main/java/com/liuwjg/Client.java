package com.liuwjg;

public class Client {
    public static void main(String[] args) {
        //创建目标
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        observer1.setName("observer1");
        ConcreteObserver observer2 = new ConcreteObserver();
        observer2.setName("observer2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setContent("啦啦啦");

    }
}
