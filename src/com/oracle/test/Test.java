package com.oracle.test;

public class Test {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.connect(new Camera());
        c.connect(new Phone());
    }
}
