package com.lab111.labwork4.furniture.chair;

public class MinimalistChair extends Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a minimalist chair");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Adjusting height of minimalist chair");
    }

    @Override
    public String getMaterial() {
        return "Plastic and steel";
    }
}