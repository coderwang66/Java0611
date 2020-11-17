package com.oracle.test;

public interface Usb {
    public String getData();
    public default void test(){

        System.out.println("新增的default方法");
    }
    public static void staticmathod(){

        System.out.println("静态方法被调用");
    }
}