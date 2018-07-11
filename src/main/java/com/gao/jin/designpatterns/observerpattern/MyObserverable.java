package com.gao.jin.designpatterns.observerpattern;

public interface MyObserverable {
    void register(MyObserver myObserver);
    void remove(MyObserver myObserver);
    void send(NewsModel newsModel);

}
