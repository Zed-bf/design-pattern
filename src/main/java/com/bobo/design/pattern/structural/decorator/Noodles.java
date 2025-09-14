package com.bobo.design.pattern.structural.decorator;

public class Noodles extends AbstractNoodles{
    @Override
    public String getDescription() {
        return "普通面条";
    }

    @Override
    public double getPrice() {
        return 15.0;
    }
}
