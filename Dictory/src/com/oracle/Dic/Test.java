package com.oracle.Dic;

public class Test {
    public static void main(String[] args) {
        String s1="dog";
        String s2="狗";

        DicItem d=new DicItem();
        //d.English[0][]=s1;
        d.Add(s1,s2);
        String s3="";
        String s4="吃";
        d.Add(s3,s4);
        d.trans("")
        //System.out.println(d.English[0]);
        //System.out.println(d.Chinese[0]);

    }
}
