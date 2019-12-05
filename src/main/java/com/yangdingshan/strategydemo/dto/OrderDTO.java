package com.yangdingshan.strategydemo.dto;

import com.yangdingshan.strategydemo.common.OrderTypeEnum;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:38
 * @Description: 订单实体
 */
@Data
@Builder
public class OrderDTO {

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 订单类型
     * 1：普通订单；
     * 2：团购订单；
     * 3：促销订单；
     */
    private OrderTypeEnum type;
}
