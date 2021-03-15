package com.example.workhard;

import android.app.Application;

public class GlobalClass extends Application {

    public int points=0;

    public int getPoints()
    {
        return points;
    }
    public void setPoints(int points)
    {
        this.points+=points;
    }

}
