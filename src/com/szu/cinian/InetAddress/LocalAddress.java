package com.szu.cinian.InetAddress;

import java.net.*;

public class LocalAddress
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress localaddress=InetAddress.getLocalHost();
            System.out.println("本机地址为："+localaddress);
        }
        catch (UnknownHostException e)
        {
            System.out.println("获取本机地址失败");
        }
    }

}
