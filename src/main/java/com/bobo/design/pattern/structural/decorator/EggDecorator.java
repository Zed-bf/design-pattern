package com.bobo.design.pattern.structural.decorator;

public class EggDecorator extends AbstractNoodlesDecorator{

    public EggDecorator(AbstractNoodles abstractNoodles) {
        super(abstractNoodles);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " 加鸡蛋";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }
}
