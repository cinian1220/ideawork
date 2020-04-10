package com.szu.cinian.algorithms;
import java.util.Random;

public class Sort {
    public static void compareSortAlgo(int size) {
        int start = 10;
        int end = 10000;
        double[] temp;
        long time;
        Random random = new Random();
        double[] testArray = random.doubles(size, start, end).toArray();
        //用于得到一个有限长度的范围在起始值到结束值之间的伪随机 double 值流，[精度起始值, 结束值)
        //random.doubles(long streamSize, int randomNumberOrigin, int randomNumberBound)
        //将List转为数组

        time = System.currentTimeMillis();
        for(int i=500000;i>0;i--)
        {
        temp = testArray.clone();
        SelectionSort.sort(temp);
        }
        double xz;
        xz=System.currentTimeMillis() - time;
        xz=xz/500000;
        System.out.println(/*"选择排序"*/ +xz+"ms");

        time = System.currentTimeMillis();
        for(int i=1000000;i>0;i--)
        {
            temp = testArray.clone();
            BubbleSort.sort(temp);
        }
        double mp;
        mp=System.currentTimeMillis() - time;
        mp=mp/1000000;
        System.out.println(/*"冒泡排序"*/ +mp + "ms");

        time = System.currentTimeMillis();
        for(int i=1000000;i>0;i--)
        {
            temp = testArray.clone();
            MergeSort.aux = temp.clone();
            MergeSort.sort(temp);
        }
        double hb;
        hb=System.currentTimeMillis() - time;
        hb=hb/1000000;
        System.out.println(/*"合并排序"*/ + hb + "ms");

        time = System.currentTimeMillis();
        for(int i=500000;i>0;i--) {
            temp = testArray.clone();
            QuickSort.sort(temp);
        }
        double ks;
        ks=System.currentTimeMillis() - time;
        ks=ks/500000;
        System.out.println(/*"快速排序"*/ + ks + "ms");

        time = System.currentTimeMillis();
        for(int i=1000000;i>0;i--)
        {
            temp = testArray.clone();
            InsertionSort.sort(temp);
        }
        double cr;
        cr=System.currentTimeMillis() - time;
        cr=cr/1000000;
        System.out.println(/*"插入排序"*/+cr + "ms");
    }
    public static void main(String[] args) {
        int size  = 10;//分别以n=10, n=100, n=1000, n=10000, n=100000，
        System.out.println("当规模为"+size+"时");
        for(int num=1;num<=20;num++)
        {
            System.out.println("第" +num + "个样本的时间");
            compareSortAlgo(size);
        }

    }

}
