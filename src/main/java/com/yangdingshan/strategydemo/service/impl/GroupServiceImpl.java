package com.yangdingshan.strategydemo.service.impl;

import com.yangdingshan.strategydemo.dto.OrderDTO;
import com.yangdingshan.strategydemo.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:33
 * @Description: 团购订单处理
 */
@Slf4j
@Service
public class GroupServiceImpl implements GroupService {


    @Override
    public String handlerOrder(OrderDTO orderDTO) {
        log.info("团购订单产品：{}", orderDTO.getProductName());
        return null;
    }
}
