package com.szu.cinian.algorithms;
import java.util.Arrays;

public class InsertionSort {
    public static void sort(double[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // input a[i] to a[0], a[1], ..., a[i-1]
            double key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];  // bigger element back one position
                j--;
            }
            a[j + 1] = key;
        }
    }
/*
    public static void main(String[] args) {
        double[] a = {1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
*/
}
