package com.bobo.design.pattern.behavioral.strategy;

public class LijianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程价格减20元");
    }
}
