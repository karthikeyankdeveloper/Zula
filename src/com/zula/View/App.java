package com.zula.View;

import com.zula.Controller.Booking;

public class App extends Booking{
    static{
        AppConfig.initialize();
    }

    public static void main(String[] args) {
        App app =  new App();
        app.start();
    }
    
}
