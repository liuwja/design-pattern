package com.liuwjg;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    //内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //先调用change
        this.setChanged();
        //主动通知,推方法
        this.notifyObservers(content);
        //拉的方式
        this.notifyObservers();
    }
}
