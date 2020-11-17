package com.oracle.test;

public class Eagle extends Animal implements Flyable,Meatable{
    @Override
    public void fly() {
        System.out.println("飞高");
    }

    @Override
    public void eat() {
        System.out.println("老鹰。吃肉");
    }
}
