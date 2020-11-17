package com.oracle.test;

public class Computer{
    public void connect(Usb usb){
        
        String data=usb.getData();
        System.out.println("从usb获取数据："+data);
    }

}
