// Ip Address of my computer:
import java.net.*;
 class Port
 {
    public static void main(String[] args)
    {
        for(int i=0; i<65536;i++)
        {
            if(i%1000==0)
            
                System.out.println("i :" + i);
            try 
            {
                DatagramSocket d=new DatagramSocket(i);
            }
            catch (Exception e)
            {
                System.out.println("port is not Available:" + i + e);
            }
        }
    }
 } 