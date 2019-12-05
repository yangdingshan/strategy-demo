package com.yangdingshan.strategydemo.common;

/**
 * @Author: yangdingshan
 * @Date: 2019/12/5 9:39
 * @Description: 订单类型枚举
 */
public enum OrderTypeEnum {

    GROUP_ORDER("group", "团购订单"),

    NORMAL_ORDER("normal", "普通订单"),

    PROMOTION_ORDER("promotion", "促销订单"),
    ;

    private String code;

    private String desc;

    OrderTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
