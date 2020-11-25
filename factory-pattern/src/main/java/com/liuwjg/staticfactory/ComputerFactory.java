package com.liuwjg.staticfactory;


/**
 * 电脑工厂
 *
 * @author liuwjg
 */
public class ComputerFactory {

    public static Computer getComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "hp":
                computer = new HpComputer();
                break;
            case "asus":
                computer = new AsusComputer();
                break;
        }
        return computer;
    }
}
