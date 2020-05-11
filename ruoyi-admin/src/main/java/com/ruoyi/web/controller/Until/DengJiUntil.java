package com.ruoyi.web.controller.Until;

public class DengJiUntil {

    public static String numberChangeString(Long a){
        if(a<60){
            return "D";
        }else if (a>=60&&a<70){
            return "C";
        }else if (a>=70&&a<80){
            return "B";
        }else {
            return "A";
        }
    }




}
