package com.bobo.design.pattern.behavioral.strategy;

public class ManjianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销: 满100减20");
    }
}
