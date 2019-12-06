package com.yangdingshan.strategydemo.service;

import com.yangdingshan.strategydemo.strategy.HandlerType;
import com.yangdingshan.strategydemo.strategy.Strategy;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:32
 * @Description: 普通订单处理
 */
@HandlerType("normal")
public interface NormalService extends Strategy {
}
