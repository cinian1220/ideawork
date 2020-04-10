package com.szu.cinian.algorithms;
import java.util.Arrays;

public class BubbleSort {
    public static void sort(double[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
    }
/*
    public static void main(String[] args) {
        double[] a = {8, 3, 2, 5};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
*/
}
