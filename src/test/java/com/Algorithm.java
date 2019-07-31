package com;

/**
 * @author gaojinsuo
 * @Date: 2019/7/17 21:46
 */
public class Algorithm {
    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int[] b = new int[array.length];
        int index =0;
        for (int i = 0;i<array.length-1;i++) {
            if (array[i+1] < array[i] ) {
                index = i+1;
            }
        }
        int j;
        for (j = 0;j<b.length&&index<array.length;j++,index++){
            b[j] = array[index];
        }
        int p =0;
        for ( ;j<b.length && p<index;j++,p++) {
            b[j] =array[p];
        }

        return b[0];
    }

    public static void main(String[] args) {
        System.out.println(minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }
}
