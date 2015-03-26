package com.mycompany.app;

import net.minidev.json.JSONObject;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calendar rightNow = Calendar.getInstance();
        Map<String,Object> myMap = new HashMap<>();
        myMap.put("myDate",rightNow);
        System.out.println("This is the current time: " + rightNow.getTime());
        System.out.println("The JSON Object: " + JSONObject.toJSONString(myMap));
    }
}
