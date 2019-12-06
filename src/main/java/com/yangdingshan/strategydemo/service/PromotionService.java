package com.yangdingshan.strategydemo.service;

import com.yangdingshan.strategydemo.strategy.HandlerType;
import com.yangdingshan.strategydemo.strategy.Strategy;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:33
 * @Description: 促销订单处理
 */
@HandlerType("promotion")
public interface PromotionService extends Strategy {
}
