package com.zph.order.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @notes 订单
 * @autho zph
 * @createTime 2018/9/30 11:57
 */
@RequestMapping(value = "/v1/order")
@Controller
@ResponseBody
public class OrderController {

    @RequestMapping(value = "/orderList", method = RequestMethod.POST)
    public String orderList(){
        return "order";
    }
}
