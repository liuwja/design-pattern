package com.liuwjg.staticfactory;

/**
 * @author liuwjg
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer("hp");
        System.out.println(computer.getClass().getName());
        computer.start();

        computer = ComputerFactory.getComputer("lenovo");
        computer.start();
    }
}
