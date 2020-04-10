package com.szu.cinian.IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class OutFile {
    public static void main(String args[]) throws IOException {
        try {
            FileInputStream in = new FileInputStream("2018152107.txt");//创建文件输入流对象
            int n = 1;
            byte buffer[] = new byte[n];
            while (in.read(buffer, 0, n) != -1)
            {
                String str = new String(buffer, 0, n);
                if (str.equals(" "))//去掉空格
                {
                    continue;
                }
                System.out.print(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
