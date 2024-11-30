package com.lab111.labwork4.furniture.chair;

public class ModernChair extends Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Adjusting height of modern chair with hydraulic mechanism");
    }

    @Override
    public String getMaterial() {
        return "Metal and leather";
    }
}