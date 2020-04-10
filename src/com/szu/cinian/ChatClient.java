package com.szu.cinian;

import java.net.*;
import java.io.*;
import java.util.*;

public class ChatClient {
    public static void main(String[] args) {
        String ip="127.0.0.1";
        int port=4406;
        try {
            Socket socket=new Socket(ip,port);
            //发送
            OutputStream out = socket.getOutputStream();
            PrintStream printStream=new PrintStream(out);
            printStream.println("你好，我是客户端");
            printStream.flush();
            //接收
            InputStream in = socket.getInputStream();
            Scanner scanner = new Scanner(in);
            System.out.println("服务器：" + scanner.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
