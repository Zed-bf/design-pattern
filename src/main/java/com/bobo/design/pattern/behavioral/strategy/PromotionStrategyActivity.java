package com.bobo.design.pattern.behavioral.strategy;

public class PromotionStrategyActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionStrategyActivity(PromotionStrategy promotionStrategy)
    {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute()
    {
        promotionStrategy.doPromotion();
    }
}
