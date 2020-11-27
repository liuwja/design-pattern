package com.liuwjg.observerpattern;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 更新接口
     *
     * @param weatherSubject
     */
    void update(WeatherSubject weatherSubject);

    /**
     * 设置观察者名称
     *
     * @param observerName
     */
    void setObserverName(String observerName);

    /**
     * 获取观察者名称
     *
     * @return
     */
    String getObserverName();
}
