package com.gao.jin.designpatterns.observerpattern;

import org.springframework.beans.factory.annotation.Autowired;

public class User implements MyObserver {
    @Override
    public void receive(NewsModel newsModel) {
        System.out.println();
    }
}
