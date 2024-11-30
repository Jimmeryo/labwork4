package com.lab111.labwork4.furniture.chair;

public class VictorianChair extends Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Adjusting height of Victorian chair");
    }

    @Override
    public String getMaterial() {
        return "Wood with velvet upholstery";
    }
}