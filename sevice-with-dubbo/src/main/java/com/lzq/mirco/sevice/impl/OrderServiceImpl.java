package com.lzq.mirco.sevice.impl;

import com.lzq.mirco.sevice.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author liangziqiang
 */
@Service("orderService")
@org.apache.dubbo.config.annotation.Service(version = "1")
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrderDetail(String orderNo) {
        return "order detail";
    }

}
