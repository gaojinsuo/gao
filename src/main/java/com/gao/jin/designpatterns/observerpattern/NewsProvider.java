package com.gao.jin.designpatterns.observerpattern;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewsProvider implements MyObserverable {
    List<MyObserver> observers = new ArrayList<>();
    @Override
    public void register(MyObserver myObserver) {
        observers.add(myObserver);
    }

    @Override
    public void remove(MyObserver myObserver) {
        observers.remove(myObserver);
    }

    @Override
    public void send(NewsModel newsModel) {
        for (MyObserver observer :observers){
            observer.receive(newsModel);
        }
    }
}
