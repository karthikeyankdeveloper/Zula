package com.zula.Model;

public class Locations {

    private int id;
    private String name;
    private int distanceFromOrigin;

    public Locations(int id, String name,int distance){
        this.id = id;
        this.name = name;
        this.distanceFromOrigin = distance;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDistanceFromOrigin() {
        return distanceFromOrigin;
    }
    public void setDistanceFromOrigin(int distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    

    
}
