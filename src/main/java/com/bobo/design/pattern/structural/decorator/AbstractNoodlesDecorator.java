package com.bobo.design.pattern.structural.decorator;

public class AbstractNoodlesDecorator extends AbstractNoodles{

    private AbstractNoodles abstractNoodles;

    public AbstractNoodlesDecorator(AbstractNoodles abstractNoodles) {
        this.abstractNoodles = abstractNoodles;
    }

    @Override
    public String getDescription() {
        return this.abstractNoodles.getDescription();
    }

    @Override
    public double getPrice() {
        return this.abstractNoodles.getPrice();
    }
}
