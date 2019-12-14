package com.lzq.mico.portal.controller;

import com.lzq.mirco.sevice.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * order 门户
 *
 * @author liangziqiang
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference(version = "1")
    private OrderService orderService;

    @GetMapping("/{orderNo}")
    public String getOrderDetail(@PathVariable("orderNo") String orderNo) {
        return orderService.getOrderDetail(orderNo);
    }

}
