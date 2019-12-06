package com.yangdingshan.strategydemo.strategy;


import com.yangdingshan.strategydemo.util.BeanTool;
import com.yangdingshan.strategydemo.util.SpringContextHolder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author: CipherCui
 * @Description: 处理器上下文，根据类型获取相应的处理器
 * @Date: Created in 10:07 2019/2/2
 */
@SuppressWarnings("unchecked")
public class HandlerContext {

    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public Strategy getInstance(String type) {
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (Strategy) BeanTool.getBean(clazz);
    }

}
