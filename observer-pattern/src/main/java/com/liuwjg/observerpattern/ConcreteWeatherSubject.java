package com.liuwjg.observerpattern;

public class ConcreteWeatherSubject extends WeatherSubject {
    private String weatherContent;

    /**
     *
     */
    @Override
    protected void notifyObservers() {
        //循环所有注册的观察者
        for (Observer observer : observers) {
            //如果天气时晴天  do nothing
            //如果天气是下雨,只通知 观察者 小刘、小黄
            if ("下雨".equals(this.weatherContent)) {
                if ("小刘".equals(observer.getObserverName())) {
                    observer.update(this);
                }
                if ("小黄".equals(observer.getObserverName())) {
                    observer.update(this);
                }
            }

            //下雪  只通知小刘
            if ("下雪".equals(this.weatherContent)) {
                if ("小刘".equals(observer.getObserverName())) {
                    observer.update(this);
                }
            }
        }
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
