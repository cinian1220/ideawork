package com.szu.cinian.IOStream;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InFile
{
    public static void main(String args[]) throws IOException {
        try
        {
            System.out.print("请输入:");
            int count;
            int n=1000;
            byte buffer[]=new byte[n];
            count=System.in.read(buffer);//读取标准输入流；
            FileOutputStream out=new FileOutputStream("2018152107.txt");//创建文件输出流对象
            out.write(buffer,0,count);//写入输出流
            out.close();//关闭输出流
            System.out.println("已经成功保存到文件 2018152107.txt中");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        BufferedReader br = new BufferedReader(new FileReader("2018152107.txt"));
        int ch;
        int n=0;
        while( (ch = br.read()) != -1) {
            n++;
        }

        FileWriter fw;
        try {
            fw = new FileWriter("2018152107.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();    //换行
            bw.newLine();    //换行
            bw.write("this document contains "+ n+" bytes in total.");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
