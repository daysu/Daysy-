
package javaadvanced.Poo.Viernes.SocketsTres;

import java.net.MalformedURLException;
import java.net.URL;


public class URLD {
    public static void main(String[] args) throws MalformedURLException {
    try    {
        URL url =  new URL("http://codigofacilito.com");
        
        
        System.out.println("protocolo:"+url.getProtocol());
        System.out.println("Host:"+url.getHost());
    }catch(MalformedURLException mur ){
    mur.printStackTrace();
    }
    }
}
