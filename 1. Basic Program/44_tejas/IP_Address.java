// what is my IP

import java.net.*;

class IP_Address
{
    public static void main(String[] args) throws Exception
    {
        InetAddress IP=InetAddress.getLocalHost();
        System.out.println("Ip Address of my system is :" + IP.getHostAddress());
    }
} 