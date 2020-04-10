package com.szu.cinian.algorithms;

public class SelectionSort {
    public static void sort(double[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            double temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
}
