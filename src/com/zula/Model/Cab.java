package com.zula.Model;

import java.util.ArrayList;
import java.util.List;

public class Cab {

    private int cabId;
    private String cabCurrentLocation;

    public  int noOftrip=0;
    public  int earning = 0;
    public  int commision = 0;
    public  List<String> history = new ArrayList<>();

    public Cab(){
        
    }

    public Cab(int cabId,String cabCurrentLocation){
        this.cabId = cabId;
        this.cabCurrentLocation = cabCurrentLocation;
    }


    public int getCabId() {
        return cabId;
    }
    public void setCabId(int cabId) {
        this.cabId = cabId;
    }
    public String getCabCurrentLocation() {
        return cabCurrentLocation;
    }
    public void setCabCurrentLocation(String cabCurrentLocation) {
        this.cabCurrentLocation = cabCurrentLocation;
    }

    @Override
    public String toString() {
        return "Cab [cabId=" + cabId + ", cabCurrentLocation=" + cabCurrentLocation + "]";
    }

    

    

    
}
