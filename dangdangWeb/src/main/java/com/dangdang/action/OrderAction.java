package com.dangdang.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("Order")
@Controller
public class OrderAction {
    @RequestMapping("order")
    public String order(){
        return "shopping-result";
    }
}
