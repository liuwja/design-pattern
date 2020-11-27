package com.liuwjg.observerpattern;

public class ConcreteObserver implements Observer {
    /**
     * 观察者姓名
     */
    private String observerName;
    /**
     * 天气的内容
     */
    private String weatherContent;

    /**
     * 提醒内容
     */
    private String remindThing;

    @Override
    public void update(WeatherSubject weatherSubject) {
        weatherContent = ((ConcreteWeatherSubject) weatherSubject).getWeatherContent();
        System.out.println(observerName + "收到了" + weatherContent + "," + remindThing);
    }

    @Override
    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public String getObserverName() {
        return observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
