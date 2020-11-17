package com.oracle.Real;

public class DicEC {

    DicItem[] items;


    private class DicItem{
        String english;
        String chinese;

        public DicItem(String english, String chinese) {
            super();
            this.english = english;
            this.chinese = chinese;
        }
    }
}
