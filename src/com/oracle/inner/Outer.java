package com.oracle.inner;

public class Outer {
    int age=789;

    public void OuterMethod(){
        System.out.println("外部的方法被调用");
        Inner i=new Inner();
    }
    class Inner{
        int a;
        int age=0;
        public void innerMethod(){
            System.out.println(Outer.this.age);
            System.out.println(a);
            OuterMethod();//在内部类可使用外部类的方法
        }
    }
}
