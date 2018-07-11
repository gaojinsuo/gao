package com.gao.jin.designpatterns.strategypattern;

import org.springframework.stereotype.Service;

@Service
public class AdultDiscout implements Discount {
    @Override
    public Double getPrice(double price) {
        return price;
    }
}
