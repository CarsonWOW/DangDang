package com.dangdang.po;

public class CarItems {
    //包括产品的对象
    private DangdangProduct product;
    //商品选择数量
    private int num;

    public DangdangProduct getProduct() {
        return product;
    }

    public void setProduct(DangdangProduct product) {
        this.product = product;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
