package com.joszaynka.shop;

import java.util.*;

interface Tunable {
    Map<String,String> sVal = new HashMap<String,String>();
    Map<String,Integer> iVal = new HashMap<String,Integer>();
    public Map<String, String> getSVal();
    public Map<String, Integer> getIVal();
    int tune(String param, String val);
    int tune(String param, int val);
}
class Bear implements Tunable {
    private Map<String,String> sVal = new HashMap<String,String>();
    private Map<String,Integer> iVal = new HashMap<String,Integer>();
    public Map<String, String> getSVal() {
        return sVal;
    }
    public Map<String, Integer> getIVal() {
        return iVal;
    }
    public Bear() {
        sVal.put("name", "Winnie");
        iVal.put("age", 3);
    }

    public int tune(String param, String val) {
        int ret = 1;
        try {
            sVal.put(param, val);
        }
        catch (Exception e) {
            System.out.println("Woops!");
            ret = 0;
        }
        return ret;

    }
    public int tune(String param, int val) {
        int ret = 1;
        try {
            iVal.put(param, val);
        }
        catch (Exception e) {
            System.out.println("Woops!");
            ret = 0;
        }
        return ret;

    }
}