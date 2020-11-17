package com.oracle.inner;

public class Test {
    public static void main(String[] args) {
        Outer o=new Outer();
        //无静态创建  Outer.Inner i=o.new Inner();
        //静态创建    Outer.Inner i=new Outer.Inner();
    }
}
