package com.yangdingshan.strategydemo.service;

import com.yangdingshan.strategydemo.strategy.HandlerType;
import com.yangdingshan.strategydemo.strategy.Strategy;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:31
 * @Description: 团购订单处理
 */
@HandlerType("group")
public interface GroupService extends Strategy {
}
