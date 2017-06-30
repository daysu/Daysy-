/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Poo.Viernes.SocketsTres;

import java.net.InetAddress;

/**
 *
 * @author CC-16
 */
public class InetD {
    public static void main(String[] args) {
        try{
            InetAddress ip;
            ip = new InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del host:"+ip.getHostName());
            System.out.println("Direccion ip;"+ip.getHostAddress());
        }catch(Exeption e){
        
            System.out.println(e);
        }
    }
}
