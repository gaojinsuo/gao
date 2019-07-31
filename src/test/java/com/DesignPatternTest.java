package com;

import com.gao.jin.designpatterns.adapaterpattern.AdapterScoreOperation;
import com.gao.jin.designpatterns.adapaterpattern.ScoreOperation;
import com.gao.jin.designpatterns.observerpattern.NewsModel;
import com.gao.jin.designpatterns.observerpattern.NewsProvider;
import com.gao.jin.designpatterns.observerpattern.User;
import com.gao.jin.designpatterns.strategypattern.MovieTicket;
import com.gao.jin.designpatterns.strategypattern.StudentDiscout;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DesignPatternTest{
    @Autowired
    private ScoreOperation scoreOperation;
    @Test
    public void strategyPattern(){
        StudentDiscout studentDiscout = new StudentDiscout();
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setMovieTicket(studentDiscout);
        movieTicket.setPrice(2.0);
        double price = movieTicket.getPrice();
        System.out.println(price);
    }

    @Test
    public void adapaterPattern(){
        int[] a = {3,1,2,8,4};
        scoreOperation.sort(a);
        for (int i=0;i< a.length;i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void observer(){
        NewsProvider newsProvider =new NewsProvider();
        newsProvider.register(new User());
        newsProvider.send(new NewsModel());
    }
}
