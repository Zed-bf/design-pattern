package com.bobo.design.pattern.structural.decorator;

public class BeefDecorator extends AbstractNoodlesDecorator{
    public BeefDecorator(AbstractNoodles abstractNoodles) {
        super(abstractNoodles);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " 加牛肉";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
