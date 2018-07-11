package com.gao.jin.designpatterns.strategypattern;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieTicket {
    private Double price;

    @Autowired
    private Discount discount;

    public void setPrice(Double price) {
        this.price = price;
    }

    public void  setMovieTicket(Discount discount){
        this.discount=discount;
    }

    public Double getPrice(){
        return discount.getPrice(price);
    }
}
