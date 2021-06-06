package com.dangdang.po;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //包括商品的条目
    private List<CarItems> list=new ArrayList<CarItems>();
    //包括总价格
    private Double account;

    public List<CarItems> getList() {
        return list;
    }

    public void setList(List<CarItems> list) {
        this.list = list;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }
}
