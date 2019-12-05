package com.yangdingshan.strategydemo.service.impl;

import com.yangdingshan.strategydemo.dto.OrderDTO;
import com.yangdingshan.strategydemo.service.NormalService;
import com.yangdingshan.strategydemo.strategy.Strategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:35
 * @Description: 普通订单处理
 */
@Slf4j
@Service
public class NormalServiceImpl implements NormalService, Strategy {

    @Override
    public String handlerOrder(OrderDTO orderDTO) {
        log.info("普通订单产品：{}", orderDTO.getProductName());
        return null;
    }
}
