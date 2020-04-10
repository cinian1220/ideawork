package com.szu.cinian.algorithms;
import java.util.Arrays;

public class MergeSort {
        static double[] aux;

        public static void sort(double[] a) {
            mergeSort(a, 0, a.length - 1);
        }

        static void mergeSort(double[] a, int low, int high) {
            if (low >= high)
                return;
            else {
                int mid = (low + high)/2;
                mergeSort(a, low, mid);
                mergeSort(a, mid + 1, high);
                merge(a, low, mid, high);
            }
        }

        static void merge(double[] a, int low, int mid, int high) {
            int i = low;
            int j = mid + 1;


            for (int k = low; k <= high; k++) {
                if(i > mid)  a[k] = aux[j++];
                else if (j > high) a[k] = aux[i++];
                else if (aux[i] > aux[j]) a[k] = aux[j++];
                else                 a[k] = aux[i++];
            }
        }


        public static void main(String[] args) {
            double[] a = {1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
            aux = a.clone();
            sort(a);
            System.out.println(Arrays.toString(a));

        }

}
