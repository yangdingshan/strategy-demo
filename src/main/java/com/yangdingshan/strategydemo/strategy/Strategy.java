package com.yangdingshan.strategydemo.strategy;

import com.yangdingshan.strategydemo.dto.OrderDTO;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:28
 * @Description: 策略模式接口定义
 */
public interface Strategy {

    /**
     * 处理订单
     *
     * @param orderDTO
     * @return
     */
    String handlerOrder(OrderDTO orderDTO);
}
