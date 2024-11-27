package com.zula.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zula.Model.Cab;
import com.zula.Model.Driver;
import com.zula.Model.Locations;
import com.zula.Model.User;

public class AppConfig {

    public static int loginuser = 1;
    public static int logindriver = 1;

    public static List<Locations> locations =  new ArrayList<Locations>();
    public static List<Cab> cabs =  new ArrayList<Cab>();
    public static List<User> customer =  new ArrayList<User>();
    public static List<Driver> driver =  new ArrayList<Driver>();

    public static Map<String,Integer> map =  new HashMap<>();

    
    protected  static void initialize(){
        
        locations.add(new Locations(1,"A",0));
        locations.add(new Locations(3,"C",4));
        locations.add(new Locations(4,"D",7));
        locations.add(new Locations(6,"F",9));
        locations.add(new Locations(2,"B",15));
        locations.add(new Locations(7,"G",18));
        locations.add(new Locations(8,"H",20));
        locations.add(new Locations(5,"E",23));

        map.put("A",0);
        map.put("C",4);
        map.put("D",7);
        map.put("F",9);
        map.put("B",15);
        map.put("G",18);
        map.put("H",20);
        map.put("E",23);


        cabs.add(new Cab(1,"D"));
        cabs.add(new Cab(2,"G"));
        cabs.add(new Cab(3,"H"));
        cabs.add(new Cab(4,"A"));

        customer.add(new User(1,"zz",99,25,"F"));
        customer.add(new User(2,"yy",88,61,"M"));
        customer.add(new User(3,"xx",77,22,"M"));
        customer.add(new User(4,"ww",66,36,"F"));




        driver.add(new Driver(1,"aaa",111,43,"M"));
        driver.add(new Driver(2,"bbb",222,31,"M"));
        driver.add(new Driver(3,"ccc",333,38,"F"));
        driver.add(new Driver(4,"ddd",444,28,"F"));


        System.out.println("App Initialized");
    }
    
}
