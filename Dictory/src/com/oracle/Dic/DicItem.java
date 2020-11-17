package com.oracle.Dic;

public class DicItem {
    String[] English = new String[100];
    String[] Chinese = new String[100];
    int l1=0;
    int l2=0;
    public void Add(String s1, String s2){

        English[l1]=s1;
        Chinese[l2]=s2;
        ++l1;
        ++l2;
        for(int i=0;i<l1;i++){
            System.out.println(English[i]);
            System.out.println(Chinese[i]);
        }

    }

    public void trans(String str){
        int l1=str.length();


    }
}
