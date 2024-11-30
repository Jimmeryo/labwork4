package com.lab111.labwork4.pricing;

public class ModernPricingStrategy implements PricingStrategy {
    @Override
    public double getPrice() {
        return 1000.0; // базова ціна для сучасних меблів
    }
}