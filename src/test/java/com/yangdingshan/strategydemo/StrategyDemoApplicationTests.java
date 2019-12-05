package com.yangdingshan.strategydemo;

import com.yangdingshan.strategydemo.common.OrderTypeEnum;
import com.yangdingshan.strategydemo.dto.OrderDTO;
import com.yangdingshan.strategydemo.strategy.StrategyFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyDemoApplicationTests {

    @Autowired
    private StrategyFactory strategyFactory;

    @Test
    void contextLoads() {

        OrderDTO orderDto = OrderDTO.builder().productName("团购产品").type(OrderTypeEnum.GROUP_ORDER).build();
        strategyFactory.creator(orderDto.getType().getCode()).handlerOrder(orderDto);

        orderDto = OrderDTO.builder().productName("普通产品").type(OrderTypeEnum.NORMAL_ORDER).build();
        strategyFactory.creator(orderDto.getType().getCode()).handlerOrder(orderDto);

        orderDto = OrderDTO.builder().productName("促销产品").type(OrderTypeEnum.PROMOTION_ORDER).build();
        strategyFactory.creator(orderDto.getType().getCode()).handlerOrder(orderDto);
    }

}
