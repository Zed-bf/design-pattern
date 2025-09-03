package com.bobo.design.pattern.behavioral.strategy;

public class FanxianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返现1000元");
    }
}
