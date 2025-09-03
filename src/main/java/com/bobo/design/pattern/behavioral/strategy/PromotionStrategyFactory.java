package com.bobo.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    public static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();


    static {
        PROMOTION_STRATEGY_MAP.put(Promotion.MANJIAN, new ManjianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(Promotion.LIJIAN, new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(Promotion.FANXIAN, new FanxianPromotionStrategy());
    }

    public interface Promotion {
        String MANJIAN = "MANJIAN";
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
    }

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy;
    }
}
