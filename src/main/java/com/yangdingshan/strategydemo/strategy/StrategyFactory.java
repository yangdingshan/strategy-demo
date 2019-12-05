package com.yangdingshan.strategydemo.strategy;

import com.yangdingshan.strategydemo.common.OrderTypeEnum;
import com.yangdingshan.strategydemo.service.GroupService;
import com.yangdingshan.strategydemo.service.NormalService;
import com.yangdingshan.strategydemo.service.PromotionService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:59
 * @Description:
 */
@Component
public class StrategyFactory implements InitializingBean {

    @Autowired
    private GroupService groupService;

    @Autowired
    private NormalService normalService;

    @Autowired
    private PromotionService promotionService;

    private static Map<String, Strategy> strategyMap = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        strategyMap.put(OrderTypeEnum.GROUP_ORDER.getCode(), groupService);
        strategyMap.put(OrderTypeEnum.NORMAL_ORDER.getCode(), normalService);
        strategyMap.put(OrderTypeEnum.PROMOTION_ORDER.getCode(), promotionService);
    }

    public Strategy creator(String type){
        return strategyMap.get(type);
    }

}
