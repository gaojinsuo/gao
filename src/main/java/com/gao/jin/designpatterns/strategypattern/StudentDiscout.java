package com.gao.jin.designpatterns.strategypattern;

import org.springframework.stereotype.Service;

@Service
public class StudentDiscout implements Discount {
    @Override
    public Double getPrice(double price) {
        return 0.8*price;
    }
}
