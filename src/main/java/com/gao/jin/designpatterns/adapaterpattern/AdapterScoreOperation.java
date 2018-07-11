package com.gao.jin.designpatterns.adapaterpattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdapterScoreOperation implements ScoreOperation{

    @Autowired
    private QuickSort quickSort;

    @Override
    public int[] sort(int[] a) {
        return quickSort.quickSort(a);
    }
}
