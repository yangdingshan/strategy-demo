package com.yangdingshan.strategydemo.service.impl;

import com.yangdingshan.strategydemo.dto.OrderDTO;
import com.yangdingshan.strategydemo.service.PromotionService;
import com.yangdingshan.strategydemo.strategy.HandlerContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:36
 * @Description: 促销订单处理
 */
@Slf4j
@Service
public class PromotionServiceImpl implements PromotionService {

    @Override
    public String handlerOrder(OrderDTO orderDTO) {
        log.info("促销订单产品：{}", orderDTO.getProductName());
        return null;
    }
}
