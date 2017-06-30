
package javaadvanced.Poo.ViernesSocketUno;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("ventana cliente");
         Socket s = new Socket("Localhost",6666);
         DataOutputStream   dout = new DataOutputStream(s.getOutputStream());
         dout.writeUTF("Hola sevidor");
         dout.flush();
         dout.close();
         s.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
 
}
