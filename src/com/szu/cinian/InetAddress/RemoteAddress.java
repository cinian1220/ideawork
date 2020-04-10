
package com.szu.cinian.InetAddress;

import java.io.IOException;
import java.net.*;

public class RemoteAddress
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress remoaddress=InetAddress.getByName("www.szu.edu.cn");
            System.out.println("主机IP地址为："+remoaddress);
            if(remoaddress.isReachable(3000))
                System.out.println("可达");
        }
        catch (UnknownHostException e)
        {
            System.out.println("获取主机地址失败");
        } catch (IOException e) {
            System.out.println("不可达");
            e.printStackTrace();
        }
    }

}
