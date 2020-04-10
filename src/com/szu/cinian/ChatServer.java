package com.szu.cinian;
import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {
    public static void main(String[] args) {
        int port=4406;
        try {
            //创建服务端
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务器已启动");
            //等待客户端连接
            Socket clientSocket=serverSocket.accept();
            System.out.println("用户"+clientSocket.getPort()+"已连接");
            //接收
            InputStream in = clientSocket.getInputStream();
            Scanner scanner = new Scanner(in);
            System.out.println("客户端：" + scanner.nextLine());
            //发送
            OutputStream out = clientSocket.getOutputStream();
            PrintStream printStream = new PrintStream(out);
            printStream.println("你好，我是服务器");
            printStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
