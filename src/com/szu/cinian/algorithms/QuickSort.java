package com.szu.cinian.algorithms;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    static void shuffle(double[] a) {//在进行排序之前还对数组进行随机处理
        Random random = new Random();
        int i;
        for (i = 0; i< a.length; i++) {
            int j = random.nextInt(1+i);
            double temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void sort(double[] a) {
        shuffle(a);
        quickSort(a, 0, a.length - 1);
    }

    static void exchange(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void quickSort(double[] a, int start, int end) {
        int k = (start + end)/2;
        if (start >= end)
            return;
        else {
            // step 1
            int i = start; int j = end; double baseValue = a[k];

            // setp 2
            while (i < j) {
                while (a[i] < baseValue) { // until find a value that greater than baseValue
                    i ++;
                    if (i >= end)
                        break;
                }

                while (a[j] > baseValue) { // until find a value that less than baseValue
                    j --;
                    if (j <= start)
                        break;
                }
                exchange(a, i, j);
                if (a[i] == a[j]) // avoid endless loop
                    i++;
            }

            // setp 3
            quickSort(a, start, j - 1);
            quickSort(a, j + 1, end);
        }

    }
/*
    public static void main(String[] args) {
        double[] a = {1.0, 4.0, 8.0, 9.0, 3.0, 4.0};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
    */

}
