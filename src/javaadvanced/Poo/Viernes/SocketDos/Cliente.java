
package javaadvanced.Poo.Viernes.SocketDos;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class Cliente {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",6666);
        DataInputStream/*lee dis*/ dis = new  DataInputStream(s.getInputStream());
        DataOutputStream /*escribe dos*/dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str ="",str2="";
        while(!str.equals("stop")){
        str =br.readLine();
    
        dos.writeUTF(str);
        dos.flush();
        str2 = dis.readUTF();
        System.out.println("El sevidor dice"+str2);
    
    
    }
        dis.close();
        dos.close();
        s.close();
        
       
    }

   
}
