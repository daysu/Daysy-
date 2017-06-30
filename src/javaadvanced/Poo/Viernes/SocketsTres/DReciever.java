
package javaadvanced.Poo.Viernes.SocketsTres;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class DReciever {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds = new   DatagramSocket(300);
        byte[] b = new byte[1024];//kb
        DatagramPacket dp = new  DatagramPacket(b,1024);
                String str = new String (dp.getData(),0,dp.getLength()); 
                System.out.println(str);
                ds.close();
    }
    
}
